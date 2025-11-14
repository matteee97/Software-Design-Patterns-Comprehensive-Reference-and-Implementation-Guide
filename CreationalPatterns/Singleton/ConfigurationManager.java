package CreationalPatterns.Singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class ConfigurationManager {

    // Mappa delle configurazioni (non riassegnabile e thread-safe)
    private final Map<String, String> config = new ConcurrentHashMap<>();

    // Costruttore privato
    private ConfigurationManager() {
        System.out.println("ConfigurationManager instance created");
    }

    // Singleton Holder (lazy + thread-safe)
    private static class Holder {
        private static final ConfigurationManager INSTANCE = new ConfigurationManager();
    }

    public static ConfigurationManager getInstance() {
        return Holder.INSTANCE;
    }

    // -------------------------------
    // Metodi di gestione config
    // -------------------------------

    public void setConfig(String key, String value) {
        config.put(key, value);
    }

    public String getConfig(String key) {
        return config.get(key);
    }

    // Restituisce una copia read-only delle configurazioni
    public Map<String, String> getAllConfigs() {
        return Map.copyOf(config);
    }

    // -------------------------------
    // Caricamento da file
    // -------------------------------

    /**
     * Carica configurazioni da un file .properties
     * Esempio contenuto file:
     * theme=dark
     * language=it
     */
    public void loadFromFile(String filePath) {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream(filePath)) {
            properties.load(input);
            properties.forEach((key, value) -> config.put((String) key, (String) value));
            System.out.println("Configurazioni caricate da file: " + filePath);
        } catch (IOException e) {
            System.err.println("Errore durante il caricamento del file: " + e.getMessage());
        }
    }
}

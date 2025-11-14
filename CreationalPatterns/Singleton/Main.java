package CreationalPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();

        // Carico le configurazioni da file
        config.loadFromFile("config.properties");

        // Stampo alcune configurazioni
        System.out.println("Tema: " + config.getConfig("theme"));
        System.out.println("Lingua: " + config.getConfig("language"));
        System.out.println("Tutte le configurazioni: " + config.getAllConfigs());

        // Modifica runtime
        config.setConfig("theme", "light");
        System.out.println("Nuovo tema: " + config.getConfig("theme"));

        // Secondo accesso → stessa istanza
        ConfigurationManager config2 = ConfigurationManager.getInstance();
        System.out.println("Stessa istanza? " + (config == config2));
    }
}

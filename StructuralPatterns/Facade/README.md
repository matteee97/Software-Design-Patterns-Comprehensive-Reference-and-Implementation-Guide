# HackHub – Esercizio Facade Pattern

## Descrizione dell'esercizio

L'esercizio introduce l'utilizzo del **Facade Pattern** per semplificare il processo di caricamento delle sottomissioni da parte dei team all'interno della piattaforma HackHub.

Il caricamento di una sottomissione comporta diverse operazioni di back-end:

- Validazione del team
- Verifica della deadline
- Salvataggio del file
- Log dell’operazione
- Invio di notifiche allo staff

Senza un Facade, queste operazioni sarebbero esposte direttamente all'esterno, creando complessità e forte accoppiamento.  
Il **Facade Pattern** permette di offrire una **singola interfaccia semplice**, che nasconde la complessità dei sottosistemi interni.

---

## Obiettivi

- Nascondere la complessità del sistema di gestione delle sottomissioni.
- Ridurre l'accoppiamento tra i vari moduli interni.
- Offrire un metodo unico, chiaro e ad alto livello per caricare una sottomissione.
- Applicare correttamente il **principio SOLID Open/Closed**.

---

## Struttura dell'esercizio

L'esercizio è composto da:

### 1. **Sottosistemi**

Queste classi rappresentano le parti interne del sistema:

- `SubmissionValidator` → Verifica che il team sia iscritto e che la deadline non sia scaduta.
- `SubmissionRepository` → Simula il salvataggio del file della sottomissione.
- `LoggerService` → Registra le operazioni svolte.
- `NotificationService` → Invia notifiche allo staff.

### 2. **Facade**

La classe `SubmissionFacade` combina e orchestra i sottosistemi offrendo un unico metodo semplice:

```java
void caricaSottomissione(Team team, String file);
```

### 3. **Client**

Il codice che usa il Facade non deve conoscere nulla della logica interna.  
Questo riduce la complessità e rende il codice più modulare.

---

## Esempio di utilizzo

```java
public class Main {
    public static void main(String[] args) {
        SubmissionFacade facade = new SubmissionFacade();

        Team team = new Team("TheHackers", true, false);

        facade.caricaSottomissione(team, "progetto.zip");
    }
}
```

Output atteso:

```terminal
Salvataggio file 'progetto.zip' per il team TheHackers
[LOG] Sottomissione caricata dal team: TheHackers
Notifica: Nuova sottomissione da TheHackers
Upload completato con successo!
```

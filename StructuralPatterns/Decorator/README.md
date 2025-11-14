# HackHub – Esercizio Decorator Pattern

## Descrizione dell'esercizio

L'esercizio ha come obiettivo la gestione delle **notifiche ai membri del team** in HackHub, utilizzando il **Decorator Pattern** per aggiungere dinamicamente comportamenti extra senza modificare la classe base.

### Scenario

In HackHub, i membri del team devono ricevere notifiche riguardanti:

- Nuove richieste di supporto
- Aggiornamenti sulle scadenze dell’hackathon
- Risultati delle valutazioni dei giudici

All’inizio, la piattaforma ha una classe `NotificaBase` che invia una notifica standard (ad esempio stampando un messaggio su console).  
Si vogliono aggiungere funzionalità extra come **invio via email**, **SMS**, o **push notification**, senza cambiare `NotificaBase`.

Il **Decorator Pattern** permette di estendere dinamicamente il comportamento delle notifiche, combinando più tipi di invio in maniera flessibile.

---

## Requisiti dell'esercizio

1. Creare un’interfaccia `NotificaComponent` con metodo:

```java
void invia(String messaggio);
```

2. Implementare la classe concreta NotificaBase:

   - Invio standard della notifica (console log).

3. Creare almeno due Decorator:

   - NotificaEmail → invio email

   - NotificaSMS → invio SMS

   - (facoltativo: NotificaPush → push notification)

4. Consentire di combinare più decorator in modo dinamico:

```java
NotificaComponent notifica = new NotificaBase();
notifica = new NotificaEmail(notifica);
notifica = new NotificaSMS(notifica);

notifica.invia("Il tuo team ha una nuova richiesta di supporto!");
```

Esempio di output:

```
Notifica standard: Il tuo team ha una nuova richiesta di supporto!
Invio email: Il tuo team ha una nuova richiesta di supporto!
Invio SMS: Il tuo team ha una nuova richiesta di supporto!
```

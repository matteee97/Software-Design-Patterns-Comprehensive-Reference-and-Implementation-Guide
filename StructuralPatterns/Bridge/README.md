# Bridge Pattern – Sistema di Notifiche Multi-Canale

## Descrizione generale

Questo esercizio dimostra l’utilizzo del **Bridge Pattern** in un contesto realistico:  
un sistema di **notifiche universitarie** che può inviare messaggi attraverso diversi **canali di comunicazione** (Email, SMS, Push, ecc.).

Il problema principale da risolvere è la **combinazione esplosiva di classi** che si genera quando si uniscono più _tipi di notifiche_ con più _metodi di invio_.

Senza un’architettura adeguata, ogni nuova notifica o nuovo canale richiederebbe la creazione di numerose sottoclassi (es. `ExamEmailNotification`, `PaymentSMSNotification`, ecc.).  
Questo porta a **duplicazione del codice**, **bassa manutenibilità** e **scarsa estendibilità**.

---

## Obiettivo dell’esercizio

Progettare un sistema flessibile e scalabile che:

- **Separi il tipo di notifica dal canale di invio**.
- Permetta di **aggiungere nuove notifiche o nuovi canali indipendentemente**.
- Eviti la creazione di combinazioni multiple di sottoclassi rigide.

In sintesi: applicare il _Bridge Pattern_ per ottenere un’architettura pulita, modulare e facilmente estendibile.

---

## Soluzione tramite Bridge Pattern

### Struttura logica

Il **Bridge Pattern** separa due gerarchie:

- **Abstraction** → rappresenta _il tipo di notifica_ (`Notification`, `ExamNotification`, `PaymentNotification`).
- **Implementor** → rappresenta _il canale di comunicazione_ (`MessageSender`, `EmailSender`, `SMSSender`).

L’astrazione non conosce i dettagli dell’implementazione, ma la **usa tramite composizione**.  
In questo modo è possibile combinare qualsiasi _notifica_ con qualsiasi _canale_ **senza modificare codice esistente**.

---

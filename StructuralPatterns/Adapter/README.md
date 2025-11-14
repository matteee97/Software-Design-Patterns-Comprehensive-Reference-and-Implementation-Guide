# 🔌 Adapter Pattern – Integrazione Sistema di Pagamento Legacy

## 📘 Descrizione generale

Questo esercizio dimostra l’utilizzo dell’**Adapter Pattern** in un caso reale:  
integrare un **vecchio sistema di pagamento (legacy)** all’interno di una nuova applicazione e-commerce universitaria (**UniShop**).

Nel sistema esistono due componenti incompatibili:

- Il **nuovo sistema** utilizza l’interfaccia `PaymentProcessor` per gestire i pagamenti.
- Il **vecchio sistema** (`OldPaymentSystem`) fornisce un metodo diverso (`makeTransaction()`) e lavora in centesimi anziché in euro.

Poiché non è possibile modificare il codice del sistema legacy, è necessario introdurre un **Adapter** che traduca le chiamate tra le due interfacce.

---

## 🎯 Obiettivo dell’esercizio

L’obiettivo è:

- **Integrare codice legacy o di terze parti** senza modificarlo.
- **Rendere compatibili** due interfacce differenti (`PaymentProcessor` e `OldPaymentSystem`).
- Garantire la **flessibilità** del sistema mantenendo un’interfaccia coerente per il client (`ECommerceApp`).

In sintesi: l’Adapter Pattern consente di _“collegare due mondi diversi”_ senza cambiare il loro codice interno.

---

## 🧠 Soluzione tramite Adapter Pattern

### Struttura logica

Il pattern introduce una classe _Adapter_ che:

- Implementa l’interfaccia che il client si aspetta (`PaymentProcessor`).
- Contiene un riferimento all’oggetto esistente (`OldPaymentSystem`).
- Traduce le chiamate tra i due.

---

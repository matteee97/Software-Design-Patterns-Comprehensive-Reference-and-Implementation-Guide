# HackHub – Esercizio Composite Pattern

## Descrizione dell'esercizio

L'esercizio ha come obiettivo la gestione dei **task di un team** durante un hackathon, utilizzando il **Composite Pattern** per modellare task semplici e composti in modo uniforme.

### Scenario

In HackHub, ogni team ha una lista di task da completare per il progetto dell’hackathon.

- Alcuni task sono **semplici**, come "Scrivere codice backend".
- Altri task sono **composti**, ossia contengono più sotto-task, come "Preparare demo", che può includere "Codice backend", "UI/UX design" e "Presentazione".

Il Composite Pattern permette di trattare **task semplici e composti nello stesso modo**, semplificando la gestione e il calcolo dello stato di completamento.

---

## Requisiti dell'esercizio

1. Creare un’interfaccia `TaskComponent` con i seguenti metodi:

   - `void mostraDettagli()` → stampa il nome del task
   - `double calcolaCompletamento()` → ritorna la percentuale di completamento (0-100)

2. Implementare due classi:

   - `TaskSemplice` → rappresenta un singolo task
   - `TaskComposito` → rappresenta un task composto da uno o più `TaskComponent`

3. Consentire di:
   - Aggiungere e rimuovere task in `TaskComposito`
   - Stampare tutti i task ricorsivamente
   - Calcolare il completamento medio di tutti i sotto-task

---

## Esempio d'uso

```java
TaskComponent task1 = new TaskSemplice("Scrivere codice backend", 100);
TaskComponent task2 = new TaskSemplice("Design UI", 50);

TaskComposito demo = new TaskComposito("Preparare demo");
demo.aggiungi(task1);
demo.aggiungi(task2);

demo.mostraDettagli();
// Output:
// Preparare demo
//   Scrivere codice backend
//   Design UI

System.out.println(demo.calcolaCompletamento());
// Output: 75.0
```

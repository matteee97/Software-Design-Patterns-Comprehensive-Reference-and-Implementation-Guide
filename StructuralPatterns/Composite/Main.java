package StructuralPatterns.Composite;

public class Main {

    public static void main(String[] args) {
        TaskComponent task1 = new TaskSemplice("Scrivere codice backend", 100);
        TaskComponent task2 = new TaskSemplice("Design UI", 50);

        TaskComposito demo = new TaskComposito("Preparare demo");
        demo.add(task1);
        demo.add(task2);

        demo.mostraDettagli();

        System.out.println(demo.calcolaCompletamento());

    }
}

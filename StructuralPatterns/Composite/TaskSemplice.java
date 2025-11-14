package StructuralPatterns.Composite;

public class TaskSemplice implements TaskComponent {
    private String name;
    private double completamento;

    public TaskSemplice(String name, double completamento) {
        this.name = name;
        this.completamento = completamento;
    }

    public double calcolaCompletamento() {
        return completamento;
    }

    public void mostraDettagli() {
        System.out.println(name);
    }
}

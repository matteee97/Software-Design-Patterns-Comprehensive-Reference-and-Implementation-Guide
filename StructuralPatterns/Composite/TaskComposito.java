package StructuralPatterns.Composite;

import java.util.ArrayList;

public class TaskComposito implements TaskComponent {

    private String name;
    private ArrayList<TaskComponent> tasks;

    public TaskComposito(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public void add(TaskComponent task) {
        tasks.add(task);
    }

    public void remove(TaskComponent task) {
        tasks.remove(task);
    }

    public void mostraDettagli() {
        System.out.println(name);
        for (TaskComponent task : tasks) {
            task.mostraDettagli();
        }
    }

    public double calcolaCompletamento() {
        double completamento = 0;
        for (TaskComponent task : tasks) {
            completamento += task.calcolaCompletamento();
        }
        return completamento == 0 ? 0 : completamento / tasks.size();
    }

}

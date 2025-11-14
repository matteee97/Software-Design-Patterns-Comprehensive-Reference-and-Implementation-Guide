package StructuralPatterns.Facade;

public class Team {

    private String name;
    private boolean isSubscribed;
    private boolean isDeadlinePassed;

    public Team(String name, boolean isSubscribed, boolean isDeadlinePassed) {
        this.isDeadlinePassed = isDeadlinePassed;
        this.isSubscribed = isSubscribed;
        this.name = name;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public boolean isDeadlinePassed() {
        return isDeadlinePassed;
    }

    public String getName() {
        return name;
    }

}

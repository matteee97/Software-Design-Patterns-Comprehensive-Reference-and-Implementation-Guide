package StructuralPatterns.Facade;

public class SubmissionValidator {

    public boolean isValid(Team team) {
        return team.isSubscribed() && !team.isDeadlinePassed();
    }

}

package StructuralPatterns.Facade;

public class Main {
    public static void main(String[] args) {
        SubmissionFacade facade = new SubmissionFacade();

        Team team = new Team("TheHackers", true, false);

        facade.caricaSottomissione(team, "progetto.zip");
    }
}
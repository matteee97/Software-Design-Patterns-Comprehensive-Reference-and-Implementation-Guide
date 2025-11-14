package StructuralPatterns.Facade;

import StructuralPatterns.Decorator.NotificaBase;
import StructuralPatterns.Decorator.NotificaComponent;
import StructuralPatterns.Decorator.NotificaEmail;
import StructuralPatterns.Decorator.NotificaSMS;

public class SubmissionFacade {

    private SubmissionRepository repo;
    private SubmissionValidator validator;
    private LoggerService logger;
    private NotificaComponent notifica;

    public SubmissionFacade() {
        this.repo = new SubmissionRepository();
        this.validator = new SubmissionValidator();
        this.logger = new LoggerService();
        this.notifica = new NotificaSMS(new NotificaEmail(new NotificaBase()));
    }

    public void caricaSottomissione(Team team, String string) {
        if (validator.isValid(team)) {
            repo.saveSubmission(string);
            logger.log("Sottomissione caricata con successo");
            notifica.invia("Nuova sottomissione da parte del team: " + team.getName());
        } else {
            logger.log("Sottomissione non caricata");
        }
    }

}

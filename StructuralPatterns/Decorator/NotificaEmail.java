package StructuralPatterns.Decorator;

public class NotificaEmail extends BaseNotifierDecorator {
    public NotificaEmail(NotificaComponent notifica) {
        super(notifica);
    }

    @Override
    public void invia(String messaggio) {
        super.invia(messaggio);
        System.out.println("Invio notifica email: " + messaggio);
    }

}

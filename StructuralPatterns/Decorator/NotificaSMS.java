package StructuralPatterns.Decorator;

public class NotificaSMS extends BaseNotifierDecorator {
    public NotificaSMS(NotificaComponent notifica) {
        super(notifica);
    }

    @Override
    public void invia(String messaggio) {
        super.invia(messaggio);
        System.out.println("Invio notifica SMS: " + messaggio);
    }
}

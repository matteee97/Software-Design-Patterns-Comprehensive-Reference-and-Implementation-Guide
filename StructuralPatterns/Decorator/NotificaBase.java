package StructuralPatterns.Decorator;

public class NotificaBase implements NotificaComponent {
    @Override
    public void invia(String messaggio) {
        System.out.println("Invio notifica base: " + messaggio);
    }

}

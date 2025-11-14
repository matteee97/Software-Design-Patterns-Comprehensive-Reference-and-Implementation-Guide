package StructuralPatterns.Decorator;

public abstract class BaseNotifierDecorator implements NotificaComponent {
    private NotificaComponent component;

    public BaseNotifierDecorator(NotificaComponent notifica) {
        this.component = notifica;
    }

    @Override
    public void invia(String messaggio) {
        component.invia(messaggio);
    }
}

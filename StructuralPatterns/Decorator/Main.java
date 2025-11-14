package StructuralPatterns.Decorator;

public class Main {
    public static void main(String[] args) {
        NotificaComponent notifica = new NotificaEmail(new NotificaSMS(new NotificaBase()));
        notifica.invia("Il tuo team ha una nuova richiesta di supporto!");

    }
}

package StructuralPatterns.Adapter;

public class OldPaymentSystem {
    public void makeTransaction(int cents) {
        System.out.println("Pagamento effettuato di " + cents + " centesimi tramite sistema legacy.");
    }
}

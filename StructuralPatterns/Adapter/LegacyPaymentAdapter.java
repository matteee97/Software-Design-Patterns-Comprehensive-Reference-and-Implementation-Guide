package StructuralPatterns.Adapter;

public class LegacyPaymentAdapter implements PaymentProcessor {
    private OldPaymentSystem paymentSystem;

    public LegacyPaymentAdapter(OldPaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    @Override
    public void pay(double amount) {
        int cents = (int) (amount * 100);
        paymentSystem.makeTransaction(cents);
    }
}

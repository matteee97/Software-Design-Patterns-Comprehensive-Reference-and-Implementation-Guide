package StructuralPatterns.Adapter;

public class Main {

    public static void main(String[] args) {
        OldPaymentSystem legacy = new OldPaymentSystem();
        PaymentProcessor adapter = new LegacyPaymentAdapter(legacy);

        adapter.pay(24.99);
    }
}

// Usage
public class Demo {
    public static void main(String[] args) {
        Notifier notifier = new Notifier(new ImmediateDelivery());
        notifier.notify("Welcome!", "alice@example.com");

        BatchDelivery batch = new BatchDelivery();
        notifier.setStrategy(batch);
        notifier.notify("Promo: 10% off", "+15551234567");
        notifier.notify("Security alert", "banari@example.com");
        batch.flush();
    }
}
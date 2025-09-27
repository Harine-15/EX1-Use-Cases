// Context that uses a DeliveryStrategy
public class Notifier {
    private DeliveryStrategy strategy;

    public Notifier(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void notify(String message, String recipient) {
        strategy.deliver(message, recipient);
    }
}
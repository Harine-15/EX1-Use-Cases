// Concrete strategy: immediate delivery
public class ImmediateDelivery implements DeliveryStrategy {
    @Override
    public void deliver(String message, String recipient) {
        // pretend sending now
        System.out.println("Sending to " + recipient + ": " + message + " (immediate)");
    }
}
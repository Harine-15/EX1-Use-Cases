// Concrete product
public class PushChannel extends NotificationChannel {
    @Override
    public void send(String to, String message) {
        System.out.println("Push to " + to + ": " + message);
    }
}
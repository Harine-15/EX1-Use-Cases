// Concrete product
public class EmailChannel extends NotificationChannel {
    @Override
    public void send(String to, String message) {
        System.out.println("Email to " + to + ": " + message);
    }
}
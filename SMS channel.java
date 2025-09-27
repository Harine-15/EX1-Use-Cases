// Concrete product
public class SMSChannel extends NotificationChannel {
    @Override
    public void send(String to, String message) {
        System.out.println("SMS to " + to + ": " + message);
    }
}
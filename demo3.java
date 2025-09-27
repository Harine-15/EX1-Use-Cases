// Usage example (alternative main)
public class Demo {
    public static void main(String[] args) {
        // Using the client helper with Email
        ChannelFactory emailFactory = new EmailFactory();
        NotificationChannel email = emailFactory.createChannel();
        email.send("alice@example.com", "Welcome!");

        // Using the client helper with Push
        ChannelFactory pushFactory = new PushFactory();
        NotificationChannel push = pushFactory.createChannel();
        push.send("alice_device_token", "New alert!");

        // Optional: direct factory in one place
        NotificationChannel directEmail = new EmailChannel();
        directEmail.send("bob@example.com", "Hi Bob!");
    }
}
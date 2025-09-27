// Client-side helper (optional): demonstrates using a factory to get a channel
public class Client {
    public static NotificationChannel createChannelViaFactory(ChannelFactory factory) {
        return factory.createChannel();
    }

    public static void main(String[] args) {
        NotificationChannel ch = createChannelViaFactory(new EmailFactory());
        ch.send("alice@example.com", "You have a new message");

        ch = createChannelViaFactory(new SMSFactory());
        ch.send("+15550000000", "Your code is 1234");
    }
}
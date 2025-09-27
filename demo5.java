// Usage
public class Demo {
    public static void main(String[] args) {
        try {
            BaseChannel channel = new EmailChannel();
            BaseChannel logged = new LoggingDecorator(channel);
            BaseChannel resilient = new RetryDecorator(logged, 2);

            resilient.send("alice@example.com", "Decorator pattern in action");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
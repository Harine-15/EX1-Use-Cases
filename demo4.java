// Usage example
public class Demo {
    public static void main(String[] args) {
        LegacyNotificationService legacy = new LegacyNotificationService();
        NotificationAdapter adapter = new NotificationAdapter(legacy);

        adapter.connect();
        adapter.send("alice@example.com", "Hello adapter welcome!!!!!!");
    }
}
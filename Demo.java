import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Subject system = new Subject();
        EmailObserver alice = new EmailObserver("alice@example.com");
        LoggerObserver logger = new LoggerObserver();

        // Subscriptions
        system.subscribe("friend_request", alice);
        system.subscribe("friend_request", logger);
        system.subscribe("system_maintenance", logger);

        // Publications
        Map<String, String> frData = new HashMap<>();
        frData.put("from", "charles");
        system.publish("friend_request", frData);

        Map<String, String> maintData = new HashMap<>();
        maintData.put("window", "02:00-03:00 UTC");
        system.publish("system_maintenance", maintData);

        // Unsubscribe example
        system.unsubscribe("friend_request", alice);
        system.publish("friend_request", Map.of("from", "david"));
    }
}
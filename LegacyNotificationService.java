// Structural: Adapter - Legacy service (the "adaptee")
public class LegacyNotificationService {
    public void connect() {
        System.out.println("Legacy connected");
    }

    public void sendLegacy(String to, String msg) {
        System.out.println("Legacy send to " + to + ": " + msg);
    }
}
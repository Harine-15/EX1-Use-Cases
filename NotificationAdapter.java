// Structural: Adapter - Adapter that adapts LegacyNotificationService to the new interface
public class NotificationAdapter {
    private final LegacyNotificationService legacy;

    public NotificationAdapter(LegacyNotificationService legacy) {
        this.legacy = legacy;
    }

    public void connect() {
        legacy.connect();
    }

    public void send(String to, String msg) {
        // adapt to the legacy method
        legacy.sendLegacy(to, msg);
    }
}
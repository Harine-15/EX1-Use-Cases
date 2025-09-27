// Concrete creator
public class SMSFactory extends ChannelFactory {
    @Override
    public NotificationChannel createChannel() {
        return new SMSChannel();
    }
}
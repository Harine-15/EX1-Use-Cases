// Concrete creator
public class EmailFactory extends ChannelFactory {
    @Override
    public NotificationChannel createChannel() {
        return new EmailChannel();
    }
}
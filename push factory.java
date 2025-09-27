// Concrete creator
public class PushFactory extends ChannelFactory {
    @Override
    public NotificationChannel createChannel() {
        return new PushChannel();
    }
}
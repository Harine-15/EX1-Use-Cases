// Structural: Decorator - Concrete decorator for logging
public class LoggingDecorator extends ChannelDecorator {
    public LoggingDecorator(BaseChannel wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String to, String message) throws Exception {
        System.out.println("LOG: sending to " + to);
        super.send(to, message);
    }
}
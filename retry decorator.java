// Structural: Decorator - Concrete decorator with retry
public class RetryDecorator extends ChannelDecorator {
    private final int retries;

    public RetryDecorator(BaseChannel wrapped, int retries) {
        super(wrapped);
        this.retries = retries;
    }

    @Override
    public void send(String to, String message) throws Exception {
        int attempt = 0;
        while (attempt <= retries) {
            try {
                super.send(to, message);
                return;
            } catch (Exception e) {
                attempt++;
                if (attempt > retries) throw e;
            }
        }
    }
}
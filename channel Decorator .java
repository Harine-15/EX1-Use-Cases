// Structural: Decorator - Decorator base
public abstract class ChannelDecorator extends BaseChannel {
    protected final BaseChannel wrapped;

    public ChannelDecorator(BaseChannel wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void send(String to, String message) throws Exception {
        wrapped.send(to, message);
    }
}
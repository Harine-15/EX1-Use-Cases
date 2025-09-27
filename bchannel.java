// Structural: Decorator - Base component
public abstract class BaseChannel {
    public abstract void send(String to, String message) throws Exception;
}
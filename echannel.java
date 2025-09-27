// Structural: Decorator - Concrete component
public class EmailChannel extends BaseChannel {
    @Override
    public void send(String to, String message) {
        System.out.println("Email to " + to + ": " + message);
    }
}
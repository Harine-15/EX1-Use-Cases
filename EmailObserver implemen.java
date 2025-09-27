public class EmailObserver implements Observer {
    private final String email;

    public EmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, Object data) {
        System.out.println("Email to " + email + ": [" + eventType + "] " + data.toString());
    }
}
public class LoggerObserver implements Observer {
    @Override
    public void update(String eventType, Object data) {
        System.out.println("Log: " + eventType + " - " + data.toString());
    }
}
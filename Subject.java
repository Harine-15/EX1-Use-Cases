import java.util.*;

public class Subject {
    private final Map<String, List<Observer>> observers = new HashMap<>();

    public void subscribe(String eventType, Observer observer) {
        observers.computeIfAbsent(eventType, k -> new ArrayList<>()).add(observer);
    }

    public void unsubscribe(String eventType, Observer observer) {
        List<Observer> list = observers.get(eventType);
        if (list == null) return;
        list.remove(observer);
    }

    public void publish(String eventType, Object data) {
        List<Observer> list = observers.getOrDefault(eventType, Collections.emptyList());
        for (Observer ob : list) {
            ob.update(eventType, data);
        }
    }
}
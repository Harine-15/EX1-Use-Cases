import java.util.ArrayList;
import java.util.List;

 // Concrete strategy: batched delivery
 public class BatchDelivery implements DeliveryStrategy {
     private final List<DeliveryItem> queue = new ArrayList<>();

     private static class DeliveryItem {
         String message;
         String recipient;
         DeliveryItem(String m, String r) { this.message = m; this.recipient = r; }
     }

     @Override
     public void deliver(String message, String recipient) {
         queue.add(new DeliveryItem(message, recipient));
     }

     public void flush() {
         System.out.println("Flushing batch:");
         for (DeliveryItem item : queue) {
             System.out.println("Sending to " + item.recipient + ": " + item.message + " (batched)");
         }
         queue.clear();
     }
 }
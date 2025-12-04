import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueEksempel {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

        // Producer
        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.put("Item " + i); // venter hvis full
                    System.out.println("Produsert: Item " + i);
                }
            } catch (InterruptedException e) {}
        }).start();

        // Consumer
        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    String item = queue.take(); // venter hvis tom
                    System.out.println("Konsumert: " + item);
                }
            } catch (InterruptedException e) {}
        }).start();
    }
}

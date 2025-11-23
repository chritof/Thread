import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>(5);

        Thread producer = new Thread(new Producer(blockingDeque));
        Thread consumer = new Thread(new Consumer(blockingDeque));

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}

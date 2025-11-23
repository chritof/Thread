import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String item = queue.take();

                if(item.equals("DONE")) {
                    System.out.println("Consumer: mottatt DONE. Stopper");
                    break;
                }
                System.out.println("Consumer: hentet -> " + item);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

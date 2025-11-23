import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i <= 20; i++) {
                String item = "Item " + i;
                queue.put(item);
                System.out.println("Producer: la i køen -> " + item);
                Thread.sleep(300);
            }
            queue.put("DONE");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

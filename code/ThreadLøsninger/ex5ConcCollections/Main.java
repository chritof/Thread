
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) throws InterruptedException{

        /*
         * Se
         * https://docs.oracle.com/javase/8/docs/api/?java/util/concurrent/package-summary.html
         *
         * A Queue that additionally supports operations that wait for the
         * queue to become non-empty when retrieving an element, and wait
         * for space to become available in the queue when storing an element.
         */
        BlockingQueue<String> bq = new LinkedBlockingQueue<>(3); //Plass til maks 3

        /*
         * Kan være delt ressurs mellom tråder. Køen blokkerer (setter tråd på wait)
         * tråder som prøver å ta ut element fra tom kø, og tråder som prøver å
         * legge til element i full kø. Kø med automatisk wait/notify (evt. await/signal)
         * rett ut av boksen. :)
         */

        Thread producer = new Thread(){
            @Override
            public void run() {
                try {
                    for (int i=1; i<=10; i++) {
//						bq.add("" + i + ". mann i køen."); // Samme som i Queue
//						bq.offer("" + i + ". mann i køen.");
                        bq.put("" + i + ". mann i køen.");
                        System.out.println("lagt inn i kø");
                        Thread.sleep(800);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread consumer = new Thread(){
            @Override
            public void run() {
                try {
                    for (int i=1; i<=10; i++) {
//						System.out.println(bq.remove()); // Samme som i Queue
//						System.out.println(bq.poll());   // Samme som i Queue
                        System.out.println(bq.take());
                        Thread.sleep(8000);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        producer.start(); consumer.start();
        producer.join(); consumer.join();
        System.out.println("Ferdig...! (denne kjøres til slutt fordi vi har join på trådene, noe som gjrø at main tåden ");
    }

}

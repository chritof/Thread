import java.util.concurrent.atomic.AtomicInteger;


public class AtomicIntegerEksempel {

    public static void main(String[] args) throws Exception {
        AtomicInteger count = new AtomicInteger(0);

        Thread t1 = new Thread(() -> { for(int i=0;i<10000;i++) count.incrementAndGet(); });
        Thread t2 = new Thread(() -> { for(int i=0;i<10000;i++) count.incrementAndGet(); });

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Resultat: " + count.get()); // alltid 20000
    }
}

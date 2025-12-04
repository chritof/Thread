import java.util.concurrent.locks.ReentrantLock;

class Counter2 {
    private int value = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            value++;
        } finally {
            lock.unlock();
        }
    }

    public int get() {
        lock.lock();
        try {
            return value;
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockEksempel {

    public static void main(String[] args) throws InterruptedException{
        Counter2 counter = new Counter2();

        Thread t1 = new Thread(() -> {for (int i = 0; i < 10000; i++) {counter.increment();}});
        Thread t2 = new Thread(() -> {for(int i = 0; i < 10000; i++) {counter.increment();}});

        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Resultat: " + counter.get());
    }
}

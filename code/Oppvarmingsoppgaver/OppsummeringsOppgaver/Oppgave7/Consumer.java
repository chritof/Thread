package Oppgave7;

public class Consumer implements Runnable {

    Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            int verdi = buffer.take();
            System.out.println("Konsument hentet: " + verdi);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {}
        }
    }
}

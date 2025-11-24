package Oppgave7;

public class Producer implements Runnable {

    Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.put(i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {}
        }
    }

}

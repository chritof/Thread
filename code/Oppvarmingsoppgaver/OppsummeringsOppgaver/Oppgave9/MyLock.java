package Oppgave9;

public class MyLock {

    private boolean locked = false;

    public synchronized void lock() throws InterruptedException {
        // hvis allerede låst → vent
        // ellers sett locked = true
    }

    public synchronized void unlock() {
        // sett locked = false
        // notifyAll()
    }


}

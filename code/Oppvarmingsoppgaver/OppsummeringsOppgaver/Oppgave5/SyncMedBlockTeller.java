package Oppgave5;

public class SyncMedBlockTeller {
    private int verdi = 0;
    private final Object lås = new Object();

    public void øk() {
        synchronized (lås) {
            verdi++;
        }
    }

    public void senk() {
        synchronized (lås) {
            verdi--;
        }
    }

    public int getVerdi() {
        return verdi;
    }
}

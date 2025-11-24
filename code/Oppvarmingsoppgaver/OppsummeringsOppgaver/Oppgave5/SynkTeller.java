package Oppgave5;

public class SynkTeller {
    private int verdi = 0;

    public synchronized void øk() {
        verdi++;
    }

    public synchronized void senk() {
        verdi--;
    }

    public int getVerdi() {
        return verdi;
    }
}
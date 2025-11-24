package Oppgave5;

public class SenkTraad implements Runnable {

    SyncMedBlockTeller teller;

    public SenkTraad(SyncMedBlockTeller teller) {
        this.teller = teller;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            teller.senk();
        }
    }
}

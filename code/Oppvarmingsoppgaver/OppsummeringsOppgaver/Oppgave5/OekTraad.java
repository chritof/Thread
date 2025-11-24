package Oppgave5;

public class OekTraad implements Runnable {

    SyncMedBlockTeller teller;

    public OekTraad(SyncMedBlockTeller teller) {
        this.teller = teller;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            teller.øk();
        }
    }
}

package Oppgave5;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        SyncMedBlockTeller teller = new SyncMedBlockTeller();

        Thread t1 = new Thread(new OekTraad(teller));
        Thread t2 = new Thread(new SenkTraad(teller));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Forventet verdi: 0");
        System.out.println("Faktisk verdi: " + teller.getVerdi());

    }
}

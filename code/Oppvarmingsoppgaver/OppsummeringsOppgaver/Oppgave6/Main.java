package Oppgave6;

public class Main {
    Melding melding = new Melding();

    public static void main(String[] args) {
        Melding melding = new Melding();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Mottaker venter på melding...");
                System.out.println("Mottaker fikk: " + melding.hent());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e) {}
                melding.setTekst("Hei fra sender!");
            }
        });

        t1.start();
        t2.start();

    }
}

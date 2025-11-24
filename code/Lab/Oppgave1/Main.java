package Oppgave1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Melding melding = new Melding();

        Thread leser = new Thread(new Leser(melding));
        Thread skriver = new Thread(new Skriver(melding));

        leser.start();
        skriver.start();

        leser.join();
        skriver.join();
    }
}

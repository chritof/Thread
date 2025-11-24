package Oppgave2.BlockingQueueVersjon;

public class Kokk extends Thread {

    private final String navn;
    private final HamburgerBrett brett;

    public Kokk(HamburgerBrett brett, String navn) {
        this.navn = navn;
        this.brett = brett;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            Hamburger hamburger = new Hamburger(i); // evt. egen global teller om du vil
            brett.leggTil(hamburger, navn);
            sovMellom2Og6Sek();
        }
    }

    private void sovMellom2Og6Sek() {
        int millis = 2000 + (int)(Math.random() * 4001); // 2000–6000 ms
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            interrupt();
        }
    }
}

package Oppgave2.BlockingQueueVersjon;

public class Servitor extends Thread {

    private final String navn;
    private final HamburgerBrett brett;

    public Servitor(HamburgerBrett brett, String navn) {
        this.navn = navn;
        this.brett = brett;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            brett.taUt(navn);
            sovMellom2Og6Sek();
        }
    }

    private void sovMellom2Og6Sek() {
        int millis = 2000 + (int)(Math.random() * 4001);
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            interrupt();
        }
    }
}

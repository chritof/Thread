package Oppgave2.BlockingQueueVersjon;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class HamburgerBrett {

    private final BlockingQueue<Hamburger> brett;

    public HamburgerBrett(int kapasitet) {
        this.brett = new ArrayBlockingQueue<>(kapasitet);
    }

    public void leggTil(Hamburger hamburger, String kokk) {
        try {
            // Blokkerer automatisk hvis brettet er fullt
            brett.put(hamburger);
            System.out.println(kokk + " (kokk) legger på hamburger "
                    + hamburger + ". Brett: " + brett);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void taUt(String servitor) {
        try {
            // Blokkerer automatisk hvis brettet er tomt
            Hamburger hamburger = brett.take();
            System.out.println(servitor + " (servitør) tar av hamburger "
                    + hamburger + ". Brett: " + brett);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

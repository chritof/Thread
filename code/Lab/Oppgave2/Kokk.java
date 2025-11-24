package Oppgave2;

public class Kokk extends Thread {


    String navn;
    HamburgerBrett brett;

    public Kokk(HamburgerBrett brett, String navn) {
        this.navn = navn;
        this.brett = brett;
    }



    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Hamburger hamburger = brett.nyHamburger();
            brett.leggTil(hamburger, navn);
            int millis = 2000 + (int)(Math.random() * 4001); // 2000–6000 ms
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                return;
            }
        };
    }
}

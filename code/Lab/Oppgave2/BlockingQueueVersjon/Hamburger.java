package Oppgave2.BlockingQueueVersjon;

public class Hamburger {

    final int ordre;

    public Hamburger(int ordre) {
        this.ordre = ordre;
    }

    @Override
    public String toString() {
        return "◖" + ordre + "◗";
    }
}

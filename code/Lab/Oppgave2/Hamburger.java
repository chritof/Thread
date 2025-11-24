package Oppgave2;

public class Hamburger {

    int ordre;

    public Hamburger(int ordre) {
        this.ordre = ordre;
    }

    @Override
    public String toString() {
        return "◖" + ordre + "◗";
    }
}

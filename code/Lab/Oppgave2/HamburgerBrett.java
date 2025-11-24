package Oppgave2;

import java.util.ArrayList;
import java.util.List;

public class HamburgerBrett {
    int MAKSKAPASITET;
    List<Hamburger> hamburgerList = new ArrayList<Hamburger>(MAKSKAPASITET);
    private int nesteOrdre = 1;


    public HamburgerBrett(int MAKSKAPASITET) {
        this.MAKSKAPASITET = MAKSKAPASITET;
    }


    public synchronized void leggTil(Hamburger hamburger, String kokk) {
        while (hamburgerList.size() >= MAKSKAPASITET) {
            try {
                wait();
            }catch (InterruptedException e) {}
        }
        hamburgerList.add(hamburger);
        System.out.println(kokk + "(kokk) legger på hamburger ◖" + hamburger.ordre+"◗ Brett: "+ hamburgerList.toString());
        notifyAll();
    }

    public synchronized void taUt(String servitor) {
        while (hamburgerList.isEmpty()) {
            try {
                wait();
            }catch (InterruptedException e) {}
        }
        Hamburger klarHamburger = hamburgerList.get(0);
        hamburgerList.remove(0);
        System.out.println(servitor + " (servitør) tar av hamburger ◖" + klarHamburger.ordre+"◗ Brett: " + hamburgerList.toString());
        notifyAll();
    }

    public synchronized Hamburger nyHamburger() {
        return new Hamburger(nesteOrdre++);
    }


}
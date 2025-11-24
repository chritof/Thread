package Oppgave7;

public class Buffer {
    private Integer verdi = null; // null = tom, ikke-null = full

    public synchronized void put(int nyVerdi) {
        // hvis full → vent
        // ellers sett verdi og notifyAll()
        while (verdi != null) {
            try{
                wait();
            }catch (InterruptedException e){}
        }
        verdi = nyVerdi;
        notifyAll();

    }

    public synchronized int take() {
        // hvis tom → vent
        // ellers hent verdi, sett verdi = null, notifyAll(), returner tall
        while (verdi == null) {
            try {
                wait();
            }catch (InterruptedException e){}
        }
        int nyVerdi = verdi;
        verdi = null;
        notifyAll();
        return nyVerdi;
    }
}

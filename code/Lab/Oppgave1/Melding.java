package Oppgave1;

public class Melding {

    String tekst = null;

    public synchronized void setTekst(String tekst) {
       this.tekst = tekst;
       notifyAll();
    }

    public synchronized String getTekst() {
        while (tekst == null) {
            try {
                wait();
            }catch (InterruptedException e) {}
        }
        notifyAll();
        return tekst;
    }
}

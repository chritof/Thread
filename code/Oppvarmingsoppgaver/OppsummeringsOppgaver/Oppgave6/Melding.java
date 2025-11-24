package Oppgave6;

public class Melding {

    private String tekst = null;

    public synchronized String hent() {
        while (tekst == null) {
            try{
                wait();
            }catch (InterruptedException e){}
        }
        String sendTekst = tekst;
        tekst = null;
        return sendTekst;
    }

    public synchronized void setTekst(String tekst) {
        this.tekst = tekst;
        notifyAll();
    }
}

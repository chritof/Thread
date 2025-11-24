package Oppgave1;
import javax.swing.*;

public class Leser implements Runnable {

    Melding melding;

    public Leser(Melding melding) {
        this.melding = melding;
    }

    @Override
    public void run() {
        int i = 0;
        while(i < 1) {
            String navn = JOptionPane.showInputDialog("Skriv din melding: ");
            melding.setTekst(navn);
            if(navn.equals("quit")){
                break;
            }
        }
    }

}

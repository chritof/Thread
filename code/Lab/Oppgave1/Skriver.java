package Oppgave1;

public class Skriver implements Runnable {

    Melding melding;

    public Skriver(Melding melding) {
        this.melding = melding;
    }

    @Override
    public void run() {
        int i = 0;
        while(i < 1){
            String skrivUt = melding.getTekst();
            if(skrivUt.equals("quit")){
                break;
            }
            System.out.println(skrivUt);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }

}

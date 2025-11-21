
public class TelleNedTraad extends Thread{

    private TellerSyncInt teller;
    private int antallGanger;

    public TelleNedTraad(TellerSyncInt teller, int antallGanger) {
        this.teller = teller;
        this.antallGanger = antallGanger;
    }

    @Override
    public void run(){
        for (int i = 0; i < antallGanger; i++){
            //kritisk seksjon
            teller.tellNed();
        }
    }

}

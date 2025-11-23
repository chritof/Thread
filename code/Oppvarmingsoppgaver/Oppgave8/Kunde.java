public class Kunde extends Thread{
    private Barbersalong salong;
    private String navn;

    public Kunde(Barbersalong salong, String navn){
        this.salong = salong;
        this.navn = navn;
    }

    @Override
    public void run(){
        salong.ankomKunde(navn);
    }
}

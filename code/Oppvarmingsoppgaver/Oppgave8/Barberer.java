public class Barberer extends Thread{
    private Barbersalong salong;
    public Barberer(Barbersalong salong){
        this.salong = salong;
    }

    @Override
    public void run(){
        while(true){
            salong.barberKunde();
        }
    }
}

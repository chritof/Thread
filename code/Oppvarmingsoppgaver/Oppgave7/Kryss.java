public class Kryss {

    private boolean opptatt = false;


    public synchronized void kjørInn(String bilNavn){
        try {
            while(opptatt){
                wait();
            }
        }catch(InterruptedException e){}
        opptatt = true;
        System.out.println(bilNavn + " kjører inn i krysset...");
    }

    public synchronized void kjørUt(String bilNavn){
        opptatt = false;
        notifyAll();
        System.out.println(bilNavn + "har kjørt ut av krysset");
    }
}

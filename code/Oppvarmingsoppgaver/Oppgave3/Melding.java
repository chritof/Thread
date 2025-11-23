public class Melding {

    private String melding;

    public synchronized void setMelding(String melding){
        this.melding = melding;
        notifyAll();
    };

    public synchronized String getMelding(){
        while(melding == null){
            try {
                wait();
            }catch(InterruptedException e){}
            }
        return melding;
    };

    public synchronized String peekMelding() {
        return melding;
    };
}

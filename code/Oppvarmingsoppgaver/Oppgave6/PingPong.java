

public class PingPong {

    private boolean erPing = true;

    public synchronized void ping(){
        try {
            while (!erPing){
                wait();
            }
        }catch(InterruptedException e){}
        System.out.println("Ping");
        erPing = false;
        notify();
    }

    public synchronized void pong(){
        try {
            while (erPing){
                wait();
            }
        }catch(InterruptedException e){}
        System.out.println("Pong");
        erPing = true;
        notify();
    }
}

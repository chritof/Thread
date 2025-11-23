import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Barbersalong {

    private BlockingQueue<String> queue;
    private boolean ledig = true;
    private int n;

    public Barbersalong(int n) {
        this.n = n;
        queue = new LinkedBlockingQueue<>(n);
    }

    public void ankomKunde(String kunde){

    }

    public void barberKunde(){

    }
}

import java.util.concurrent.atomic.AtomicInteger;

public class SynkTeller {

    //alternativ 1+2
    //int verdi = 0;

    //alternativ3:
    private AtomicInteger verdi = new AtomicInteger(0);


    //alternativ 1:
    //public void tellOpp(){
    //    synchronized (this) {
    //        verdi++;
    //    }
    //}


    //alternativ 2
    //public synchronized void tellOpp() {
     //   verdi++;
    //}

    //alternativ 3:
    public void tellOpp() {
        verdi.incrementAndGet();
    }

    //alternativ 3:
    public int getVerdi() {
        return verdi.get();
    }


    //alternativ 1+2
    //public int getVerdi() {
    //    return verdi;
    //}
}

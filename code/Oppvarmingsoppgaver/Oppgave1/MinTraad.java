

public class MinTraad implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hei fra " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){}
        }
    }
}

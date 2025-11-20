
class MinRunnable implements Runnable {
    @Override
    public void run() {
        String traadnavn = Thread.currentThread().getName();
        System.out.println("Hallo fra: " + traadnavn);
    }
}

public class TraaderMedNavnMain {
    public static void main(String[] args) {
        Runnable minRunnable = new MinRunnable();

        for (int i = 1; i <=10; i++){
            Thread t = new Thread(minRunnable, "tråd nr " + i);
            t.start();
        }

        System.out.println("Hallo fra: " + Thread.currentThread().getName());

    }
}
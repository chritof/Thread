public class OppretteTraaderMain {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new MinTraad();

        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("Hallo fra anonym Thread");
            }
        };

        Thread t3 = new Thread(new MinRunnable());

        Thread t4 = new Thread(() -> System.out.println("Hallo fra lambda Runnable"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // dette er main tråden
        System.out.println("Hello fra main");
    }
}

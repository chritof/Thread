public class MinTraad1 extends Thread {
    @Override
    public void run() {
        System.out.println("Tråden kjører!");

        while (true) {
            try {
                Thread.sleep(5000); // riktig!
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Tråden kjører!");
        }
    }
}
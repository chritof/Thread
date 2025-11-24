import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TellendeTraad tellendeTraad = new TellendeTraad();
        Thread t1 = new Thread(tellendeTraad);

        t1.start();

        // La tråden telle litt
        sleep(2000); // 2 sekunder

        // Be tråden stoppe
        tellendeTraad.stopRequested = true;

        // Vent til tråden faktisk er ferdig
        t1.join();

        System.out.println("Tråd stoppet!");
    }
}

public class TellendeTraad implements Runnable{

    public volatile boolean stopRequested = false;

    @Override
    public void run() {
        int i = 0;
        while (!stopRequested) {
            System.out.println(i);
            i++;
            try {
                Thread.sleep(300); // eller 500 ms, begge er OK så lenge det er "litt pause"
            } catch (InterruptedException e) {
                // Hvis vi blir avbrutt, avslutter vi bare tråden
                return;
            }
        }
        System.out.println("TellendeTraad avslutter.");
    }
}

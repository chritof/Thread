public class PrinterRunnable implements Runnable {
    @Override
    public void run() {
        String navn = Thread.currentThread().getName();

        for (int i = 0; i < 5; i++) {
            System.out.println("Jeg er tråd: <" + navn + ">");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

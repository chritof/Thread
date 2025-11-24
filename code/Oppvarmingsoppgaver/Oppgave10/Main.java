public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new PrinterRunnable(), "A");
        Thread t2 = new Thread(new PrinterRunnable(), "B");

        t1.start();
        t2.start();
    }
}

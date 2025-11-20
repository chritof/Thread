public class Main3 {
    public static void main(String[] args) {
        Thread t = new Thread(new MinRunnable3());
        t.start();
    }
}
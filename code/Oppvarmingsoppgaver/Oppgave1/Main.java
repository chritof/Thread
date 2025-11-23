public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread traad1 = new Thread(new MinTraad());
        Thread traad2 = new Thread(new MinTraad());

        traad1.start();
        traad2.start();

        traad1.join();
        traad2.join();

        System.out.println("Main-tråd ferdig!");
    }
}

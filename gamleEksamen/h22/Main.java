
public class Main {

    public static void main(String[] args) {

        int n = 50;

        Thread t1 = new Thread(() -> {
            System.out.println(fib(n));
        });

        Thread t2 = new Thread(() -> {
            while(t1.isAlive()) {
                try{
                    System.out.print(".");
                    Thread.sleep(1000);
                }catch(InterruptedException e){}
            }
        });

    }
}

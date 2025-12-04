class Counter{
    static int counter = 0;
    static synchronized void increment(){
        counter++;
    }
    static synchronized int getValue(){
        return counter;
    }
}

class traad implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            Counter.increment();
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new traad());
        Thread t2 = new Thread(new traad());
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println(Counter.getValue());
    }
}

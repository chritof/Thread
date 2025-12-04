
class Counter{
    private int counter = 0;

    public synchronized void increment(){
        counter++;
    }
    public synchronized int get(){
        return counter;
    }
}



public class synchronizedEksempel {

        public static void main(String[] args) throws Exception {
            Counter c = new Counter();

            Thread t1 = new Thread(() -> { for(int i=0;i<10000;i++) c.increment(); });
            Thread t2 = new Thread(() -> { for(int i=0;i<10000;i++) c.increment(); });
            //Det finnes 2 måter å lage Threds på i dette tilfeller, den over og den under er ekvivalente.
            Thread t3 = new Thread(new Runnable(){
                public void run() {
                    for(int i=0;i<10000;i++) c.increment();
                }
            });

            t1.start(); t2.start(); t3.start();
            t1.join(); t2.join(); t3.join();

            System.out.println("Resultat: " + c.get());
    }
}

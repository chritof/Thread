public class SleepStopJoinMain {

    public static void main(String[] args) throws InterruptedException {

        TraadSomKanStoppes t = new TraadSomKanStoppes("T");
        TraadSomKanStoppes t2 = new TraadSomKanStoppes("T2");

        t.setDaemon(true);
        t.start();

        t2.start();

        Thread.sleep(4000);
        t.stopp();
        t.join();
        //hvis jeg for eksempel hadde gjernet t2.join(); da hadde main tråden
        //skrevet til terminalen før t2 hadde skrevet T2 stopped !
        t2.stopp();
        t2.join();

        System.out.println(Thread.currentThread().getName() + " stopped !");

    }
}

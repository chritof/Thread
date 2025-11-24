package Oppgave8;

public class DeadlockDemo {

    private static final Object lockA = new Object();
    private static final Object lockB = new Object();

    public static void main(String[] args) {
        // lag og start to tråder her


        Runnable r1 = () -> {
            System.out.println("Tråd 1: prøver å låse A");
            synchronized (lockA) {
                System.out.println("Tråd 1: har låst A");
                try { Thread.sleep(500); } catch (InterruptedException e) {}

                System.out.println("Tråd 1: prøver å låse B");
                synchronized (lockB) {
                    System.out.println("Tråd 1: har låst B");
                }
            }
        };


        //Runnable r2 = () -> {
         //   System.out.println("Tråd 2: prøver å låse B");
           // synchronized (lockB) {
             //   System.out.println("Tråd 2: har låst B");
               // try { Thread.sleep(500); } catch (InterruptedException e) {}
//
   //              System.out.println("Tråd 2: prøver å låse A");
     //           synchronized (lockA) {
       //             System.out.println("Tråd 2: har låst A");
         //       }
           // }
        //};


        //Her løser vi deadlocken med å passe på at vi tar lockA før lockB
        Runnable r2 = () -> {
            System.out.println("Tråd 2: prøver å låse A");
            synchronized (lockA) {
                System.out.println("Tråd 2: har låst A");
                try { Thread.sleep(500); } catch (InterruptedException e) {}

                System.out.println("Tråd 2: prøver å låse B");
                synchronized (lockB) {
                    System.out.println("Tråd 2: har låst B");
                }
            }
        };



        Thread t1 = new Thread(r1, "T1");
        Thread t2 = new Thread(r2, "T2");

        t1.start();
        t2.start();

    }
}

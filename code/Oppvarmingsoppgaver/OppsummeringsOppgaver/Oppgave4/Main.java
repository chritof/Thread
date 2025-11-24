package Oppgave4;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + ": Starter tråder");

        Thread t1 = new Thread(new Arbeider(), ("t1"));
        Thread t2 = new Thread(new Arbeider(), ("t2"));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(Thread.currentThread().getName() + ": Alle arbeidere er ferdige!");

    }
}

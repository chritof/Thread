package Oppgave4;

public class Arbeider implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " startet arbeid");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            return;
        }
        System.out.println(Thread.currentThread().getName() + " er ferdig");
    }
}

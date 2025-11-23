//dette viser hvordan wait/notify fungerer sammen med synchronized metoder

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Melding melding = new Melding();


        Thread thread1 = new Thread(new Runnable(){
            public void run(){
                try {
                    Thread.sleep(4000);
                }catch (InterruptedException e){}
                melding.setMelding("hallo");
            }
        });

        Thread thread2 = new Thread(new Runnable(){
            public void run(){
                String m = melding.getMelding();
                System.out.println();
                System.out.println(m);
            }
        });

        Thread dots = new Thread(() -> {
            while (melding.peekMelding() == null) {
                System.out.print(".");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
            System.out.println("Ferdig å vente!");
        });

        thread1.start();
        thread2.start();
        dots.start();

        thread1.join();
        thread2.join();
        dots.join();
    }
}

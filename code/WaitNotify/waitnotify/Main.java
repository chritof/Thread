public class Main {

    private static String melding;
    private static Object lock = new Object();

    public static void main(String[] args) {

        Thread printlnThread = new Thread(() ->{
            synchronized (lock){
                while(melding == null){
                    try {
                        lock.wait();
                    }catch (InterruptedException e){
                    }
                }
            }
            System.out.println(melding);
        });

        Thread giVerdiTraad = new Thread(() ->{
            //bare for gøy -------------------------------------------
            try {
                Thread.sleep(4000); // må være i try/catch
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //--------------------------------------------------------

            synchronized (lock){
                melding = "hallo!";
                lock.notify();
            }
        });

        printlnThread.start();
        giVerdiTraad.start();

    }
}

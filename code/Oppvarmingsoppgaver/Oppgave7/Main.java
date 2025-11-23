public class Main {


    public static void main(String[] args) {
        Kryss kryss = new Kryss();

        Thread bilA = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                kryss.kjørInn("BilA");
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e){}
                kryss.kjørUt("BilA");
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e){}
            }
        });
        Thread bilB = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                kryss.kjørInn("BilB");
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e){}
                kryss.kjørUt("BilB");
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e){}
            }
        });

        bilA.start();
        bilB.start();
    }
}

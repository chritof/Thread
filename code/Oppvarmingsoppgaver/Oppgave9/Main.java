

public class Main {

    public static void main(String[] args) {

        Thread klasseImplementererRunnable =
                new Thread(new KlasseImplementererRunnable());

        Thread klasseArverThread =
                new KlasseArverThread(); // viktig endring!

        Thread lambdaThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("LambdaThread – runde " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    return;
                }
            }
        });

        lambdaThread.start();
        klasseImplementererRunnable.start();
        klasseArverThread.start();
    }
}

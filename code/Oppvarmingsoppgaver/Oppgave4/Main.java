

public class Main {

    public static void main(String[] args) {

        Melding melding = new Melding();

        Thread ping = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    melding.ping();
                }
            }
        });

        Thread pong = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    melding.pong();
                }
            }
        });

        ping.start();
        pong.start();
    }
}

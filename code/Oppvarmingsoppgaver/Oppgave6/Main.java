public class Main {

    public static void main(String[] args) {

        PingPong pingPong = new PingPong();

        Thread ping = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    pingPong.ping();
                }
            }
        });
        Thread pong = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    pingPong.pong();
                }
            }
        });

        ping.start();
        pong.start();
    }
}

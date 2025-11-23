public class Melding {

    private boolean pingSinTur = true;

    public synchronized void ping(){
        while (!pingSinTur) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
            System.out.println("Ping");
            pingSinTur = false;
            notifyAll();

    };

    public synchronized void pong(){
        while (pingSinTur) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
            System.out.println("Pong");
            pingSinTur = true;
            notifyAll();
    }
}

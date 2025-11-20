public class Main {

    public static String melding;


    public static void main(String[] args) {

        Thread printlnThred = new Thread(() -> {
            while (melding == null) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                }
            }
            System.out.println(melding);
        });

        Thread info = new Thread(() -> System.out.println("Nå startes trådene!"));

        //En tråd som gi melding en verdi:
        Thread giVerdiThraad = new Thread(() -> {
            try {
                System.out.println("giVerdiThread: Sover i 2 sekunder...");
                Thread.sleep(2000);  // ← Her legger vi inn pausen
            } catch (InterruptedException e) {
            }
            melding = "hallo";
            System.out.println("giVerdiThread: melding er satt til 'hallo'");
        });

        info.start();

        printlnThred.start();
        giVerdiThraad.start();

    }
}

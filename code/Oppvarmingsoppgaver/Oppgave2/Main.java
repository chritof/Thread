///Poenget med denne oppgaven er at flere tråder bruker den samme kritiske seksjonen uten noe form for synkronisasjon
/// forventet resultat er 3000, men når man kjører koden flere ganger kan man få andre verdier som 2064, 2977, osv.


public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynkTeller teller = new SynkTeller();

        Thread traad1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    teller.tellOpp();
                }
            }
        });
        Thread traad2 = new Thread(new Runnable(){
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    teller.tellOpp();
                }
            }
        });

        Thread traad3 = new Thread(new Runnable(){
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    teller.tellOpp();
                }
            }
        });

        traad1.start();
        traad2.start();
        traad3.start();

        traad1.join();
        traad2.join();
        traad3.join();

        System.out.println(teller.getVerdi());

    }
}

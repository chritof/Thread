public class TellerNedThraad extends Thread {
    private Teller teller;
    private int n;

    public TellerNedThraad(Teller teller, int n) {
        this.teller = teller;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            synchronized (teller) {
                teller.tellNed();
            }
        }
    }

}

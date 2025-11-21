public class MainStateful {

    public static void main(String[] args) {
        PriskalkulatorStateful kalk = new PriskalkulatorStateful();

        Vare vare1 = new Vare(200, 5, 10);
        PrisberegningA beregning1 = new PrisberegningA(kalk, vare1);

        Vare vare2 = new Vare(300, 4, 50);
        PrisberegningA beregning2 = new PrisberegningA(kalk, vare2);

        new Thread(beregning1).start(); //Forventet: 900
        new Thread(beregning2).start(); //Forventet: 600


    }
}

class PrisberegningA implements Runnable {

    private PriskalkulatorStateful pk;
    private Vare vare;

    public PrisberegningA(PriskalkulatorStateful pk, Vare vare) {
        this.pk = pk;
        this.vare = vare;
    }

    @Override
    public void run() {
        //cpu-en har et scheduler system, som håndterer hvilke tråd som skal kjøre.
        //hvis du "sover" litt mellom hver gang du legger inn verider til
        //objektvariablene, kan det hende at cpu-en bytter hvilke tråd som skal
        //kjøre får den første tråden rekker å bli ferdig.
        pk.setStykkpris(vare.stykkpris());
        sleepLitt();
        pk.setAntall(vare.antall());
        sleepLitt();
        pk.setRabattprosent(vare.prosent());
        sleepLitt();
        System.out.println(pk.beregnTotalPrisMedRabatt());
    }
    private void sleepLitt() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {}
    }
}

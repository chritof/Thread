public class MainStateless {
    public static void main(String[] args) {
        PriskalkulatorStateless kalk = new PriskalkulatorStateless();

        Vare vare1 = new Vare(200, 5, 10);
        PrisberegningB beregning1 = new PrisberegningB(kalk, vare1);

        Vare vare2 = new Vare(300, 4, 50);
        PrisberegningB beregning2 = new PrisberegningB(kalk, vare2);

        new Thread(beregning1).start(); //Forventet: 900
        new Thread(beregning2).start(); //Forventet: 600
    }
}

class PrisberegningB implements Runnable {
    private PriskalkulatorStateless pk;
    private Vare vare;

    public PrisberegningB(PriskalkulatorStateless pk, Vare vare) {
        this.pk = pk;
        this.vare = vare;
    }

    @Override
    public void run() {
        System.out.println(pk.beregnTotalPrisMedRabatt(vare.stykkpris(), vare.antall(), vare.prosent()));
    }
}
public class Main1Mutable {
    public static void main(String[] args) {
        MeldingMutable m = new MeldingMutable("");

        String[] ordene1 = {"Hvordan", "går", "det", "Arne"};
        String[] ordene2 = {"How", "are", "you", "John"};

        new Thread(new ByggOgPrintHilsenA(m, ordene1)).start();
        new Thread(new ByggOgPrintHilsenA(m, ordene2)).start();
    }
}


class ByggOgPrintHilsenA implements Runnable {
    private MeldingMutable m;
    private String[] ordene;

    public ByggOgPrintHilsenA(MeldingMutable m, String[] ordene) {
        this.m = m;
        this.ordene = ordene;
    }
    @Override
    public void run() {
        for (String ord : ordene) {
            m.leggTil(ord + " ");
        }
        System.out.println(m);
    }
}

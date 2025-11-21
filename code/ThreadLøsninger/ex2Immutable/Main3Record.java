public class Main3Record {
    public static void main(String[] args) {
        MeldingRecord m = new MeldingRecord("");

        String[] ordene1 = {"Hvordan", "går", "det", "Arne"};
        String[] ordene2 = {"How", "are", "you", "John"};

        new Thread(new ByggOgPrintHilsenC(m, ordene1)).start();
        new Thread(new ByggOgPrintHilsenC(m, ordene2)).start();

    }
}


class ByggOgPrintHilsenC implements Runnable {

    private MeldingRecord m;
    private String[] ordene;

    public ByggOgPrintHilsenC(MeldingRecord m, String[] ordene) {
        this.m = m;
        this.ordene = ordene;
    }

    @Override
    public void run() {
        for (String ord : ordene) {
            m = m.leggTil(ord + " "); // Muterer IKKE m
        }
        System.out.println(m);
    }
}
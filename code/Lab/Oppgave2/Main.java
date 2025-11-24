package Oppgave2;

public class Main {

    public static void skrivUtHeader(String[] kokker, String[] servitorer, int kapasitet) {
        System.out.println("I denne simuleringen har vi");
        System.out.println("  " + kokker.length + " kokker " + java.util.Arrays.toString(kokker));
        System.out.println("  " + servitorer.length + " servitører " + java.util.Arrays.toString(servitorer));
        System.out.println("  Kapasiteten til brettet er " + kapasitet + " hamburgere.");
        System.out.println("Vi starter ...\n");
    }


    public static void main(String[] args) {
        final String[] kokker = {"Anne", "Erik", "Knut"};
        final String[] servitorer = {"Mia", "Per"};
        final int KAPASITET = 4;

        skrivUtHeader(kokker, servitorer, KAPASITET);
        HamburgerBrett brett = new HamburgerBrett(KAPASITET);

        for (String navn : kokker) {
            new Kokk(brett, navn).start();
        }
        for (String navn : servitorer) {
            new Servitor(brett, navn).start();
        }
    }
}

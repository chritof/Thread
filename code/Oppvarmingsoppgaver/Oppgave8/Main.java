public class Main {


    public static void main(String[] args) {

        Barbersalong salong = new Barbersalong(3);


        new Barberer(salong).start();

        for (int i = 1; i <= 10; i++) {
            new Kunde(salong, "Kunde " + i).start();
            Thread.sleep(300); // kunder kommer litt spredt
        }
    }
}
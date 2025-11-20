public class RaceConditionMain {

    public static void main(String[] args) throws InterruptedException {

        Teller teller = new Teller();
        Thread telleOpp = new TellerOppTraad(teller, 100_000);
        Thread telleNed = new TellerNedThraad(teller, 100_000);

        telleOpp.start();


        telleOpp.join();


        System.out.println("Teller = " + teller.getVerdi());
    }
}

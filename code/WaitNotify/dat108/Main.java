public class Main {

    public static void main(String[] args) throws InterruptedException {

        UtskriftsloopTraad printLoop = new UtskriftsloopTraad();
        printLoop.start();

        MeldingsboksTraad avbrytDialog = new MeldingsboksTraad(printLoop);
        avbrytDialog.start();

        System.out.println("Tråder er startet. Venter på at de er ferdige ...");

        //hvis vi hadde fjernet begge join(); da hadde vi fått første verdi fra urskriftloop
        //og etter dette ville main kjørte begge print linjene nederst, og deretter kjørt
        //resten av de gjentagende meldingene fra utskriftloopen.
        printLoop.join();
        avbrytDialog.join();
        System.out.println("Begge tråder er ferdige!");

        System.out.println("Main-tråd ferdig!");
    }
}

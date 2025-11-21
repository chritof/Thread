public class Main1SyncWaitNotify {

    public static void main(String[] args) {
        Melding melding = new Melding();

        Thread printlnTraad = new Thread(() ->{
            System.out.println("printlnTraad er online...");
            synchronized (melding){
                while (!melding.harTekst()){
                    try {
                        melding.wait();
                    }catch (InterruptedException e){
                    }
                }
                System.out.println(melding.getTekst());
            }
        });

        Thread giVerdiTraad = new Thread(() ->{
            System.out.println("giVerdiTraad er online...");
            try {
                Thread.sleep(4000);
            }catch(InterruptedException e){}
            synchronized (melding){
                melding.setTekst("hallo");
                melding.notifyAll();
            }
        });
        printlnTraad.start();
        giVerdiTraad.start();
    }
}

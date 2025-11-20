public class TraadSomKanStoppes  extends Thread{

    boolean fortsette = true;

    public void stopp(){
        fortsette = false;
    }

    public TraadSomKanStoppes(String navn){
        super(navn);
    }

    @Override
    public void run(){
        while(fortsette){
            System.out.println("hei");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(getName() + " stopped !");
    }
}

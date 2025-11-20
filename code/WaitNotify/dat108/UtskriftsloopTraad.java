public class UtskriftsloopTraad extends Thread {

    public boolean fortsette = true;


    public void stopp(){
        fortsette = false;
    }

    @Override
    public void run() {
        while(fortsette){
            System.out.println("Dette er en gjentagende melding !! :)");
            try {
                sleep(2000);
            }catch(InterruptedException e){}
        }
    }
}

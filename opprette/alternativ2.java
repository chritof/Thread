public class alternativ2 {

    Thread t = new Thread() {
        @Override
        public void run() {
            System.out.println("Anonym tråd kjører!");
        }
    };

    public alternativ2() {
        t.start();
    }


}



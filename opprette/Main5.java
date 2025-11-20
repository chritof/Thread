public class Main5 {
    Thread tester = new Thread(() -> {
        System.out.println("Lambda-tråd kjører!");
    });


    public static void main(String[] args) {
        alternativ5 a = new alternativ5(); // lager objekt
        a.t.start();                       // starter tråden

        Main5 m = new Main5();
        m.tester.start();
    }
}

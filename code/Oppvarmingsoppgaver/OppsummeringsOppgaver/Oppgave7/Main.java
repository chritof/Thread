package Oppgave7;

public class Main {

    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Thread producer = new Thread(new Producer(buffer), "Producer");
        Thread consumer = new Thread(new Consumer(buffer), "Consumer");

        producer.start();
        consumer.start();
    }
}

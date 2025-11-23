import java.time.Duration;
import java.time.Instant;


public class Main {

    public final static int N = 47;

    public static void main(String... kommandolinjeargumenter) {
        Instant start = Instant.now();
        long fibResultat = new Fibonacci().fib(N);

        Instant ferdig = Instant.now();
        Duration tidsbruk = Duration.between(start, ferdig);

        System.out.println("fib(" + N + ")  = " + fibResultat);
        System.out.println("Tidsbruk = " + tidsbruk.toMillis() + " ms");
    }
}

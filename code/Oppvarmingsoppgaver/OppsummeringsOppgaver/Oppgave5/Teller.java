package Oppgave5;

public class Teller {
    int verdi = 0;

    void øk() {
        verdi++;
    }

    void senk() {
        verdi--;
    }

    int getVerdi() {
        return verdi;
    }
}
//poenget her er å vise at record er immutable.
//denne klassen MeldingRecord er så å si helt lik som MeldingImmutable.

public record MeldingRecord(String innhold) {
    public MeldingRecord leggTil(String merTekst){
        return new MeldingRecord(innhold + merTekst);
    }
}

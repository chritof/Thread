public final class MeldingImmutable {
    private final String innhold;

    public MeldingImmutable(String innhold) {
        this.innhold = innhold;
    }
    public String getInnhold() {
        return innhold;
    }
    public MeldingImmutable leggTil(String merTekst){
        //dette er den viktigste koden som gjør klassen immutable
        //nåt du vil ha mer tekst lager du et nytt objekt!
        return new MeldingImmutable(innhold + merTekst);
    }
    @Override
    public String toString() {
        return "MeldingImmutable [innhold=" + innhold + "]";
    }
}

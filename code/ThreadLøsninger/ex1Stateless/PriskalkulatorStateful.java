public class PriskalkulatorStateful {

    private int stykkrpis;
    private int antall;
    private double rabattprosent;


    public void setStykkpris(int stykkrpis) {
        this.stykkrpis = stykkrpis;
    }
    public void setAntall(int antall) {
        this.antall = antall;
    }
    public void setRabattprosent(double rabattprosent) {
        this.rabattprosent = rabattprosent;
    }
    public int beregnTotalPrisMedRabatt(){
        return (int) (stykkrpis * antall * (1 - rabattprosent/100.0) + 0.5);
    }
}

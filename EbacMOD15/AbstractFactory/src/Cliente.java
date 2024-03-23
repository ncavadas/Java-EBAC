public class Cliente {
    //10 min
    private String requerNota;
    private boolean temContrato;

    public Cliente(String requerNota, boolean temContrato) {
        this.requerNota = requerNota;
        this.temContrato = temContrato;
    }

    public boolean temContrato(){
        return temContrato;
    }
    public String getRequerNota(){
        return requerNota;
    }

}

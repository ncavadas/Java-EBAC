public class Bolsa {
    //Propriedades da bolsa
    private String cor;
    private double capacidade;
    private boolean aberta;


    public Bolsa() {
        this.cor = cor;
        this.capacidade = capacidade;
        this.aberta = false;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    //Método para abrir a bolsa
    public void abrir(){
        this.aberta = true;
        System.out.println("A bolsa foi aberta.");
    }
    //Método para fechar a bolsa
    public void fechar() {
        this.aberta = false;
        System.out.println("A bolsa foi fechada.");
    }



}


public class Burguer {
    private String pao = "Sem pão";
    private String carne = "Sem carne";
    private String salada = "Sem salada";
    private String queijo = "sem queijo";
    private String molho = "sem molho";

    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public void print(){
    System.out.println("Burguer pronto !"
            +"n"+"Pão: "+pao+
            " - Carne:"+carne+
            " - Queijo:"+queijo+
            " - Salada"+salada+
            " - Molho:"+molho);
    }

}

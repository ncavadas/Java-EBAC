//10:45
public abstract class Carro {

    private int potencia;
    private String tipoCombustivel;
    private String cor;


    public Carro(int potencia, String tipoCombustivel, String cor) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.cor = cor;
    }

    public void limpar(){
        System.out.println("O carro "+cor.toLowerCase()+" está brilhando e limpo.");
    }
    public void abastecer(){
        System.out.println("O carro foi abastecido com "+tipoCombustivel.toLowerCase()+".");
    }
    public void mecanico(){
        System.out.println("O carro passou pela revisão, tudo ok!");
    }
    public void ligarCarro(){
        System.out.println("O carro "+cor+" "+potencia+ " à "+tipoCombustivel+ " está funcionando corretamente.");
    }
}

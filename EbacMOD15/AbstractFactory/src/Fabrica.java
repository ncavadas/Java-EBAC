//10:22
public abstract class Fabrica {
    public Carro criar(String requerNota) {
        Carro carro = pegarCarro(requerNota);
        carro = prapararCarro(carro);
        return carro;
    }
    private Carro prapararCarro(Carro carro){
        carro.limpar();
        carro.mecanico();
        carro.abastecer();
        return carro;
    }
    abstract Carro pegarCarro(String requerNota);
}

public abstract class Pessoa {
    //Variáveis
    private String nome;

    //Construtor
    public Pessoa(){}
    public Pessoa(String $nome){
        this.nome = $nome;
    }

    //Get e Set

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


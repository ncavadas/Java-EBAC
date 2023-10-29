public class PessoaFisica extends Pessoa {
    //Variáveis
    private String rg;
    private String cpf;

    //Construtor
    public PessoaFisica(){}
    public PessoaFisica(String $nome,String $cpf,String $rg){
        super.setNome($nome);
        this.rg = $rg;
        this.cpf = $cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
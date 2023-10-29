public class PessoaJuridica extends Pessoa{

    //Variáveis
    private String cnpj;

    //Construtor
    public PessoaJuridica(){}
    public PessoaJuridica(String $nome,String $cnpj){
        super.setNome($nome);
        this.cnpj = $cnpj;
    }

    //Get e Set
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}


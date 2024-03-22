
import Projeto1.dao.ClienteMapDAO;
import Projeto1.dao.IClienteDAO;
import Projeto1.domain.Cliente;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ninac
 */
public class App {
   
    private static IClienteDAO iClienteDAO;
    
    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();
        String selecao = campoSelecao();
//        String selecao = JOptionPane.showInputDialog(null,"Digite 1 para cadastro, "
//                + "2 para consulta, "
//                + "3 para exclusão, "
//                + "4 para alterar ou "
//                + "5 para sair.","Seleção", JOptionPane.INFORMATION_MESSAGE);
 //Seleção não válida       
        while (!isSelecaoValida(selecao)) {
            if ("".equals(selecao)) {
                sair();
            } else {
            selecao = campoSelecao();
//            selecao = JOptionPane.showInputDialog(null,"Opção inválida.Digite 1 para cadastro, "
//                + "2 para consulta, "
//                + "3 para exclusão, "
//                + "4 para alterar ou "
//                + "5 para sair.","Seleção2", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
  //Seleção válida             
        while (isSelecaoValida(selecao)) {
            if (isSelecaoSair(selecao)){
                sair();
            }else if(isSelecaoCadastro(selecao)){
                String dados = JOptionPane.showInputDialog(null,"Digite os dados do cliente, "
                        + "separados por vírgula. "
                        + "Ex: Nome,CPF,tel,end,numero,cidade,estado","Cadastro");
                cadastrar(dados);
                //para o programa voltar na tela inicial ao inves de fechar.
                selecao = campoSelecao();
            }else if (isSelecaoConsultar(selecao)){
                String dados = JOptionPane.showInputDialog(null,"Digite o CPF:","Consultar");
                consultar(dados);
                //para o programa voltar na tela inicial ao inves de fechar.
                selecao = campoSelecao();
                
            }else if(isSelecaoExcluir(selecao)){
                String dados = JOptionPane.showInputDialog(null,"Digite o CPF:","Consultar2 Exclusao");
                excluir(dados);
                selecao = campoSelecao();
            }else if(isSelecaoAlterar(selecao)){                
                alterar();
                selecao = campoSelecao();
            }
            
        }  
    }

    private static boolean isSelecaoValida(String selecao){
        if ("1".equals(selecao)||"2".equals(selecao)||"3".equals(selecao)||"4".equals(selecao)||"5".equals(selecao)) {
            return true;
        }
        return false;
    }
    private static boolean isSelecaoSair(String selecao){
        if("5".equals(selecao)){
            return true;
        }
        return false;
    }
    private static boolean isSelecaoCadastro(String selecao){
        if("1".equals(selecao)){
            return true;
        }
        return false;
    }
    private static boolean isSelecaoConsultar(String selecao){
        if("2".equals(selecao)){
           return true;
        }
        return false;
    }
    private static boolean isSelecaoExcluir(String selecao){
        if("3".equals(selecao)){
           return true;
        }
        return false;
    }
    private static boolean isSelecaoAlterar(String selecao){
        if("4".equals(selecao)){
           return true;
        }
        return false;
    }
    private static boolean isCPFValido(String selecao){
        if(Pattern.matches("\\d{11}", selecao)){
            return true;
        }
        return false;
    }
    private static String campoSelecao(){
        return JOptionPane.showInputDialog(null,"Digite 1 para cadastro, "
                + "2 para consulta, "
                + "3 para exclusão, "
                + "4 para alterar ou "
                + "5 para sair.","Seleção", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void sair(){
        JOptionPane.showMessageDialog(null,"Até logo!","Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    private static void cadastrar(String dados){
        String[] dadosSeparados = dados.split(",");
        //validação todos os dados enviados - teste ok
        if (dadosSeparados.length != 7) {
        JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Cadastro inválido", JOptionPane.ERROR_MESSAGE);
        return;
        }
        if(!isCPFValido(dadosSeparados[1])) {
            JOptionPane.showMessageDialog(null,"CPF em formato inválido","Documento inválido", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Cliente cliente = new Cliente(dadosSeparados[0],//nome
                                dadosSeparados[1],//cpf
                                dadosSeparados[2],//tel
                                dadosSeparados[3],//end
                                dadosSeparados[4],//numero
                                dadosSeparados[5],//cidade
                                dadosSeparados[6]);//cidade
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if(isCadastrado){
            JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso","Cadastroi", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
            JOptionPane.showMessageDialog(null,"Cliente ja existe","Falha no cadastro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
    }
    private static void consultar(String dados){
        //Validação do cpf - teste ok
        if(!isCPFValido(dados)) {
            JOptionPane.showMessageDialog(null,"CPF em formato inválido","Documento inválido", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        //validar se passou algo alem de numero no cpf.
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente!=null ){
        JOptionPane.showMessageDialog(null,"Cliente encontrado:"+cliente.toString(),"Consulta", JOptionPane.INFORMATION_MESSAGE);   
        } else {
            JOptionPane.showMessageDialog(null,"Cliente não encontrado","Falha na consulta", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    private static void excluir(String dados){
        if(!isCPFValido(dados)) {
            JOptionPane.showMessageDialog(null,"CPF em formato inválido","Documento inválido", JOptionPane.ERROR_MESSAGE);
            return;
        }
        iClienteDAO.excluir(Long.parseLong(dados));
        if (dados != null) {
            JOptionPane.showMessageDialog(null,"Cliente do CPF: "+dados.toString()+" excluído com sucesso!","Exclusão", JOptionPane.INFORMATION_MESSAGE);   
        } else {
            JOptionPane.showMessageDialog(null,"Cliente não encontrado para exclusão","Falha na exclusão", JOptionPane.ERROR_MESSAGE);
        }
    }     
    private static void alterar() {
    String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do cliente que deseja alterar:", "Alterar", JOptionPane.INFORMATION_MESSAGE);

    if (!isCPFValido(cpf)) {
        JOptionPane.showMessageDialog(null, "CPF em formato inválido", "Documento inválido", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Cliente cliente = iClienteDAO.consultar(Long.parseLong(cpf));

    if (cliente == null) {
        JOptionPane.showMessageDialog(null, "Cliente não encontrado", "Falha na consulta", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String dados = JOptionPane.showInputDialog(null,
						"Digite os dados do Cliente separado por virgula, "
                                                + "conforme exemplo: Nome,CPF, Telefone, Endereco, numero, cidade, estado",
                                                "Atualização", JOptionPane.INFORMATION_MESSAGE);
    String[] isAtualizar = dados.split(",");
        cliente = new Cliente(isAtualizar[0], 
                isAtualizar[1], 
                isAtualizar[2], 
                isAtualizar[3], 
                isAtualizar[4],                    
                isAtualizar[5], 
                isAtualizar[6]);
        
    iClienteDAO.alterar(cliente);
    if (cliente != null) {
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso","Alteração", JOptionPane.INFORMATION_MESSAGE);   
        } else {
            JOptionPane.showMessageDialog(null,"Cliente não encontrado","Falha para alterar", JOptionPane.ERROR_MESSAGE);
        }
    }   
}

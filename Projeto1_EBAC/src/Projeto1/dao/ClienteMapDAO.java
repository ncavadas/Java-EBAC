package Projeto1.dao;

import Projeto1.domain.Cliente;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Ninac
 */
public class ClienteMapDAO implements IClienteDAO {
    //chave vai ser o cpf tipo long e o valor o cliente
    private Map <Long, Cliente> map;

    public ClienteMapDAO() {
        //HashMap pois ele tem rápida inserção, remoção e busca.
        map = new HashMap<>();
    }
    
    

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        } 
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = this.map.get(cpf);
        if (clienteCadastrado != null){
        this.map.remove(clienteCadastrado.getCpf(),clienteCadastrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = map.get(cliente.getCpf());
        //Vai setar o valor que foi pego na tela
        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setTel(cliente.getTel());
        clienteCadastrado.setNumero(cliente.getNumero());
        clienteCadastrado.setEnd(cliente.getEnd());
        clienteCadastrado.setCidade(cliente.getCidade());
        clienteCadastrado.setEstado(cliente.getEstado());
        
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        //value retorna todos os valores da coleção de clientes
        return this.map.values();
    }
    
    
}

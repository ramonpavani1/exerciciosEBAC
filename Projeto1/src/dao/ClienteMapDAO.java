package dao;

import domain.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteMapDAO implements ICLienteDAO {

    private final Map<Long, Cliente> clientes = new HashMap<>();

    @Override
    public boolean adicionar(String nome, long cpf, long telefone, String endereco,
                             int numero, String cidade, String estado) {
        if (clientes.containsKey(cpf)) {
            return false;
        }
        clientes.put(cpf, new Cliente(nome, cpf, telefone, endereco, numero, cidade, estado));
        return true;
    }

    @Override
    public boolean atualizar(long cpf, String nome, long telefone, String endereco,
                             int numero, String cidade, String estado) {
        Cliente cliente = clientes.get(cpf);
        if (cliente == null) {
            return false;
        }
        cliente.setNome(nome);
        cliente.setTelefone(telefone);
        cliente.setEndereco(endereco);
        cliente.setNumero(numero);
        cliente.setCidade(cidade);
        cliente.setEstado(estado);
        return true;
    }

    @Override
    public boolean remover(long cpf) {
        return clientes.remove(cpf) != null;
    }

    @Override
    public Cliente buscarPorCpf(long cpf) {
        return clientes.get(cpf);
    }

    @Override
    public List<Cliente> listar() {
        return new ArrayList<>(clientes.values());
    }
}
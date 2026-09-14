package dao;

import domain.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ClienteSetDAO implements ICLienteDAO {

    private final Set<Cliente> clientes = new TreeSet<>(Comparator.comparingLong(Cliente::getCpf));

    @Override
    public boolean adicionar(String nome, long cpf, long telefone, String endereco,
                             int numero, String cidade, String estado) {
        return clientes.add(new Cliente(nome, cpf, telefone, endereco, numero, cidade, estado));
    }

    @Override
    public boolean atualizar(long cpf, String nome, long telefone, String endereco,
                             int numero, String cidade, String estado) {
        Cliente cliente = buscarPorCpf(cpf);
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
        Cliente cliente = buscarPorCpf(cpf);
        return cliente != null && clientes.remove(cliente);
    }

    @Override
    public Cliente buscarPorCpf(long cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public List<Cliente> listar() {
        return new ArrayList<>(clientes);
    }
}
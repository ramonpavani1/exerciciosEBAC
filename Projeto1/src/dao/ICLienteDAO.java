package dao;

import domain.Cliente;

import java.util.List;

public interface ICLienteDAO {

    boolean adicionar(String nome, long cpf, long telefone, String endereco,
                      int numero, String cidade, String estado);

    boolean atualizar(long cpf, String nome, long telefone, String endereco,
                      int numero, String cidade, String estado);

    boolean remover(long cpf);

    Cliente buscarPorCpf(long cpf);

    List<Cliente> listar();
}
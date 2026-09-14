import dao.ClienteMapDAO;
import dao.ClienteSetDAO;
import dao.ICLienteDAO;
import domain.Cliente;

import javax.swing.JOptionPane;

public class App {

    private static ICLienteDAO daoMap = new ClienteMapDAO();
    private static ICLienteDAO daoSet = new ClienteSetDAO();

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 5) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair"));

            if (opcao == 1) {
                cadastrar();
            } else if (opcao == 2) {
                consultar();
            } else if (opcao == 3) {
                excluir();
            } else if (opcao == 4) {
                alterar();
            }
        }
    }

    private static void cadastrar() {
        String dados = JOptionPane.showInputDialog(
                "Digite os dados separados por vírgula: nome,cpf,telefone,endereco,numero,cidade,estado\n"
                        + "Exemplo: Maria Silva,12345678900,11987654321,Rua das Flores,120,Sao Paulo,SP");
        String[] partes = dados.split(",");

        String nome = partes[0].trim();
        long cpf = Long.parseLong(partes[1].trim());
        long telefone = Long.parseLong(partes[2].trim());
        String endereco = partes[3].trim();
        int numero = Integer.parseInt(partes[4].trim());
        String cidade = partes[5].trim();
        String estado = partes[6].trim();

        boolean cadastrado = daoSet.adicionar(nome, cpf, telefone, endereco, numero, cidade, estado);

        if (!cadastrado) {
            JOptionPane.showMessageDialog(null, "Este CPF já está cadastrado.");
            return;
        }

        daoMap.adicionar(nome, cpf, telefone, endereco, numero, cidade, estado);
        JOptionPane.showMessageDialog(null, "Cadastro concluído com sucesso.");
    }

    private static void consultar() {
        long cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF:").trim());
        Cliente cliente = daoMap.buscarPorCpf(cpf);

        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
            return;
        }

        JOptionPane.showMessageDialog(null, "Cliente encontrado:\n"
                + cliente.getNome() + "," + cliente.getCpf() + "," + cliente.getTelefone() + ","
                + cliente.getEndereco() + "," + cliente.getNumero() + "," + cliente.getCidade() + ","
                + cliente.getEstado());
    }

    private static void excluir() {
        long cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF:").trim());
        boolean removido = daoMap.remover(cpf);
        daoSet.remover(cpf);

        if (removido) {
            JOptionPane.showMessageDialog(null, "Cliente removido com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
        }
    }

    private static void alterar() {
        String dados = JOptionPane.showInputDialog("Digite: cpf,nome,telefone,endereco,numero,cidade,estado");
        String[] partes = dados.split(",");

        long cpf = Long.parseLong(partes[0].trim());
        String nome = partes[1].trim();
        long telefone = Long.parseLong(partes[2].trim());
        String endereco = partes[3].trim();
        int numero = Integer.parseInt(partes[4].trim());
        String cidade = partes[5].trim();
        String estado = partes[6].trim();

        boolean atualizado = daoMap.atualizar(cpf, nome, telefone, endereco, numero, cidade, estado);
        daoSet.atualizar(cpf, nome, telefone, endereco, numero, cidade, estado);

        if (atualizado) {
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
        }
    }
}
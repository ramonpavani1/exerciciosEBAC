public class PessoaFisica extends Pessoa {

    private final String cpf;
    private final String profissao;

    public PessoaFisica(String nome, String endereco, String telefone,
                        String cpf, String profissao) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public static void imprimirPessoaFisica(PessoaFisica pessoa) {
        System.out.println("Nome: " + pessoa.getNome()
                + ", Endereço: " + pessoa.getEndereco()
                + ", Telefone: " + pessoa.getTelefone()
                + ", CPF: " + pessoa.getCpf()
                + ", Profissão: " + pessoa.getProfissao());
    }

}
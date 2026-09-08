public class PessoaJuridica extends Pessoa {

    private final String cnpj;
    private final String ramoAtividade;

    public PessoaJuridica(String nome, String endereco, String telefone,
                          String cnpj, String ramoAtividade) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.ramoAtividade = ramoAtividade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRamoAtividade() {
        return ramoAtividade;
    }

    public static void imprimirPessoaJuridica(PessoaJuridica pessoa) {
        System.out.println("Nome: " + pessoa.getNome()
                + ", Endereço: " + pessoa.getEndereco()
                + ", Telefone: " + pessoa.getTelefone()
                + ", CNPJ: " + pessoa.getCnpj()
                + ", Ramo de Atividade: " + pessoa.getRamoAtividade());
    }

}
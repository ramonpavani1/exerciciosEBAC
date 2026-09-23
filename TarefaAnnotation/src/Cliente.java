@Tabela("clientes")
public class Cliente {

    private final Long id;
    private final String nome;
    private final String email;

    public Cliente(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(1L, "Ramon Pavani", "ramonpavani32@email.com");

        Tabela anotacao = Cliente.class.getAnnotation(Tabela.class);

        System.out.println("Tabela: " + anotacao.value()
                + " | Nome: " + cliente.getNome()
                + " | Email: " + cliente.getEmail());
    }
}
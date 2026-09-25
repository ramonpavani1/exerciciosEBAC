public class Main {

    public static void main(String[] args) {

        Class classe = Cliente.class;

        Tabela annotation = (Tabela) classe.getAnnotation(Tabela.class);

        System.out.println("Classe: " + classe.getName() + " Valor: " + annotation.value());
    }
}
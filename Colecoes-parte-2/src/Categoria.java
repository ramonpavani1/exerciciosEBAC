import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Categoria {
    String nome;
    String sexo;

    public void Categorizar() {
        List<String> mulheres = new ArrayList<>();
        List<String> homens = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gostaria de preencher um formulário");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um nome: ");
            nome = scanner.next();
            System.out.println("Digite o sexo: ");
            sexo = scanner.next();
            if (sexo.equals("Feminino")) {
                mulheres.add(nome);
            } else if (sexo.equals("Masculino")) {
                homens.add(nome);
            }
        }
        System.out.println(mulheres);
        System.out.println(homens);
    }
}

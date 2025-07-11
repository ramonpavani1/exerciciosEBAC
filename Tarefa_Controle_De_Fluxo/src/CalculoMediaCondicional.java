import java.util.Scanner;

public class CalculoMediaCondicional {
    Integer n1;
    Integer n2;
    Integer n3;
    Integer n4;
    Float media;

    public void CalcularMediaCondicional(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota da Primeira Prova: ");
        n1 = scanner.nextInt();
        System.out.println("Digite a nota da Segunda Prova: ");
        n2 = scanner.nextInt();
        System.out.println("Digite a nota da Terceira Prova: ");
        n3 = scanner.nextInt();
        System.out.println("Digite a nota da Quarta Prova: ");
        n4 = scanner.nextInt();
        media = (float) ((n1 + n2 + n3 + n4)/4);
        System.out.println("A média anual do Aluno é: " + media);
        if(media >= 7){
            System.out.println("Aluno Aprovado!");
        } else if (media < 7 && media >= 5) {
            System.out.println("Aluno em Recuperação!");
        } else if (media < 5) {
            System.out.println("Aluno Reprovado!");
        }
    }
}

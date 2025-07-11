import java.util.Scanner;

public class CastWrapper {
    int n1;
    Integer neoNumber;

    public void evolveToWrapper(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n1 = scanner.nextInt();
        neoNumber = Integer.valueOf(n1);
        System.out.println("Numero como Wrapper: " + neoNumber);

    }
}

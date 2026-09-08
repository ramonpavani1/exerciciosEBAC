package Colecoes2;

import java.util.Arrays;
import java.util.Scanner;

public class Colecoes2Pt1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os nomes: ");
        String listaNomes = scanner.nextLine();

        String[] nomes = listaNomes.split(" ");

        Arrays.sort(nomes);

        System.out.println(String.join(", ", nomes));
    }
}
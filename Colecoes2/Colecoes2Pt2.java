package Colecoes2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Colecoes2Pt2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os nomes no formato nome-sexo: ");
        String nomesLista = scanner.nextLine();

        String[] letras = nomesLista.split(" ");

        List<String> mulher = new ArrayList<>();
        List<String> homem = new ArrayList<>();

        for (String letra : letras) {
            String[] caracter = letra.split("-");
            String nome = caracter[0];
            String sexo = caracter[1];

            if (sexo.equalsIgnoreCase("F")) {
                mulher.add(nome);
            } else if (sexo.equalsIgnoreCase("M")) {
                homem.add(nome);
            }
        }

        Collections.sort(mulher);
        Collections.sort(homem);

        System.out.println("Mulher: " + String.join(", ", mulher));
        System.out.println("Homem: " + String.join(", ", homem));
    }
}
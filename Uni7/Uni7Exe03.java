package Uni7;

import java.util.Scanner;

public class Uni7Exe03 {

    private void mostrarPalavras(String frase) {
        String[] palavras = frase.trim().split("\\s+");

        System.out.println("\n" + frase + "\n");

        for (String palavra : palavras) {
            System.out.println(palavra + " " + palavra.length());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        Uni7Exe03 programa = new Uni7Exe03();
        programa.mostrarPalavras(frase);

        sc.close();
    }
}
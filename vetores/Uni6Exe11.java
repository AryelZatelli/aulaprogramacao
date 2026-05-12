import java.util.Scanner;

public class Uni6Exe11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // criação dos vetores
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetor3[] = new int[10];

        // leitura do primeiro vetor
        System.out.println("Digite os valores do vetor 1:");
        for (int cont = 0; cont <= 9; cont++) {
            System.out.print("Posição " + cont + ": ");
            vetor1[cont] = sc.nextInt();
        }

        // leitura do segundo vetor
        System.out.println("\nDigite os valores do vetor 2:");
        for (int cont = 0; cont < 10; cont++) {
            System.out.print("Posição " + cont + ": ");
            vetor2[cont] = sc.nextInt();
        }

        // comparação dos vetores
        for (int cont = 0; cont < 10; cont++) {

            if (vetor1[cont] == vetor2[cont]) {
                vetor3[cont] = 1;
            } else {
                vetor3[cont] = 0;
            }

        }

        // mostrar o terceiro vetor
        System.out.println("\nVetor 3:");

        for (int cont = 0; cont < 10; cont++) {
            System.out.print(vetor3[cont] + " ");
        }

        sc.close();
    }
}
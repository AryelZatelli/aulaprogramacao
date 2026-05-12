import java.util.Scanner;

public class Uni6Exe04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetor3[] = new int[10];

        // Leitura vetor 1
        for(int cont = 0; cont <= 9; cont++) {
            System.out.println("Digite o valor de x " + cont);
            vetor1[cont] = sc.nextInt();
        }

        // Leitura vetor 2
        for(int cont = 0; cont <= 9; cont++) {
            System.out.println("Digite o valor de y " + cont);
            vetor2[cont] = sc.nextInt();
        }

        // Soma dos vetores
        for(int cont = 0; cont <= 9; cont++) {
            vetor3[cont] = vetor1[cont] + vetor2[cont];
        }

        // Exibindo vetor 1
        System.out.println("\nVetor 1:");
        for(int cont = 0; cont <= 9; cont++) {
            System.out.print(vetor1[cont] + " ");
        }

        // Exibindo vetor 2
        System.out.println("\nVetor 2:");
        for(int cont = 0; cont <= 9; cont++) {
            System.out.print(vetor2[cont] + " ");
        }

        // Exibindo vetor 3
        System.out.println("\nVetor 3 (soma):");
        for(int cont = 0; cont <= 9; cont++) {
            System.out.print(vetor3[cont] + " ");
        }

        sc.close();
    }
}

/*
e: dois vetores com 10 valores em cada
s: soma de cada posicao dos vetores

inicio
    para cont de 0 ate 9 faça
        ler(vetor1[cont])
    fim para
    para cont de 0 ate 9 faça
        ler(vetor2[cont])
    fim para


    
*/
package beecrowd;

import java.util.Scanner;

public class atividade1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x[] = new int[n];

        int valor = 0;
        int menorValor = valor;
        int posicao = 0;

        for (int cont = 0; cont < n; cont++) {
            valor = sc.nextInt();

            if (valor < menorValor) {
                menorValor = valor;
                posicao = cont;
            }

        }
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicao);
    }
}

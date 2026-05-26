package beecrowd;

import java.util.Scanner;

public class atividade1182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        char T = sc.next().charAt(0);

        double matriz[][] = new double[12][12];

        // preencher matriz
        for (int linha = 0; linha < 12; linha++) {
            for (int coluna = 0; coluna < 12; coluna++) {
                matriz[linha][coluna] = sc.nextDouble();
            }
        }

        double soma = 0;

        // percorrer apenas a linha escolhida
        for (int linha = 0; linha < 12; linha++) {
            soma += matriz[linha][C];
        }

        if (T == 'S') {
            System.out.printf("%.1f\n", soma);
        } else {
            double media = soma / 12;

            System.out.printf("%.1f\n", media);
        }
        sc.close();
    }
}

package Uni5.estruturaFor;

import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // quantidade de linhas
        int num = 1; // número inicial do triângulo

        // loop das linhas
        for (int i = 1; i <= n; i++) {

            // loop das colunas (quantidade de números na linha)
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println(); // quebra de linha após cada linha
        }

        sc.close();
    }
}

/*
 * objetivo: imprimir o Triângulo de Floyd
 * 
 * exemplo (n = 5):
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * 
 * inicio
 * ler(n)
 * num = 1
 * 
 * para i de 1 até n:
 *     para j de 1 até i:
 *         escrever num
 *         num++
 *     pular linha
 */

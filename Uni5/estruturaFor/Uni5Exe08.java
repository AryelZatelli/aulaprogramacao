package Uni5.estruturaFor;

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int menorNegativo = 0;
        boolean temNegativo = false;

        int somaPositivos = 0;
        int qtdPositivos = 0;

        // leitura dos n números
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();

            // verifica negativos
            if (num < 0) {
                if (!temNegativo) {
                    menorNegativo = num;
                    temNegativo = true;
                } else if (num < menorNegativo) {
                    menorNegativo = num;
                }
            }

            // verifica positivos
            if (num > 0) {
                somaPositivos += num;
                qtdPositivos++;
            }
        }

        // saída do menor negativo
        if (temNegativo) {
            System.out.println("Menor valor negativo: " + menorNegativo);
        }

        // cálculo e saída da média dos positivos
        if (qtdPositivos > 0) {
            double media = (double) somaPositivos / qtdPositivos;
            System.out.printf("Média dos números positivos: %.0f\n", media);
        }

        sc.close();
    }
}

/*
 * entrada: n e n números inteiros
 * saída: menor valor negativo e média dos positivos
 * 
 * inicio
 * ler(n)
 * menorNegativo = 0
 * temNegativo = falso
 * somaPositivos = 0
 * qtdPositivos = 0
 * 
 * para i de 1 até n:
 *     ler(num)
 *     
 *     se num < 0:
 *         se não temNegativo:
 *             menorNegativo = num
 *             temNegativo = verdadeiro
 *         senão se num < menorNegativo:
 *             menorNegativo = num
 *     
 *     se num > 0:
 *         somaPositivos += num
 *         qtdPositivos++
 * 
 * se temNegativo:
 *     escrever menorNegativo
 * 
 * se qtdPositivos > 0:
 *     media = somaPositivos / qtdPositivos
 *     escrever media
 */

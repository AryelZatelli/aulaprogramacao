package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int divisor = 2;

        // decomposição em fatores primos
        while (n > 1) {
            if (n % divisor == 0) {
                System.out.println(n + "\t" + divisor);
                n = n / divisor;
            } else {
                divisor++;
            }
        }

        // última linha
        System.out.println("1");

        sc.close();
    }
}

/*
 * entrada: número inteiro positivo n
 * saída: decomposição em fatores primos passo a passo
 * 
 * exemplo:
 * 180  2
 * 90   2
 * 45   3
 * 15   3
 * 5    5
 * 1
 * 
 * inicio
 * ler(n)
 * divisor = 2
 * 
 * enquanto n > 1:
 *     se n % divisor == 0:
 *         escrever n e divisor
 *         n = n / divisor
 *     senão:
 *         divisor++
 * 
 * escrever 1
 */

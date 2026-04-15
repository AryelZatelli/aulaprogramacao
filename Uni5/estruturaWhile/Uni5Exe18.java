package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int canal = sc.nextInt();

        int c4 = 0, c5 = 0, c9 = 0, c12 = 0;
        int totalPessoas = 0;

        // leitura até canal = 0
        while (canal != 0) {
            int pessoas = sc.nextInt();

            if (canal == 4) {
                c4 += pessoas;
            } else if (canal == 5) {
                c5 += pessoas;
            } else if (canal == 9) {
                c9 += pessoas;
            } else if (canal == 12) {
                c12 += pessoas;
            }

            totalPessoas += pessoas;

            canal = sc.nextInt();
        }

        // cálculo dos percentuais
        double p4 = (c4 * 100.0) / totalPessoas;
        double p5 = (c5 * 100.0) / totalPessoas;
        double p9 = (c9 * 100.0) / totalPessoas;
        double p12 = (c12 * 100.0) / totalPessoas;

        // saída
        System.out.printf("Percentual de audiência do canal 4: %.0f%%\n", p4);
        System.out.printf("Percentual de audiência do canal 5: %.0f%%\n", p5);
        System.out.printf("Percentual de audiência do canal 9: %.0f%%\n", p9);
        System.out.printf("Percentual de audiência do canal 12: %.0f%%\n", p12);

        sc.close();
    }
}

/*
 * entrada: canal e número de pessoas assistindo (até canal = 0)
 * saída: percentual de audiência de cada canal (4, 5, 9, 12)
 * 
 * inicio
 * ler(canal)
 * 
 * c4 = c5 = c9 = c12 = 0
 * totalPessoas = 0
 * 
 * enquanto canal != 0:
 *     ler(pessoas)
 *     
 *     se canal == 4:
 *         c4 += pessoas
 *     senao se canal == 5:
 *         c5 += pessoas
 *     senao se canal == 9:
 *         c9 += pessoas
 *     senao se canal == 12:
 *         c12 += pessoas
 *     
 *     totalPessoas += pessoas
 *     
 *     ler(canal)
 * 
 * calcular percentuais
 * escrever resultados
 */
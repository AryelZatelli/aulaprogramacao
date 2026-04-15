package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1 = 0, v2 = 0, v3 = 0, v4 = 0;
        int total = 0;

        char continuar = 's';

        // loop de votação
        while (continuar == 's' || continuar == 'S') {

            int voto = sc.nextInt();

            switch (voto) {
                case 1:
                    v1++;
                    break;
                case 2:
                    v2++;
                    break;
                case 3:
                    v3++;
                    break;
                case 4:
                    v4++;
                    break;
            }

            total++;

            // pergunta se deseja continuar
            continuar = sc.next().charAt(0);
        }

        // cálculo dos percentuais
        double p1 = (v1 * 100.0) / total;
        double p2 = (v2 * 100.0) / total;
        double p3 = (v3 * 100.0) / total;
        double p4 = (v4 * 100.0) / total;

        // determinar vencedor
        int vencedor = 1;
        int maior = v1;

        if (v2 > maior) {
            maior = v2;
            vencedor = 2;
        }
        if (v3 > maior) {
            maior = v3;
            vencedor = 3;
        }
        if (v4 > maior) {
            maior = v4;
            vencedor = 4;
        }

        // saída
        System.out.println("Votos:");
        System.out.println("Nenhum de Nós: " + v1);
        System.out.println("CPM22: " + v2);
        System.out.println("Skank: " + v3);
        System.out.println("Jota Quest: " + v4);

        System.out.printf("Percentuais:\n");
        System.out.printf("Nenhum de Nós: %.2f%%\n", p1);
        System.out.printf("CPM22: %.2f%%\n", p2);
        System.out.printf("Skank: %.2f%%\n", p3);
        System.out.printf("Jota Quest: %.2f%%\n", p4);

        System.out.println("Vencedor: " + vencedor);

        sc.close();
    }
}

/*
 * entrada:
 * votos (1 a 4)
 * continuar (s/n)
 * 
 * saída:
 * total de votos por grupo
 * percentual de votos
 * grupo vencedor
 * 
 * inicio
 * v1, v2, v3, v4 = 0
 * total = 0
 * continuar = 's'
 * 
 * enquanto continuar == 's':
 *     ler(voto)
 *     
 *     somar voto correspondente
 *     total++
 *     
 *     ler(continuar)
 * 
 * calcular percentuais
 * 
 * verificar maior votação (vencedor)
 * 
 * escrever resultados
 */

package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt(); // dia da semana do dia 1
        int n = sc.nextInt(); // número de dias do mês

        // cabeçalho
        System.out.println("D\tS\tT\tQ\tQ\tS\tS");

        // espaços antes do dia 1
        for (int i = 1; i < p; i++) {
            System.out.print("\t");
        }

        // imprime os dias
        for (int dia = 1; dia <= n; dia++) {
            System.out.print(dia + "\t");

            // quebra linha no final da semana
            if ((dia + p - 1) % 7 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}

/*
 * entrada:
 * p → dia da semana do dia 1 (1=Dom, ..., 7=Sáb)
 * n → número de dias do mês
 * 
 * saída:
 * calendário formatado
 * 
 * inicio
 * ler(p, n)
 * 
 * escrever cabeçalho (D S T Q Q S S)
 * 
 * imprimir (p-1) espaços
 * 
 * para dia de 1 até n:
 *     escrever dia
 *     
 *     se (dia + p - 1) % 7 == 0:
 *         quebrar linha
 */

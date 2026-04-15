package Uni5.estruturaFor;

import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lucroMenor10 = 0;
        int lucroEntre10e20 = 0;
        int lucroMaior20 = 0;

        double totalCompra = 0;
        double totalVenda = 0;

        // leitura das 20 mercadorias
        for (int i = 1; i <= 20; i++) {
            String nome = sc.next();      // nome da mercadoria
            double pc = sc.nextDouble(); // preço de compra
            double pv = sc.nextDouble(); // preço de venda

            double lucroPercentual = (pv - pc) / pc * 100;

            // classificação do lucro
            if (lucroPercentual < 10) {
                lucroMenor10++;
            } else if (lucroPercentual <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }

            // acumula valores
            totalCompra += pc;
            totalVenda += pv;
        }

        double lucroTotal = totalVenda - totalCompra;

        // saídas
        System.out.println("Lucro < 10%: " + lucroMenor10);
        System.out.println("Lucro entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("Lucro > 20%: " + lucroMaior20);
        System.out.printf("Valor total de compra: %.2f\n", totalCompra);
        System.out.printf("Valor total de venda: %.2f\n", totalVenda);
        System.out.printf("Lucro total: %.2f\n", lucroTotal);

        sc.close();
    }
}

/*
 * entrada: nome, preço de compra (PC) e preço de venda (PV) de 20 mercadorias
 * saída:
 * - quantidade de mercadorias com lucro < 10%
 * - quantidade entre 10% e 20%
 * - quantidade > 20%
 * - total de compra, total de venda e lucro total
 * 
 * inicio
 * lucroMenor10 = 0
 * lucroEntre10e20 = 0
 * lucroMaior20 = 0
 * totalCompra = 0
 * totalVenda = 0
 * 
 * para i de 1 até 20:
 *     ler(nome, pc, pv)
 *     
 *     lucro% = (pv - pc) / pc * 100
 *     
 *     se lucro% < 10:
 *         lucroMenor10++
 *     senao se lucro% <= 20:
 *         lucroEntre10e20++
 *     senao:
 *         lucroMaior20++
 *     
 *     totalCompra += pc
 *     totalVenda += pv
 * 
 * lucroTotal = totalVenda - totalCompra
 * 
 * escrever resultados
 */

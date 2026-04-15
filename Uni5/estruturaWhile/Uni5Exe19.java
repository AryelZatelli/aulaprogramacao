package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        double totalRecebido = 0;

        // leitura até valor = 0
        while (valor != 0) {

            double totalPagar;

            // aplica desconto
            if (valor > 500) {
                totalPagar = valor * 0.8; // 20% de desconto
            } else {
                totalPagar = valor * 0.85; // 15% de desconto
            }

            // mostra valor a pagar
            System.out.printf("Valor a pagar: R$%.2f\n", totalPagar);

            // acumula total do dia
            totalRecebido += totalPagar;

            valor = sc.nextDouble();
        }

        // total final do dia
        System.out.printf("O valor total recebido foi de R$%.2f\n", totalRecebido);

        sc.close();
    }
}

/*
 * entrada: valores de compras (até digitar 0)
 * saída: valor a pagar por compra e total recebido no dia
 * 
 * inicio
 * ler(valor)
 * totalRecebido = 0
 * 
 * enquanto valor != 0:
 *     se valor > 500:
 *         totalPagar = valor * 0.8
 *     senao:
 *         totalPagar = valor * 0.85
 *     
 *     escrever(totalPagar)
 *     totalRecebido += totalPagar
 *     
 *     ler(valor)
 * 
 * escrever totalRecebido
 */
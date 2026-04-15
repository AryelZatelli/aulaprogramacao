package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double limiteKg = sc.nextDouble(); // limite diário em Kg
        double totalKg = 0;

        char continuar = 's';

        // loop para leitura dos peixes
        while (continuar == 's' || continuar == 'S') {

            double pesoGramas = sc.nextDouble(); // peso do peixe em gramas
            double pesoKg = pesoGramas / 1000.0; // converte para Kg

            totalKg += pesoKg;

            // mostra total até o momento
            System.out.printf("Peso total até agora: %.2f Kg\n", totalKg);

            // verifica se ultrapassou o limite
            if (totalKg > limiteKg) {
                System.out.println("Limite diário excedido!");
                break;
            }

            // pergunta se deseja continuar
            continuar = sc.next().charAt(0);
        }

        sc.close();
    }
}

/*
 * entrada:
 * limite diário em Kg
 * pesos dos peixes em gramas
 * 
 * saída:
 * peso acumulado da pesca
 * mensagem quando ultrapassar o limite
 * 
 * inicio
 * ler(limiteKg)
 * totalKg = 0
 * continuar = 's'
 * 
 * enquanto continuar == 's':
 *     ler(pesoGramas)
 *     pesoKg = pesoGramas / 1000
 *     
 *     totalKg += pesoKg
 *     escrever totalKg
 *     
 *     se totalKg > limiteKg:
 *         escrever "limite excedido"
 *         parar
 *     
 *     ler(continuar)
 */

package Uni5.estruturaFor;

import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0.0;

        // loop para ler a altura de 20 pessoas
        for (int i = 1; i <= 20; i++) {
            double altura = sc.nextDouble(); // lê a altura da pessoa
            soma += altura; // acumula na soma
        }

        // cálculo da média
        double media = soma / 20;

        // exibe o resultado
        System.out.printf("A média das alturas é: %.2f\n", media);

        sc.close();
    }
}

/*
 * entrada: altura de 20 pessoas
 * saída: média das alturas
 * 
 * inicio
 * soma = 0
 * 
 * para i de 1 até 20:
 *     ler(altura)
 *     soma = soma + altura
 * 
 * media = soma / 20
 * escrever(media)
 */
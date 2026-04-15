package Uni5.estruturaFor;

import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ler o valor de n (quantidade de termos)
        int n = sc.nextInt();

        // variável para acumular a soma
        double soma = 0.0;

        // loop para calcular a soma da sequência 1/1 + 1/2 + ... + 1/n
        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i; // soma o termo atual
        }

        // exibir o resultado com 2 casas decimais
        System.out.printf("%.2f\n", soma);

        sc.close();
    }
}

/*
 * entrada: valor inteiro n
 * saída: soma da sequência 1/1 + 1/2 + ... + 1/n
 * 
 * inicio
 * ler(n)
 * soma = 0
 * 
 * para i de 1 até n:
 *     soma = soma + (1 / i)
 * 
 * escrever(soma)
 */
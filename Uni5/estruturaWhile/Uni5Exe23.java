package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char continuar = 's';

        // loop para vários vendedores
        while (continuar == 's' || continuar == 'S') {

            String nome = sc.next();
            int n = sc.nextInt(); // quantidade de produtos

            double totalVendas = 0;

            // leitura dos produtos
            for (int i = 1; i <= n; i++) {
                double preco = sc.nextDouble();
                int quantidade = sc.nextInt();

                totalVendas += preco * quantidade;
            }

            double salario = totalVendas * 0.30; // 30% de comissão

            // relatório do vendedor
            System.out.println("Nome: " + nome);
            System.out.printf("Total de vendas: R$%.2f\n", totalVendas);
            System.out.printf("Salário: R$%.2f\n", salario);

            // pergunta se deseja continuar
            continuar = sc.next().charAt(0);
        }

        sc.close();
    }
}

/*
 * entrada:
 * nome do vendedor
 * n (quantidade de produtos)
 * para cada produto: preço e quantidade
 * 
 * saída:
 * nome, total de vendas e salário (30% comissão)
 * 
 * inicio
 * continuar = 's'
 * 
 * enquanto continuar == 's':
 *     ler(nome)
 *     ler(n)
 *     totalVendas = 0
 *     
 *     para i de 1 até n:
 *         ler(preco, quantidade)
 *         totalVendas += preco * quantidade
 *     
 *     salario = totalVendas * 0.30
 *     
 *     escrever nome, totalVendas, salario
 *     
 *     ler(continuar)
 */
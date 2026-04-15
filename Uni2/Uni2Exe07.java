package Uni2;

import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor:");
        String nome = sc.nextLine();
        System.out.println("Digite o salário:");
        double salario = sc.nextDouble();
        System.out.println("Total de vendas no mês(em dinheiro):");
        double vendas = sc.nextDouble();

        double comissao = vendas * 0.15;

        double receber = salario + comissao;        

        System.out.printf("Total = R$ %.2f\n", receber);

        sc.close();
    }
}

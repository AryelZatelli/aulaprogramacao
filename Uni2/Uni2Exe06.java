package Uni2;

import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de um funcionário:");
        int numero = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas:");
        int horas = sc.nextInt();
        System.out.println("Digite o valor recebido por hora:");
        double valor = sc.nextDouble();

        double salario = horas *  valor;

        System.out.printf("Número: %d\nSalário: %.2f\n", numero, salario );

        sc.close();
    }
}

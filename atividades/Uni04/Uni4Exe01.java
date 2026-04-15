package Uni04;

import java.util.Scanner;

public class Uni4Exe01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Horas trabalhadas no mês: ");
        int horas = sc.nextInt();

        System.out.print("Valor pago por hora: ");
        double valorHora = sc.nextDouble();

        int horasNormais = 160;
        double salario;

        if (horas <= horasNormais) {
            salario = horas * valorHora;
        } else {
            int horasExtras = horas - horasNormais;
            double valorHoraExtra = valorHora * 1.5;

            salario = (horasNormais * valorHora) + (horasExtras * valorHoraExtra);
        }

        System.out.printf("O salário total é: %.2f\n", salario);

        sc.close();
    }
}

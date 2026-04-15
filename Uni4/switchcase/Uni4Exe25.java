package Uni4.switchcase;

import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double v1 = sc.nextDouble();
        double v2 = sc.nextDouble();
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(v1 + v2);
                break;
            case 2:
                System.out.println(v1 - v2);
                break;
            case 3:
                System.out.println(v1 * v2);
                break;
            case 4:
                if (v2 != 0) {
                    System.out.println(v1 / v2);
                } else {
                    System.out.println("Erro: divisão por zero");
                }
                break;
            default:
                System.out.println("Opção inválida");
        }

        sc.close();
    }
}
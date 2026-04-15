package operadoreslogicos;

import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Não válida");
        } else if (mes == 2) {
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                if (dia >= 1 && dia <= 29) {
                    System.out.println("Válida");
                } else {
                    System.out.println("Não válida");
                }
            } else {
                if (dia >= 1 && dia <= 28) {
                    System.out.println("Válida");
                } else {
                    System.out.println("Não válida");
                }
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia >= 1 && dia <= 30) {
                System.out.println("Válida");
            } else {
                System.out.println("Não válida");
            }
        } else {
            if (dia >= 1 && dia <= 31) {
                System.out.println("Válida");
            } else {
                System.out.println("Não válida");
            }
        }

        sc.close();
    }
}
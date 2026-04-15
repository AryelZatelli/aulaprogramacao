package Uni04;

import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = sc.nextDouble();
        int parteInteira = (int) numero;

        if (numero - parteInteira > 0) {
            System.out.println("Casas decimais foram digitadas.");
        } else {
            System.out.println("Casas decimais não foram digitadas.");
        }


        sc.close();
    }
}

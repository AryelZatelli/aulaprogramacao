package Uni04;

import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }

        sc.close();
    }
}

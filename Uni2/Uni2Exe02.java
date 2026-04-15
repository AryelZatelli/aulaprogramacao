package Uni2;

import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int A = sc.nextInt();
        System.out.println("Digite um número inteiro");
        int B = sc.nextInt();

        int C = A * B;

        System.out.println("Resultado = " + C);

        sc.close();
    }
}

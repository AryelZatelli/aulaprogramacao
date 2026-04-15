package Uni04;

import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("O valor " + n1 + " é maior do que o valor " + n2);
        } else {
            System.out.println("O valor " + n2 + " é maior do que o valor " + n1);
        }

        sc.close();
    }
}

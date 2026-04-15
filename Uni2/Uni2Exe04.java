package Uni2;

import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota A");
        double A = sc.nextDouble();
        System.out.println("Digite a nota B");
        double B = sc.nextDouble();
        
        double media = (A * 3.5 + B * 7.5) / 11;

        System.out.printf("Média : %.2f\n", media);
        sc.close();
    }
}

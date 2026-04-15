package Uni2;

import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio");
        double raio = sc.nextDouble();
        
        double A = Math.PI * (raio * raio);
        
        System.out.printf("Área = %.2f\n", A);

        sc.close();
    }
}

package operadoreslogicos;

import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É isóceles.");
            } else {
                System.out.println("É escaleno.");
            }

        } else {
            System.out.println("Não formam um triangulo.");
        }

        sc.close();
    }
}
package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        int n20 = valor / 20;
        valor = valor % 20;

        int n10 = valor / 10;
        valor = valor % 10;

        int n5 = valor / 5;
        valor = valor % 5;

        int n2 = valor / 2;
        valor = valor % 2;

        int n1 = valor;

        System.out.println("Cédulas de 20: " + n20);
        System.out.println("Cédulas de 10: " + n10);
        System.out.println("Cédulas de 5: " + n5);
        System.out.println("Cédulas de 2: " + n2);
        System.out.println("Cédulas de 1: " + n1);

        sc.close();
    }
}

/*
 * entrada: valor inteiro
 * saída: quantidade mínima de cédulas (20, 10, 5, 2, 1)
 * 
 * lógica:
 * usar divisão inteira e resto (%)
 * sempre começar pelas maiores cédulas
 * 
 * inicio
 * ler(valor)
 * 
 * n20 = valor / 20
 * valor = valor % 20
 * 
 * n10 = valor / 10
 * valor = valor % 10
 * 
 * n5 = valor / 5
 * valor = valor % 5
 * 
 * n2 = valor / 2
 * valor = valor % 2
 * 
 * n1 = valor
 * 
 * escrever resultados
 */
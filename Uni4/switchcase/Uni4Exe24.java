package Uni4.switchcase;

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ler os três valores
        System.out.println("Escreva o valor 1");
        int valor1 = sc.nextInt();
        System.out.println("Escreva o valor 2");
        int valor2 = sc.nextInt();
        System.out.println("Escreva o valor 3");
        int valor3 = sc.nextInt();

        // achar maior, menor e medio
        int maior, menor, medio;

        // verificar se o 1 é o maior entre os três
        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
            // testar menor entre 2 e 3
            if (valor2 < valor3) {
                menor = valor2;
                medio = valor3;
            } else {
                menor = valor3;
                medio = valor2;
            }
        } else {
            // testar se o 2 é o maior
            if (valor2 > valor3) {
                maior = valor2;
                // testar o menor
                if (valor1 < valor3) {
                    menor = valor1;
                    medio = valor3;
                } else {
                    menor = valor3;
                    medio = valor1;
                }
            } else {
                maior = valor3;
                // testar se o 1 é o menor
                if (valor1 < valor2) {
                    menor = valor1;
                    medio = valor2;
                } else {
                    menor = valor2;
                    medio = valor1;
                }
            }
        }

        // ler opcao
        System.out.println("Digite a opção 1 (crescente), 2 (decrescente), 3 (maior entre os três)");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.printf("%d, %d, %d", menor, medio, maior);
                break;
            case 2:
                System.out.printf("%d, %d, %d", maior, medio, menor);
                break;
            case 3:
                System.out.printf("%d, %d, %d", menor, maior, medio);
                break;

        }

        sc.close();
    }
}

/*
 * entrada: valor1
 * valor2
 * valor3
 * 
 * saída: valores ordenados dependendo da opção
 * 
 * inicio
 * ler(valor1,valor2,valor3)
 * achar o maior, médio e menor
 * 
 * ler(opção)
 * escolha opção
 * A: escrever(menor, medio, maior)
 * Z: escrever(maior, medio, menor)
 * S: escrever(menor, maior, medio)
 * fim escolha
 * 
 * 
 * se valor1 > valor2 E valor1 > valor3 entao
 * maior = valor1
 * se valor2 < valor 3
 * menor = valor2
 * medio = valor3
 * senao
 * menor = valor3
 * medio = valor2
 * fim se
 * senao
 * se valor2 > valor3
 * maior = valor2
 * se valor1 < valor3
 * menor = valor1
 * medio = valor3
 * senao
 * menor = valor3
 * medio = valor1
 * fim se
 * senao
 * maior = valor3
 * se valor1 < valor2
 * menor = valor1
 * medio = valor2
 * senao
 * menor = valor2
 * medio = valor1
 * fim se
 * 
 */
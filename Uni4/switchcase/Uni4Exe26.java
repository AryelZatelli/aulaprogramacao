package Uni4.switchcase;

import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ler a opção

        System.out.println("Digite a opção: ");
        System.out.println("T - Triângulo");
        System.out.println("Q - Quadrado");
        System.out.println("R - Retângulo");
        System.out.println("C - Círculo");

        char opcao = sc.next().charAt(0);
        // converter para maiúsculo
        opcao = Character.toUpperCase(opcao);
        // definir a variavel para calculo da área
        double area = 0;

        // escolher a opção

        switch (opcao) {
            case 'T': {
                System.out.println("Digite a base e a altura");
                float base = sc.nextFloat();
                float altura = sc.nextFloat();
                // calcular a área
                area = base * altura / 2;
                break;
            }
            case 'Q': {
                System.out.println("Digite o lado");
                float lado = sc.nextFloat();
                // calcular a area
                area = lado * lado;
                break;
            }
            case 'R': {
                System.out.println("Digite a base e a altura");
                float base = sc.nextFloat();
                float altura = sc.nextFloat();
                // calcular a área
                area = base * altura;
                break;
            } 
            case 'C': {
                System.out.println("Digite o raio");
                float raio = sc.nextFloat();
                // calcular o raio
                area = Math.PI * raio * raio;
                break;                
            }
        }
        System.out.printf("Área = %f", area);
        
        sc.close();
    }
}

/* 
e: opção

'T': base, altura
'Q': lado
'R': base, altura
'C': raio

s: área

inicio
    ler(opção)
    escolha opção
        'T': ler (base, altura)
            area: (base * altura)/2
        'Q': ler (lado)
            area: lado * lado
        'R': ler (base, altura)
            area base * altura
        'C': ler (area)
            area = pi * raio * raio

    fim escolha
    escrever(area)
*/
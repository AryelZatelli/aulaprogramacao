package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ler o nome que é um "flag" - variável que sinaliza uma condição de fim de leitura
        System.out.println("Digite o nome: ");
        String nome = sc.next();
        // enquanto flag(nome) não for "Fim"
        while (!nome.equalsIgnoreCase("fim")) {
            // ler as notas
            System.out.println("Digite a primeira nota: ");
            float nota1 = sc.nextFloat();
            System.out.println("Digite a segunda nota: ");
            float nota2 = sc.nextFloat();

            // calcular media
            float media = (nota1 + nota2) / 2;

            // escrever o nome e a média

            System.out.printf("A média do(a) %s é %.1f\n", nome, media);

            // ler o proximo nome
            System.out.println("Digite o nome: ");
            nome = sc.next();
        }

        sc.close();
    }
}

/*
e: nome
   duas notas

s: media de cada aluno

    inicio
      ler(nome)
      enquanto nome != "fim" faça
        ler ( nota1, nota2)
        media: (nota1 + nota2) /2

        escrever (nome, media)
        ler(nome)
      fim enquanto
*/
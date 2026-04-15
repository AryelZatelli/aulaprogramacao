package Uni4.switchcase;

import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ler a opção
        System.out.println("Digite a opção entre 1 e 4: ");
        int opcao = sc.nextInt();
        // selecionar a opção
        switch (opcao) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação.");
                break;
            case 2:
                System.out.println("Licenciado em Computação.");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas da Informação.");
                break;
            case 4:
                System.out.println("Bacharel em Ciência de Dados.");
                break;
            default:
                System.out.println("Opção inválida.");

        }
        sc.close();
    }
}

/*
 * entrada: opção do aluno
 * saída: titulo relativo a opção
 * 
 * inicio
 * ler(opcao)
 * escolha(opcao)
 * 
 * 1: escrever("Bacharel em Ciência da Computação")
 * 2: escrever("Licenciado em Computação")
 * 3: escrever("Bacharel em Sistemas da Informação")
 * 4: escrever("Bacharel em Ciência de Dados")
 * 
 * senao
 * escrever("Opção inválida")
 */

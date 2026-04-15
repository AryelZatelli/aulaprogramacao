package Uni5.estruturaDoWhile;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o limite diário de pesca (em Kg)");
        double limiteDiario = sc.nextDouble();

        double somaPeso = 0;

        char opcao = 'S'; // inicializa corretamente

        do {
            System.out.println("Informe o peso do peixe (em g): ");
            double pesoPeixe = sc.nextDouble();

            somaPeso += pesoPeixe;

            System.out.println("Pescado até o momento (em g): " + somaPeso);

            if (somaPeso > limiteDiario * 1000) {
                System.out.println("Excedeu o limite diário.");
                break;
            }

            System.out.println("Deseja informar o peso de mais um peixe? (S/N) ");
            opcao = sc.next().charAt(0);

        } while (opcao == 'S' || opcao == 's');

        sc.close();
    }
}


/*
e: limite diário
   peso(de varios peixes)
   continuar digitação
s: peso total(a cada peixe)
   mensagem: excedeu limite 

inicio:
    ler(limiteDiario)
    somaPeso = 0
    faça
        ler(pesoPeixe)
        somaPeso = somaPeso + pesoPeixe
        escreva(somaPeso)
        se somaPeso > limiteDiario * 1000 entao
            escrever("excedeu o limite")
            parar a repeticao
        fim se
        escreva("deseja informar o peso de mais um peixe? s/n")
        ler(opção)
    enquanto opção = s
*/
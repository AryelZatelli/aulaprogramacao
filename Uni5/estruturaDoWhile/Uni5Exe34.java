package Uni5.estruturaDoWhile;

import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // inicializar contas encerradas
        int contasEncerradas = 0;
        // variavel para opção
        int opcao;
        // repetir ate opcao 3
        do {
            System.out.println("(1) - Encerrar Conta");
            System.out.println("(2) - Contas Encerradas.");
            System.out.println("(3) - Sair");
            opcao = sc.nextInt();
            // escolher opcao
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome: ");
                    sc.nextLine(); // limpar buffer
                    String nome = sc.nextLine();

                    System.out.println("Digite o número de diárias");
                     int numeroDiarias = sc.nextInt();
                    // verificar taxa de servico de acordo com as diarias
                    float taxaServico;
                    if (numeroDiarias < 15) {
                        taxaServico = 7.5f;
                    } else {
                        if (numeroDiarias == 15) {
                            taxaServico = 6.5f;
                        } else {
                            taxaServico = 5.0f;
                        }
                    }
                    System.out.println("Nome = " + nome);
                    System.out.printf("Valor a pagar = %.2f\n ", taxaServico * numeroDiarias + 50.0);
                    // contar as contas encerradas
                    contasEncerradas++;
                    break;
                case 2:
                    System.out.println("Contas Encerradas = " + contasEncerradas);
            }
        } while (opcao != 3);
        sc.close();
    }
}

/*
e: opcao  
   1- nome cliente
      qtde de diarias
   
      
s: 1- nome cliente
      total a ser pago 
   2- numero de hospedes q deixaram o hotel
   3- finalizar 

inicio
    contasEncerradas = 0
    
    faça
        escrever("1 - encerrar..."
                 "2 - verificar..."
                 "3 - sair")
        ler (opcao)
        escolha (opcao)
            1: ler(nome)
               ler(numeroDiarias)
               se numeroDiarias < 15 
                  taxaServico = 7.5
                se nao
                  numeroDiarias = 15
                  taxaServico = 6.5
                se nao
                  taxaServico = 5
                fim se
              fim se
             valorPago = taxaServico * numeroDiarias + 50           
             escrever(nome, valorPago)
             contasEncerradas = contasEncerradas + 1
            
             2: escrever(contasEncerradas)
        fim escolha
    enquanto(opcao !=3 )
fim
*/
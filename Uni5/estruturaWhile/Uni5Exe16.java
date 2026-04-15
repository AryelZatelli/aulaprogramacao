package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inicializar variaveis
        double somaAltura   = 0; // soma das alturas de todas as pessoas
        double somaFeminino = 0; // soma da altura das mulheres
        int contPessoas     = 0; // quantidade de pessoas digitadas
        int contFeminino    = 0; // quantidade de mulheres

        // ler a altura
        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();
        // repetição com flag 0 para altura

        while (altura != 0 ) {
            System.out.println("Digite o gênero: ");
            // ler o gênero
            char genero = sc.next().charAt(0);
            
            // somar as alturas e contar as pessoas
            somaAltura += altura;
            contPessoas++; // acrescenta uma unidade na variável

            if (genero == 'F' || genero == 'f') {
                somaFeminino += altura;
                contFeminino++;
            } 
            System.out.println("Digite a altura: ");
            altura = sc.nextDouble();
        }

        if (contPessoas > 0) {
            System.out.println("Media da altura das pessoas = " + (somaAltura/contPessoas));
        } else {
            System.out.println("Não foram digitados dados");
        } 
        if (contFeminino > 0) {
            System.out.println("Media de altura das mulheres = " + (somaFeminino/contFeminino));
        } else{
            System.out.println("Não foram digitados dados de mulheres");
        }

        sc.close();
    }
}

/*
e: genero   flag ativado
   altura   flag ativado 

s: media da altura do grupo
   media da altura das mulheres

[ 
    leitura com flag
    soma
    contagem de valores
    media
]


    inicio
      ler(altura)
      somaFeminino = 0
      contF = 0
      somaAltura = 0      -> soma de valores
      cont = 0            -> contagem de quantidades

       enquanto(altura != 0) faça
         ler(genero)
         somaAltura = somaAltura + altura
         cont = cont+A
          se genero = 'F' entao
            somaFeminino = somaFeminino + altura
            contF = contF+1
          fim se
         ler(altura)
        fim enquanto
      escrever(somaAltura/cont)  
      escrever(SomaFeminino/contF)
    fim se  

*/
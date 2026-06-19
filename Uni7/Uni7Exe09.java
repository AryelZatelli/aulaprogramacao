package Uni7;

import java.util.Scanner;

public class Uni7Exe09 {

    private String decToBin(int decimal) {
        /* função que recebe um numero decimal e converte para binário */
        int numero = decimal;
        // criar variavel para binário
        String binario = ""; 
        // enquanto nao chegar no fim do decimal
        while (numero > 0) {
            // concatenar o resto da divisao do numero com oq eu tinha no binario
            binario = numero % 2 + binario;
            // dividir o numero por 2 para saber o proximo binario
            numero/=2;  // equivale a numero = numero / 2
        }
        return binario;
    }

    public int binToDec(String binario) {
        /* função que recebe um binário e retornar um numero decimal */
        // inicializar uma variavel para a soma dos termos
        int soma = 0;
        // controla a posição do caracter no String
        int posicao = 0;
        // repetição para todos os elementos do binario
        for (int cont = binario.length() - 1; cont >= 0; cont--) {
            if (binario.charAt(posicao) != '0') {   
                soma+= Math.pow(2, cont);
            }
            // passar para a proxima posição
            posicao++;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Uni7Exe09 exercicio = new Uni7Exe09();

        int opcao;
        int decimal;
        String binario;

        do {
            System.out.println("Escolha a conversão");
            System.out.println("1 - Decimal para binário");
            System.out.println("2 - Binário para decimal");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Informe um número decimal");
                    decimal = sc.nextInt();
                    binario = exercicio.decToBin(decimal);
                    System.out.print("\nNúmero em binário " + binario + "\n");
                    break;

                case 2:
                    System.out.println("Informe um número binário");
                    sc.nextLine();
                    binario = sc.nextLine();
                    decimal = exercicio.binToDec(binario);
                    System.out.print("\nNúmero em decimal " + decimal + "\n");
                    break;
            }

        } while (opcao >= 1 && opcao <= 2);

        sc.close();
    }
}
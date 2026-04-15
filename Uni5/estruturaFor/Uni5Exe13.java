package Uni5.estruturaFor;

import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ler quantidade de abastecimento
        System.out.println("Informe o número de abastecimentos: ");
        int abastecimentos = sc.nextInt();
        //inicializar a soma do combustível
        float somaKilometragem = 0;
        float somaCombustivel =0;
        // repetir para cada abastecimento

        for (int cont = 0; cont < abastecimentos; cont++) {
            // informar a kilometragem e o combustivel do abastecimento
            System.out.println("Informe a kilometragem");
            float km = sc.nextFloat();
            System.out.println("Informe a quantidade de combustível");
            float combustivel = sc.nextFloat();
            // informar o consumo
            System.out.printf("Consumo = %.2f\n", km / combustivel);
            // somar a kilometragem e o combustivel total da viagem
            somaKilometragem += km;
            somaCombustivel += combustivel;
        }   
            System.out.printf("Consumo total = %.2f\n", somaKilometragem / somaCombustivel);

            sc.close();
    }
}

/*
e: n° de abastecimentos
    a cada parada
      * km 
      * combustível

s:  a cada parada
      * consumo
   fim da viagem
    consumo total

inicio
    ler(abastecimentos)
    somaKm = 0
    somaLt = 0;
     para cont de 1 até abastecimentos faça
    ler (km)
    ler (combustivel)
    consumo = km / combustivel
    escrever(consumo)
    somaKm++
    somaLt++
    consumoTotal = somaKm / somaLt
*/
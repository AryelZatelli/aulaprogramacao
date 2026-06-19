package Uni7;

import java.util.Scanner;

public class Uni7Exe08 {

    public int[] lerVetorInteiros () { 
        /* função cria um vetor de 5 posições inteiras */
        Scanner sc = new Scanner(System.in);
        // criar o vetor
        int vetorInt[] = new int[5];
        // ler o vetor
        for(int cont = 0; cont < 5; cont++) {
            System.out.println("Digite o valor da posição " + cont);
            vetorInt[cont] = sc.nextInt();
        }
        return vetorInt;
    }

    private int calcularAfinidade (int vetorA[], int vetorB[]) {
        /* função que calcula a afinidade entre os vetores */
        int afinidade = 0;
        int diferenca;
        // percorrer os dois vetores
        for(int cont = 0; cont<5; cont++) {
            diferenca = Math.abs(vetorA[cont] - vetorB[cont]);
            if (diferenca == 0) {
                afinidade+=3;
            } else if (diferenca >= 3) {
                afinidade-=2;
            } else 
                afinidade++;
        } 
        return afinidade;
    }



    public static void main(String[] args) {
        Uni7Exe08 exercicio = new Uni7Exe08();
        // ler os valores da pessoa A
        System.out.println("Digite os valores da primeira pessoa");
        int vetorA[] = exercicio.lerVetorInteiros();
        // ler os valores da pessoa B
        System.out.println("Digite os valores da segunda pessoa");
        int vetorB[] = exercicio.lerVetorInteiros();

        // calcular a afinidade
        System.out.println("Afinidade = " + exercicio.calcularAfinidade(vetorA, vetorB));

    }

    
}

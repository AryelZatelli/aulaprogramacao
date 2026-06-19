package Uni7;

import java.util.Scanner;

public class Uni7Exe16 {
    
    private int[] lerVetor(int n, Scanner sc) {
        /* metodo que le os valores e armazena em um vetor de numeros inteiros */
        // criar o vetor
        int minutos[] = new int[n];
        // ler os valores
        for(int cont = 0; cont < n; cont++) {
            System.out.println("Digite os minutos do aluno " + cont);
            minutos[cont] = sc.nextInt();
        }
        return minutos;
    }

    private int calcularMedia(int minutos[]) {
        /* calcular e retornar a media inteira dos valores do vetor */
        int soma = 0;
        for (int cont = 0; cont < minutos.length; cont++) {
            // somar o valor
            soma+=minutos[cont];
        }
        return soma/minutos.length;
    }

    private int menorQueMedia(int minutos[], int media) {
        int contarAlunos = 0;
        for (int cont = 0; cont < minutos.length; cont++) {
            if (minutos[cont] < media) {
                contarAlunos++;
            }
        }
        return contarAlunos;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Uni7Exe16 exercicio = new Uni7Exe16();
        // ler a quantidade de alunos
        System.out.println("Informe o número de alunos da academia: ");
        int n = sc.nextInt();
        // ler o vetor de minutos
        int minutos[] = exercicio.lerVetor(n, sc);
        // calcular a media de minutos
        int media = exercicio.calcularMedia(minutos);
        // calcular a quantidade de alunos que exercitaram abaixo da media
        int qtde = exercicio.menorQueMedia(minutos, media);

        System.out.println("Média de minutos: " + media);
        System.out.println("Quantidade abaixo da média " + qtde);
    }
}


/*
int[] lerVetor(int n)
    int minutos[] = new int(n)
    para cont de 0 ate n-1 faça
        ler(minutos[cont])
    fim para
    retornar minutos
fim

int calcularMedia(int minutos[])
    soma = 0
    para cont de 0 ate minutos.tamanho - 1 faça
        soma += minutos[cont]
    fim para
    retornar soma/minutos.tamanho

int menorQueMedia(int minutos[], media)
    contarAlunos= 0
    para de 0 ate minutos.tamanho - 1 faça
        se minutos[cont] < media entao
            contarAlunos++
        fim se
    fim para
    retornar contarAlunos

inicio
    ler(n)
        minutos[] = lerVetor(n)
        media = calcularMedia(minutos[])
        qtde = menorQueMedia(minutos[], media)
        escrever("Média de minutos " + media)
        escrever("Quantidade abaixo da media " + qtde)
fim
*/
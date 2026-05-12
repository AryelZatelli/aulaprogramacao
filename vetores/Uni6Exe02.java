import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // definir o vetor
        float vetor[] = new float[12];
        // inicializar a soma
        float soma = 0;

        // leitura dos valores
        for(int cont = 0; cont <= 11; cont ++) {
            // ler o valor na posicao do cont
            System.out.println("Digite o valor da posição " + cont);
            vetor[cont] = sc.nextFloat();
            // somar o valor
            soma+= vetor[cont];
        }

        // calcular a media
        float media = soma / 12;

        // testar os valores acima da média
        System.out.println("Valores acima da média");
        for(int cont = 0; cont <= 11; cont++){
            // verificar se o valor da posicao cont é maior que a média
            if (vetor[cont]>media) {
                System.out.println(vetor[cont]);
            }
        }
        sc.close();
    }   

}

/*
e: 12 valores
s: valor acima da média

inicio
    // ler os valores e somar
    soma = 0
    para cont de 0 ate 11 faça
        ler(vetor[cont])
        soma =+ vetor[cont]
    fim para
    // calcular a media
    media = soma/12
    // informar os valores maiores que a média
    para cont de 0 ate 11 faça
        se vetor[cont]>media entao
            escrever(vetor[cont])
        fim se
*/
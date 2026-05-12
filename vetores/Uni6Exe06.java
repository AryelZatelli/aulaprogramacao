import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // definir o tamanho do vetor
        System.out.println("Informe o tamanho do vetor: ");
        int N = sc.nextInt();

        // criar o vetor com o tamanho N
        float vetor[] = new float[N];

        for(int cont = 0; cont < N-1; cont++) {
            System.out.println("Digite o valor da posição " + cont);
            vetor[cont] = sc.nextFloat();
        }
        // variavel para indicar se o valor foi encontrado
        boolean achou = false;

        // ler o valor a ser encontrado
        System.out.println("Digite o valor a ser pesquisado : ");
        float valor = sc.nextFloat();

        // percorrer o valor para procurar o valor
        for(int cont = 0; cont < N-1; cont++) {
            // verificar se o valor da posição cont é o procurado
            if (vetor[cont] == valor) {
            achou = true;
            break; // interromper a pesquisa
            }
        }

        // informar se o valor existe ou nao
        System.out.println(achou ? "O valor está no vetor" : "O valor não está no vetor");

        sc.close();
    }
}

/*
e: N
   valores reais
   valor

s: verdadeiro ou falso - para o valor no vetor

inicio
    ler(n) // qtde de valores
    para cont de 0 até N-1 faça
        ler(vetor[cont])
    fim para
    achou = falso
    ler(valor) // valor a pesquisar
    para cont de 0 até N-1 faça
        se vetor[cont] == valor entao
            achou = verdadeiro
            escrever("Valor está no vetor")
        fim se
    fim para
    se nao achou 
*/
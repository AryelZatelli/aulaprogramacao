import java.util.Scanner;

public class Uni6Exe12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ler a quantidade de valores
        int N;

        do {
            System.out.println("Digite a quantidade de valores(máx. 20)");
            N = sc.nextInt();
        } while (N > 20);

        // criar o vetor com o tamanho N e ler os valores
        int vetor[] = new int[N];

        for(int cont = 0; cont < N; cont++){
            System.out.println("Digite o valor da posição " + cont + ". Entre 50 e 70");
            do {
                vetor[cont] = sc.nextInt();
            } while (vetor[cont] < 50 || vetor[cont] > 70);
        }
        
        // criar vetor de quantidade e inicializar todas as posições com 0
        int quantidade[] = new int[21];

        for(int cont = 0; cont < 21; cont++){
            quantidade[cont] = 0;
        }

        for(int cont = 0; cont < N; cont++){
            // verificar a posição do número
            int posicao = vetor[cont]-50;
            // incrementar a qtde
            quantidade[posicao]++;
        }

        // escrever o histograma
        System.out.println("Histograma: ");
        for(int numero = 50; numero <= 70; numero++) {
            System.out.printf("%d ", numero);
            for(int cont = 0; cont < quantidade[numero-50]; cont++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

    }
}


/*
e: N
   numero entre 50 e 70
   
s: histrograma com a qtd de vezes q o numero esta no vetor

inicio
    ler(N)
    para cont de 1 ate N faça
        ler(vetor[cont])
    fim para
    quantidade[]= int[20]           // armazenar qtde de cada valor
    para cont de 0 ate 20 faça      // inicializar o vetor de quantidades
        quantidade[cont]=0
    fim para
    para cont de 0 ate N-1 faça
        posicao = vetor[cont]-50
        quantidade[posicao] = quantidade[posicao] + 1
    fim para
    para numero de 50 ate 70 faça
        escrever(numero)
        para cont de 0 ate quantidade[numero - 50]-1
        escrever("*")
        fim para
    fim para
fim
*/
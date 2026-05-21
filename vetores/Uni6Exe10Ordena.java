import java.util.Scanner;

public class Uni6Exe10Ordena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ler o tamanho do vetor
        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        // criar o vetor
        int x[] = new int[n];

        // leitura dos valores
        for (int cont = 0; cont < n; cont++) {
            System.out.println("Digite o valor [" + cont + "]");
            x[cont] = sc.nextInt();
        }
        // método BubbleSort
        for (int ind = 0; ind <= n - 2 - ind; ind++) {
            for (int cont = 0; cont <= n - 2; cont++) {
                // testar se o elemento atual é maior que o próximo
                if (x[cont] > x[cont + 1]) {
                    // trocar os valores de posição com uma variável auxiliar
                    int aux = x[cont];
                    x[cont] = x[cont + 1];
                    x[cont + 1] = aux;
                }
            }
        }
        for(int cont = 0; cont < n; cont++){
            System.out.printf("%d ", x[cont]);
        }

    }
}

/*
para ind de 0 ate n-2 faça
    troca = falso
    para cont de 0 ate n-2-ind faça
        se x[cont] > x[cont+1]
            aux = x[cont]
            x[cont] = x[cont+1]
            x[cont+1] = aux
            troca = verdadeiro
        fim se
    fim para
fim para
*/
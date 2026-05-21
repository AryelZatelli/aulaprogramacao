import java.util.Scanner;

public class Uni6Exe7 {
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
            System.out.println("Digite os valores dentro do vetor:");
            int X = sc.nextInt();
            for(int cont1 = 0; cont1 < N; cont1++){
                // variável lógica para verificar se encontrou
                    boolean achou = false;
                    // percorrer o vetor
                    for (int cont2 = 0; cont2 < N; cont2++) {
                        if (X == vetor[cont]) {
                            achou = true;
                            System.out.println("O valor já existe");
                            break;
                        }
                    }
            }
        }
    }
}

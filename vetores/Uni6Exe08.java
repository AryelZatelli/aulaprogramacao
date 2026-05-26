import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        while (N > 20 || N <= 0) {
            System.out.println("Digite um valor até 20:");
            N = sc.nextInt();
        }

        double vetor[] = new double[N];

        for (int cont = 0; cont < N; cont++) {
            double valor = sc.nextDouble();
            vetor[cont] = valor;
        }
        System.out.println("VALOR\tFREQUÊNCIA");

        for (int cont = 0; cont < N; cont++) {
            boolean achou = false;
            for (int cont1 = 0; cont1 < cont; cont1++) {
                if (vetor[cont] == vetor[cont1]) {
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                int frequencia = 0;
                for (int j = 0; j < N; j++) {
                    if (vetor[cont] == vetor[j]) {
                        frequencia++;
                    }
                }
                System.out.printf("%.1f\t%d\n", vetor[cont], frequencia);
            }
        }
        sc.close();
    }
}
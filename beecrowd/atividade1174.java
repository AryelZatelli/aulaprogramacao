package beecrowd;

import java.util.Scanner;

public class atividade1174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double vetor[] = new double[100];

        for(int cont = 0; cont < 100; cont++){
            double valor = sc.nextDouble();
            vetor[cont] = valor;
        }

        for(int cont = 0; cont < 100; cont++){
            if (vetor[cont] <= 10) {
                System.out.printf("A[%d] = %.1f%n", cont , vetor[cont]);
            }
        }

    }
}

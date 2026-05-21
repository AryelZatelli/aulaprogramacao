package beecrowd;

import java.util.Scanner;

public class atividade1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[20];

        for (int cont = 0; cont < 20; cont++) {
            int valor = sc.nextInt();
            vetor[cont] = valor;
        }

        for (int cont = 0; cont < 10; cont++) {
            int aux = vetor[cont];
            vetor[cont] = vetor[19 - cont];
            vetor[19 - cont] = aux;
        }

        for (
            int cont = 0; cont < 20; cont++) {
            System.out.println("N[" + cont + "] = " + vetor[cont]);
        }
    }
}

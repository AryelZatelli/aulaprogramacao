package beecrowd;

import java.util.Scanner;

public class atividade1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        int vetor[] = new int[10];
        
        vetor[0] = valor;

       for(int cont = 1; cont < 10; cont++){
            vetor[cont] = vetor[cont-1]*2;
        }
        
        for(int cont = 0; cont < 10; cont++){
            System.out.println("N[" + cont + "] = " + vetor[cont]);
        }

    }
}

package beecrowd;

import java.util.Scanner;

public class atividade1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = 0;
        int b = 1;
        
        for(int cont = 0; cont < N; cont++) {
            if (cont > 0) {
                System.out.print(" ");
            }

            System.out.print(a);

            int proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println();

        sc.close();
    }   
}

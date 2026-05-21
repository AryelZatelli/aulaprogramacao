package beecrowd;

import java.util.Scanner;

public class atividade1176 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
                
        for (int cont = 0; cont < T; cont++) {
            long a = 0;
            long b = 1;

            int casosTeste = sc.nextInt();

            if (casosTeste == 0) {
                b = 0;
            }
            else if (casosTeste == 1) {
                b = 1;
            }
            else {
                for (int cont1 = 2; cont1 <= casosTeste; cont1++) {
                    long proximo = a + b;
                    a = b;
                    b = proximo;
                }
            }
            System.out.println("Fib(" + casosTeste + ") = " + b);
        }

    }
}

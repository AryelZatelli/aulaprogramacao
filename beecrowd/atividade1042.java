package beecrowd;

import java.util.Scanner;

public class atividade1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int maior, medio, menor;

        if (A > B && A > C) {
            maior = A;

            if (B < C) {
                menor = B;
                medio = C;
            } else {
                menor = C;
                medio = B;
            }
        } else {
            if (B > C) {
                maior = B;
                if (A < C) {
                    menor = A;
                    medio = C;
                } else {
                    menor = C;
                    medio = A;
                }
            } else {
                maior = C;
                if (A < B) {
                    menor = A;
                    medio = B;
                } else {
                    menor = B;
                    medio = A;
                }
            }
            System.out.println(menor);
            System.out.println(medio);
            System.out.println(maior);
            System.out.println();
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);

            sc.close();
        }
    }
}
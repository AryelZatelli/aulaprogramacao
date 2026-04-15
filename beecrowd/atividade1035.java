package beecrowd;

import java.util.Scanner;

public class atividade1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro");
        int A = sc.nextInt();
        System.out.println("Digite um valor inteiro");
        int B = sc.nextInt();
        System.out.println("Digite um valor inteiro");
        int C = sc.nextInt();
        System.out.println("Digite um valor inteiro");
        int D = sc.nextInt();

        if (B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else
            System.out.println("Valores nao aceitos");

        sc.close();
    }
}

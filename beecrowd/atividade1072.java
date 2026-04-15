package beecrowd;

import java.util.Scanner;

public class atividade1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int cont = 1; cont <= N; cont++) {
            int X = sc.nextInt();

            if (X >= 10 && X <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
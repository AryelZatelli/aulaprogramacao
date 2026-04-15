package operadoreslogicos;

import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("TRIGÊMEOS");
        } else if (a == b || a == c || b == c) {
            System.out.println("GÊMEOS");
        } else {
            System.out.println("APENAS IRMÃOS");
        }

        sc.close();
    }
}
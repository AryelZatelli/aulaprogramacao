package operadoreslogicos;

import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marquinhos = sc.nextInt();
        int zezinho = sc.nextInt();
        int luluzinha = sc.nextInt();

        if (marquinhos < zezinho && marquinhos < luluzinha) {
            System.out.println("O Marquinhos é o caçula.");
        } else if (zezinho < marquinhos && zezinho < luluzinha) {
            System.out.println("O Zezinho é o caçula.");
        } else {
            System.out.println("A Luluzinha é a caçula.");
        }

        sc.close();
    }
}

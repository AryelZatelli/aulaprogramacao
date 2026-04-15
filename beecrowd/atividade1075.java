package beecrowd;

import java.util.Scanner;

public class atividade1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int cont = 1; cont <= 10000; cont++){
            if (cont % N == 2) {
                System.out.println(cont);
            }
        } sc.close();
    }
}

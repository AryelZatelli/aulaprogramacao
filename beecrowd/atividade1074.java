package beecrowd;

import java.util.Scanner;

public class atividade1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        for(int cont = 1; cont <= N; cont++){
            int X = sc.nextInt();

            if (X == 0) {
                System.out.println("NULL");
            } else if (X % 2 == 0 && X > 0) {
                System.out.println("EVEN POSITIVE");
            } else if (X % 2 == 0 && X < 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (X % 2 != 0 && X > 0){
                System.out.println("ODD POSITIVE");
            } else if (X % 2 != 0 && X < 0){
                System.out.println("ODD NEGATIVE");
            } 
        } sc.close();
    }
}

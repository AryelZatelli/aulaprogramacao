package beecrowd;

import java.util.Scanner;

public class atividade1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int fatorial = 1;
        
        for(int cont = 1; cont <= N; cont++) {
            fatorial = fatorial * cont;
        }
        System.out.println(fatorial);

        sc.close();
    }   
}

package beecrowd;

import java.util.Scanner;

public class atividade1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int maior = numero;
        int posicao = 1;
        
        for(int cont = 2; cont <= 100; cont++){
            numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
                posicao = cont;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);

        sc.close();
    }
}

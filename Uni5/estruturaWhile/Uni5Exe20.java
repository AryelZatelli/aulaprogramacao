package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double massaInicial = sc.nextDouble(); // em Kg
        double massa = massaInicial;

        int tempo = 0; // em segundos

        // 0.5 gramas = 0.0005 Kg
        while (massa >= 0.0005) {
            massa /= 2;     // perde metade da massa
            tempo += 50;    // passa 50 segundos
        }

        System.out.printf("Massa inicial: %.2f Kg\n", massaInicial);
        System.out.printf("Massa final: %.6f Kg\n", massa);
        System.out.println("Tempo: " + tempo + " segundos");

        sc.close();
    }
}

/*
 * entrada: massa inicial em Kg
 * saída: massa inicial, massa final e tempo necessário
 * 
 * regra:
 * a cada 50 segundos a massa reduz pela metade
 * parar quando massa < 0.5g (0.0005 Kg)
 * 
 * inicio
 * ler(massaInicial)
 * massa = massaInicial
 * tempo = 0
 * 
 * enquanto massa >= 0.0005:
 *     massa = massa / 2
 *     tempo += 50
 * 
 * escrever massaInicial
 * escrever massa final
 * escrever tempo
 */

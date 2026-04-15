package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double limite = sc.nextDouble(); // valor máximo de pedágio

        int acimaLimite = 0;
        int totalTrechos = 0;
        int longosAceitos = 0;

        // leitura dos trechos
        while (true) {
            double pedagio = sc.nextDouble();

            // condição de parada
            if (pedagio < 0) {
                break;
            }

            double distancia = sc.nextDouble();

            totalTrechos++;

            // verifica se ultrapassa o limite
            if (pedagio > limite) {
                acimaLimite++;
            }

            // verifica se é maior que 150km e dentro do limite
            if (distancia > 150 && pedagio <= limite) {
                longosAceitos++;
            }
        }

        // saídas
        System.out.println(acimaLimite);
        System.out.println(totalTrechos);
        System.out.println(longosAceitos);

        sc.close();
    }
}

/*
 * entrada:
 * valor máximo de pedágio
 * vários trechos (pedágio e distância)
 * 
 * saída:
 * quantidade de trechos com pedágio acima do limite
 * total de trechos
 * trechos > 150km com pedágio aceito
 * 
 * inicio
 * ler(limite)
 * acimaLimite = 0
 * totalTrechos = 0
 * longosAceitos = 0
 * 
 * enquanto verdadeiro:
 *     ler(pedagio)
 *     
 *     se pedagio < 0:
 *         parar
 *     
 *     ler(distancia)
 *     totalTrechos++
 *     
 *     se pedagio > limite:
 *         acimaLimite++
 *     
 *     se distancia > 150 e pedagio <= limite:
 *         longosAceitos++
 * 
 * escrever resultados
 */
package Uni5.estruturaWhile;

public class Uni5Exe21 {
    public static void main(String[] args) {

        double chico = 1.50;
        double ze = 1.10;

        int anos = 0;

        // enquanto Zé não ultrapassar Chico
        while (ze <= chico) {
            chico += 0.02; // cresce 2 cm
            ze += 0.03;    // cresce 3 cm
            anos++;
        }

        System.out.println("Anos necessários: " + anos);
    }
}

/*
 * objetivo: calcular quantos anos Zé leva para ultrapassar Chico
 * 
 * dados:
 * Chico = 1.50m (cresce 0.02m/ano)
 * Zé = 1.10m (cresce 0.03m/ano)
 * 
 * inicio
 * chico = 1.50
 * ze = 1.10
 * anos = 0
 * 
 * enquanto ze <= chico:
 *     chico += 0.02
 *     ze += 0.03
 *     anos++
 * 
 * escrever anos
 */
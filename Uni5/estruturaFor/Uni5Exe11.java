package Uni5.estruturaFor;

public class Uni5Exe11 {
    public static void main(String[] args) {

        int quebradosHora = 1; // quantidade quebrada na 1ª hora
        int totalDia = 0;      // total acumulado no dia

        // máquina funciona 16 horas
        for (int hora = 1; hora <= 16; hora++) {

            // soma ao total do dia
            totalDia += quebradosHora;

            // a partir da 3ª hora, multiplica por 3 o valor anterior
            if (hora >= 2) {
                quebradosHora *= 3;
            }
        }

        // resultado final
        System.out.println("Total de biscoitos quebrados no dia: " + totalDia);
    }
}

/*
 * objetivo: calcular quantos biscoitos são quebrados em 16 horas
 * 
 * regra:
 * hora 1 → quebra 1
 * hora 2 → quebra 3
 * hora 3 → quebra 3x a anterior (9)
 * hora 4 → 27
 * ...
 * 
 * inicio
 * quebradosHora = 1
 * totalDia = 0
 * 
 * para hora de 1 até 16:
 *     totalDia += quebradosHora
 *     
 *     se hora >= 2:
 *         quebradosHora = quebradosHora * 3
 * 
 * escrever totalDia
 */

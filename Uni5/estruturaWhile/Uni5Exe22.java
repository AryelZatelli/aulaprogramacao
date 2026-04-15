package Uni5.estruturaWhile;

public class Uni5Exe22 {
    public static void main(String[] args) {

        double salario = 2000.0;
        double aumento = 0.015; // 1.5% em 1996

        // de 1996 até o ano atual (ajuste se quiser outro ano)
        for (int ano = 1996; ano <= 2024; ano++) {

            salario += salario * aumento; // aplica aumento

            aumento *= 2; // dobra o percentual para o próximo ano
        }

        System.out.printf("Salário atual: R$%.2f\n", salario);
    }
}

/*
 * objetivo: calcular o salário atual com aumentos progressivos
 * 
 * regra:
 * 1995 → salário inicial = 2000
 * 1996 → aumento de 1.5%
 * a partir de 1997 → aumento dobra a cada ano
 * 
 * inicio
 * salario = 2000
 * aumento = 1.5%
 * 
 * para ano de 1996 até ano atual:
 *     salario = salario + (salario * aumento)
 *     aumento = aumento * 2
 * 
 * escrever salario
 */
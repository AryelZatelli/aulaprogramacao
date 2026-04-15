package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorDia = 0;
        int maiorProducao = 0;

        int totalManha = 0;
        int totalTarde = 0;

        int opcao = 1;

        while (opcao == 1) {

            int dia;

            // validação do dia
            do {
                dia = sc.nextInt();
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia inválido");
                }
            } while (dia < 1 || dia > 30);

            int manha = sc.nextInt();
            int tarde = sc.nextInt();

            int total = manha + tarde;
            double valor = 0;

            // cálculo do valor
            if (dia <= 15) {
                if (total > 100 && manha >= 30 && tarde >= 30) {
                    valor = total * 0.80;
                } else {
                    valor = total * 0.50;
                }
            } else {
                valor = (manha * 0.40) + (tarde * 0.30);
            }

            System.out.printf("R$ %.2f\n", valor);

            // maior produção
            if (total > maiorProducao) {
                maiorProducao = total;
                maiorDia = dia;
            }

            // acumula produção por período
            totalManha += manha;
            totalTarde += tarde;

            // continuar?
            opcao = sc.nextInt();
        }

        // resultados finais
        System.out.println("Dia de maior produção: " + maiorDia);

        if (totalManha > totalTarde) {
            System.out.println("Maior produção no período da manhã: " + totalManha);
        } else {
            System.out.println("Maior produção no período da tarde: " + totalTarde);
        }

        sc.close();
    }
}

/*
 * entrada:
 * dia (validado 1 a 30)
 * peças manhã e tarde
 * opção continuar
 * 
 * saída:
 * valor recebido por funcionário
 * dia com maior produção
 * período com maior produção total
 * 
 * regras:
 * 1ª quinzena:
 *   >100 peças e >=30 em cada turno → R$0.80
 *   caso contrário → R$0.50
 * 
 * 2ª quinzena:
 *   manhã → R$0.40
 *   tarde → R$0.30
 * 
 * inicio
 * enquanto opcao == 1:
 *     validar dia
 *     ler manhã e tarde
 *     
 *     calcular valor
 *     escrever valor
 *     
 *     atualizar maior produção
 *     acumular manhã e tarde
 *     
 *     ler opcao
 * 
 * escrever dia maior produção
 * escrever período com maior produção
 */
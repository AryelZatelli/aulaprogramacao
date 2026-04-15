package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inicializar os pontos
        int pontoD = 0;
        int pontoE = 0;
        char ponto;

        // repetir as leituras das jogadas
        do {
            System.out.println("Digite quem fez o ponto (D ou E): ");
            ponto = sc.next().toUpperCase().charAt(0);

            if (ponto == 'D') {
                pontoD++;
            } else if (ponto == 'E') {
                pontoE++;
            } 
            // informar o placar parcial
            System.out.println("Placar: D = " + pontoD + " | E = " + pontoE);

        } while (!(
                (pontoD >= 5 || pontoE >= 5) ||
                ( (pontoD - pontoE >= 2) || (pontoE - pontoD >= 2) )
        ));

        // Resultado final
        if (pontoD > pontoE) {
            System.out.println("Jogador da direita (D) venceu!");
        } else {
            System.out.println("Jogador da esquerda (E) venceu!");
        }

        sc.close();
    }
}

/*
e: pontos (pelo menos um jogador chegar no mínimo em 7 e a diferença de pontos for maior ou igual a 2)
s: vencedor

inicio
    ponto D = 0
    ponto E = 0
    faça
      ler(ponto)
       escolha(ponto)
       'D': ponto D++
       'E': ponto E++
       fim escolha
   enquanto
      (ponto D < 7 e ponto E < 7) E (ponto D - ponto E >= 2 ou ponto E - ponto D >= 2)
     
*/
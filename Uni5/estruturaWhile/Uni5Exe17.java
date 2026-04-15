package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inscricao = sc.nextInt();

        int inscricaoMaisAlto = 0;
        int inscricaoMaisBaixo = 0;

        double altura, maiorAltura = 0, menorAltura = 0;
        double somaAlturas = 0;
        int quantidade = 0;

        // leitura até inscrição = 0
        while (inscricao != 0) {
            altura = sc.nextDouble();

            if (quantidade == 0) {
                // primeiro atleta
                maiorAltura = altura;
                menorAltura = altura;
                inscricaoMaisAlto = inscricao;
                inscricaoMaisBaixo = inscricao;
            } else {
                // verifica maior
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    inscricaoMaisAlto = inscricao;
                }

                // verifica menor
                if (altura < menorAltura) {
                    menorAltura = altura;
                    inscricaoMaisBaixo = inscricao;
                }
            }

            somaAlturas += altura;
            quantidade++;

            // lê próxima inscrição
            inscricao = sc.nextInt();
        }

        double media = somaAlturas / quantidade;

        // saídas
        System.out.println("O atleta mais baixo tem " + menorAltura + "m e o seu número de inscrição é " + inscricaoMaisBaixo);
        System.out.println("O atleta mais alto tem " + maiorAltura + "m e o seu número de inscrição é " + inscricaoMaisAlto);
        System.out.printf("A altura média do grupo de atletas é: %.2f\n", media);

        sc.close();
    }
}

/*
 * entrada: número de inscrição e altura dos atletas (até inscrição = 0)
 * saída:
 * - atleta mais alto (inscrição e altura)
 * - atleta mais baixo (inscrição e altura)
 * - média das alturas
 * 
 * inicio
 * ler(inscricao)
 * 
 * enquanto inscricao != 0:
 *     ler(altura)
 *     
 *     se for o primeiro:
 *         definir maior e menor
 *     
 *     senao:
 *         atualizar maior e menor se necessário
 *     
 *     somar alturas
 *     contar atletas
 *     
 *     ler próxima inscrição
 * 
 * media = soma / quantidade
 * escrever resultados
 */
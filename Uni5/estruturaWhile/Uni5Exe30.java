package Uni5.estruturaWhile;

import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // valor inicial
        int K = sc.nextInt(); // decremento
        int M = sc.nextInt(); // capacidade da mochila (soma máxima)

        String todos = "";
        String dentro = "";
        String fora = "";

        int somaDentro = 0;
        int somaFora = 0;

        // gera a sequência decrescente
        for (int i = N; i > 0; i -= K) {

            // lista todos os elementos
            if (!todos.isEmpty()) {
                todos += ", ";
            }
            todos += i;

            // tenta colocar na mochila (prioriza maiores)
            if (somaDentro + i <= M) {
                if (!dentro.isEmpty()) {
                    dentro += ", ";
                }
                dentro += i;
                somaDentro += i;
            } else {
                if (!fora.isEmpty()) {
                    fora += ", ";
                }
                fora += i;
                somaFora += i;
            }
        }

        // saídas
        System.out.println("Elementos: " + todos);
        System.out.println("Entraram na mochila: " + dentro);
        System.out.println("Ficaram fora: " + fora);
        System.out.println("Soma dentro da mochila: " + somaDentro);
        System.out.println("Soma fora da mochila: " + somaFora);

        sc.close();
    }
}

/*
 * entrada:
 * N (início da sequência)
 * K (decremento)
 * M (capacidade da mochila - soma máxima)
 * 
 * saída:
 * lista de elementos
 * elementos que entraram
 * elementos que ficaram fora
 * soma dos que entraram
 * soma dos que ficaram fora
 * 
 * lógica:
 * gerar sequência: N, N-K, N-2K, ...
 * 
 * para cada elemento:
 *     se somaDentro + elemento <= M:
 *         entra na mochila
 *     senão:
 *         fica fora
 * 
 * inicio
 * ler(N, K, M)
 * 
 * para i de N até > 0, decrementando K:
 *     adicionar em lista geral
 *     
 *     se cabe na mochila:
 *         adicionar em dentro
 *     senão:
 *         adicionar em fora
 * 
 * escrever resultados
 */

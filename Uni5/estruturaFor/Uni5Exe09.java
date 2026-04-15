package Uni5.estruturaFor;

import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String nomes18 = "";
        int cont18 = 0;
        int acima20 = 0;

        // leitura dos dados dos alunos
        for (int i = 1; i <= n; i++) {
            String nome = sc.next();
            int idade = sc.nextInt();

            // verifica idade igual a 18
            if (idade == 18) {
                if (cont18 > 0) {
                    nomes18 += " e ";
                }
                nomes18 += nome;
                cont18++;
            }

            // verifica idade acima de 20
            if (idade > 20) {
                acima20++;
            }
        }

        // saída dos alunos com 18 anos
        System.out.println("Nomes dos alunos que tem 18 anos: " + nomes18);

        // saída da quantidade acima de 20
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: " + acima20);

        sc.close();
    }
}

/*
 * entrada: n, nome e idade de n alunos
 * saída: nomes dos alunos com 18 anos e quantidade acima de 20
 * 
 * inicio
 * ler(n)
 * nomes18 = ""
 * cont18 = 0
 * acima20 = 0
 * 
 * para i de 1 até n:
 *     ler(nome, idade)
 *     
 *     se idade == 18:
 *         se cont18 > 0:
 *             nomes18 = nomes18 + " e "
 *         nomes18 = nomes18 + nome
 *         cont18++
 *     
 *     se idade > 20:
 *         acima20++
 * 
 * escrever nomes18
 * escrever acima20
 */
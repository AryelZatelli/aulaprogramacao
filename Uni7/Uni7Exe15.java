package Uni7;

import java.util.Scanner;

public class Uni7Exe15 {

    private int pesquisarAnimal(String nome[], String nomeAPesquisar) {
        /*
         * metodo que pesquisa um nome em um vetor de nomes e retorna a posição em que o
         * nome foi encontrado. caso o nome nao seja encontrado, retorna -1
         */
        // percorrer o vetor de nomes
        for (int cont = 0; cont < nome.length; cont++) {
            if (nomeAPesquisar.equalsIgnoreCase(nome[cont])) {
                // retornar a posição onde o nome foi encontrado
                return cont;
            }
        }
        // retornar -1 se o nome não foi encontrado
        return -1;
    }

    private void imprimirRelatorio (String nome[], double racao[]) {
        /* método que imprime um relatório com todos os dados dos vetores */
        System.out.println("Animal     Ração");
        //percorrer os vetores
        for(int cont = 0; cont < nome.length; cont++) {
            System.out.printf("%10s %5.2f\n", nome[cont], racao[cont]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Uni7Exe15 exercicio = new Uni7Exe15();
        // ler o numero de animais
        System.out.println("Informe o número de animais");
        int n = sc.nextInt();
        // criar os vetores
        String nome[] = new String[n];
        double racao[] = new double[n];
        // ler os dados dos vetores
        for (int cont = 0; cont < n; cont++) {
            System.out.println("Digite o animal " + cont);
            nome[cont] = sc.next();
            System.out.println("Digite a ração do animal " + cont);
            racao[cont] = sc.nextDouble();
        }

        int opcao; // variavel para ler a opção do menu
        do {
            // montar o menu e ler a opção
            System.out.println("1 - Pesquisar o animal.");
            System.out.println("2 - Fornecer ração");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();

            // escolher a opção
            switch (opcao) {
                case 1:
                    System.out.println("Digite um animal a pesquisar");
                    String nomeAPesquisar = sc.next();
                    // pesquisar o animal
                    int posicao = exercicio.pesquisarAnimal(nome, nomeAPesquisar);
                    // informar o resultado
                    if (posicao > -1) {
                        System.out.println("Animal cadastrado");
                    } else
                        System.out.println("Animal não cadastrado");
                    break;
                case 2:
                    System.out.println("Digite o animal a alimentar");
                    String nomeAAlimentar = sc.next();
                    posicao = exercicio.pesquisarAnimal(nome, nomeAAlimentar);
                    // ver se o animal esta cadastrado e atualizar a racao
                    if (posicao > -1) {
                        System.out.println("Informe a quantidade de ração a oferecer ao animal");
                        double qtdeRacao = sc.nextDouble();
                        // atualizar a posição do vetor com o valor lido
                        racao[posicao] = qtdeRacao;
                    } else
                        System.out.println("Animal não cadastrado");
                    }
                    break;
        } while (opcao != 3);
        exercicio.imprimirRelatorio(nome, racao);
    }
}

/*

e: n - numero de animais
   nome
   racao
   
s: relatorio - nome, ração


int pesquisarAnimal(nome[], nomeAPesquisar[])

    para cont de 0 ate nome.tamanho - 1 faça
        se nomeAPesquisar == nome[cont] entao
            retornar cont
        fim se
    fim para
    retornar -1


inicio
    ler(n)
    para cont de 0 ate n-1 faça
        ler(nome[cont])
        ler(racao[cont])
    fim para
    faça
        escrever("1 - Pesquisar animal")
                ("2 - Fornecer ração")
                ("3 - Sair")
        ler(opcao)
        escolha(opcao)
            1: ler(nomeAPesquisar)
                pesquisarAnimal(nome[cont], nomeAPesquisar)
                se posicao > -1 entao
                    posicao
                fim se
            2: ler(nomeAAlimentar)
                posicao: pesquisarAnimal(nome[], nomeAAlimentar)
                se posicao > -1 entao
                    ler(qtdeRacao) 
                    racao[posicao] = qtdeRacao
               senao
                    escrever("Animal não encontrado") 
               fim se 
        fim escolha
    enquanto opcao != 3
    imprimirRelatorio(nome[cont], racao[cont])
        

*/
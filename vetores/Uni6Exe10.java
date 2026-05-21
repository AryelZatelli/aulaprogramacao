import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // criar vetor de no máximo 50 posições
        int vetor[] = new int[50];
        int N = 0; // controlar a quantidade de valores que estão no vetor
        int opcao; // controla a opção do usuário
        int valor = 0;

        do {
            // ler a opção do usuário
            System.out.println("1 - Inserir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar o conteúdo do vetor");
            System.out.println("6 - Sair do sistema \n");
            // ler a opção do usuário
            opcao = sc.nextInt();
            // escolher a opção desejada
            switch (opcao) {
                case 1:
                    // testar se não chegou ao máximo
                    if (N < 50) {
                        System.out.println("Qual o valor a ser inserido?");
                        valor = sc.nextInt();
                        // inserir o valor no vetor
                        vetor[N] = valor;
                        // atualizar a quantidade de elementos no vetor
                        N++;
                        System.out.println("Valor inserido \n");
                    } else
                        System.out.println("Valor não inserido \n");
                    break;

                case 2:
                    // ler o valor a ser pesquisado
                    System.out.println("Qual o valor que você quer procurar?");
                    valor = sc.nextInt();
                    // variável lógica para verificar se encontrou
                    boolean achou = false;
                    // percorrer o vetor
                    for (int cont = 0; cont < N; cont++) {
                        if (valor == vetor[cont]) {
                            achou = true;
                            System.out.println("O valor está cadastrado na posição " + cont);
                            break;
                        }
                    }

                    // indicar se não encontrou
                    if (!achou)
                        System.out.println("Valor não cadastrado");
                    break;

                case 3:
                     // ler o valor a ser trocado e o valor novo
                    System.out.println("Qual o valor que você quer trocar?");
                    valor = sc.nextInt();
                    // ler o valor novo
                    System.out.println("Digite o valor novo");
                    int valorNovo = sc.nextInt();
                    // variável lógica para verificar se encontrou
                    achou = false;
                    // percorrer o vetor
                    for (int cont = 0; cont < N; cont++) {
                        if (valor == vetor[cont]) {
                            vetor[cont] = valorNovo;
                            achou = true;
                            System.out.println("O valor está cadastrado na posição " + cont);
                            break;
                        }
                    }
                    // indicar se não encontrou
                    if (!achou)
                        System.out.println("Valor não cadastrado");
                    break;

                case 4:
                    System.out.println("Digite o valor a ser excluído");
                    valor = sc.nextInt();
                    achou = false;
                    for (int cont = 0; cont < N; cont++){
                        if (valor == vetor[cont]) {
                            achou = true;
                            // puxar os valores para a posição anterior
                            for(int cont1 = cont; cont1 < N-1; cont++) {
                                vetor[cont1] = vetor[cont1+1];
                            }
                            N--;
                        }
                    }
                    if (!achou) {
                        System.out.println("Valor não cadastrado");
                    }
                    break;
                case 5:
                    for (int cont = 0; cont < N; cont++)
                    System.out.println(vetor[cont]);
            }

        } while (opcao != 6);

    }
}

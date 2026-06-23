import java.util.Scanner;

public class Projeto3 {
    private int[] senhaCorreta() { 
        /* método para gerar senha aleatória com 6 posições, cada posição recebe um valor inteiro entre 1 e 6 e retornar o vetor com a senha gerada */
        int[] senha = new int[6];
        for (int cont = 0; cont < 6; cont++) {
            int valor = (int) (Math.random() * 6) + 1;
            senha[cont] = valor;
        }
        return senha;
    }

    private int[] processarTentativa(int[] senha, Scanner sc) {
        /* metodo para ler a tentativa do jogador, calcular qtde do V e Q e retornar o ambos em um vetor */
        int[] tentativa = senhaTentativa(sc);

        int V = calcularV(senha, tentativa);
        int Q = calcularQ(senha, tentativa);

        int[] resultado = new int[2];
        resultado[0] = V;
        resultado[1] = Q;

        return resultado;
    }

    private int[] senhaTentativa(Scanner sc) {
        /* metodo para ler os 6 valores digitados pelo jogador e armazenar em um vetor de tentativa */
        int[] tentativa = new int[6];

        for (int cont = 0; cont < 6; cont++) {
            System.out.println("Digite o número " + (cont + 1) + ": ");
            tentativa[cont] = sc.nextInt();
        }
        return tentativa;
    }

    private int calcularV(int[] senha, int[] tentativa) {
        /* metodo que calcula a quantidade de valores corretor na posição correta (V) */
        int V = 0;
        for (int cont = 0; cont < senha.length; cont++) {
            if (senha[cont] == tentativa[cont]) {
                V++;
            }
        }
        return V;
    }

    private int calcularQ(int[] senha, int[] tentativa) {
        /* metodo que calcula a quantidade de valores corretos em posições incorretas (Q) 
            cada posição da senha pode ser usada apenas uma vez na contagem*/
        boolean[] usadoSenha = new boolean[6];
        boolean[] usadoTentativa = new boolean[6];
        int Q = 0;
        for (int cont = 0; cont < senha.length; cont++) {
            if (senha[cont] == tentativa[cont]) {
                usadoSenha[cont] = true;
                usadoTentativa[cont] = true;
            }
        }
        for (int cont1 = 0; cont1 < senha.length; cont1++) {
            if (!usadoTentativa[cont1]) {
                for (int cont2 = 0; cont2 < senha.length; cont2++) {
                    if (!usadoSenha[cont2] && tentativa[cont1] == senha[cont2]) {
                        Q++;
                        usadoTentativa[cont1] = true;
                        usadoSenha[cont2] = true;
                        break;
                    }
                }
            }
        }
        return Q;
    }

    private boolean senhaDescoberta(int V) {
        /* metodo que verifica se a senha foi descoberta */
        return V == 6;
    }

    private int calcularMoedas(int tentativa) {
         /* método que calcula a quantidade de moedas recebidas de acordo com a tentativa em que o jogador descobriu a senha.*/
        int moedas = 0;
        switch (tentativa) {
            case 1:
                moedas += 200;
                break;
            case 2:
                moedas += 150;
                break;
            case 3:
                moedas += 100;
                break;
            case 4:
                moedas += 75;
                break;
            case 5:
                moedas += 50;
                break;
            case 6:
                moedas += 25;
                break;
            case 7:
                moedas += 10;
                break;
            case 8:
                moedas += 10;
                break;
        }
        return moedas;
    }

    private void mostrarSenha(int[] senha) {
        /* metodo que mostra a senha correta na tela */
        for (int cont = 0; cont < senha.length; cont++) {
            System.out.print(senha[cont] + " ");
        }
    }

    private boolean partidaTerminou(int tentativas, int V) {
        /* metodo que verifica se a partida terminou
           termina quando o jogador descobre a senha(V=6) ou as tentativas acabaram(tentativas = 0)  */
        return tentativas == 0 || V == 6;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Projeto3 exercicio = new Projeto3();
        // variáveis para controle das estatísticas do jogo
        boolean jogoAtivo = true;
        int partidasJogadas = 0;
        int partidasVencidas = 0;
        int partidasPerdidas = 0;
        int totalTentativas = 0;
        int primeiraTentativa = 0;
        int moedasTotais = 0;
        int tentativas = 8;
        int[] senha = exercicio.senhaCorreta();
        // repetir enquanto o jogador não escolher encerrar o jogo
        while (jogoAtivo) {
            // ler a opção
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Fazer tentativa.");
            System.out.println("2 - Desistir da partida.");
            System.out.println("3 - Encerrar o jogo.");
            int opcao = sc.nextInt();
            // escolher a opção informada pelo jogador
            switch (opcao) {
                // realizar as tentativas da partida
                case 1:
                    // realizar as tentativas da partida
                      for (int cont = 0; cont < 8; cont++) {
                        // processar a tentativa do jogador
                        int[] resultado = exercicio.processarTentativa(senha, sc);
                        // obter valores V e Q
                        int V = resultado[0];
                        int Q = resultado[1];
                        // atualizar quantidade de tentativas
                        tentativas--;
                        totalTentativas++;
                        // verificar se a partida terminou
                        boolean terminou = exercicio.partidaTerminou(tentativas, V);
                        System.out.println("V = " + V);
                        System.out.println("Q = " + Q);
                        System.out.println("Tentativas restantes: " + tentativas);
                        // verificar se o jogador venceu ou perdeu a partida
                        if (terminou) {

                            if (exercicio.senhaDescoberta(V)) {
                                System.out.println("Parabéns, você ganhou!");
                                System.out.println("Moedas ganhas: " + exercicio.calcularMoedas(cont + 1));
                                moedasTotais += exercicio.calcularMoedas(cont + 1);

                                partidasVencidas++;
                                partidasJogadas++;

                                if (cont == 0) {
                                    primeiraTentativa++;
                                }

                            } else {
                                System.out.println("Você perdeu!");
                                moedasTotais -= 100;

                                System.out.print("Senha correta: ");
                                exercicio.mostrarSenha(senha);
                                System.out.println();

                                partidasPerdidas++;
                                partidasJogadas++;
                            }
                            // iniciar uma nova partida gerando uma nova senha
                            senha = exercicio.senhaCorreta();
                            tentativas = 8;
                            break;
                        }
                    }

                    break;

                case 2:
                    // jogador desistiu da partida 
                    System.out.println("Você desistiu!");
                    // mostrar a senha correta
                    System.out.print("Senha correta :");
                    exercicio.mostrarSenha(senha);
                    // descontar moedas pela desistência
                    moedasTotais -= 80;
                    // iniciar nova partida
                    senha = exercicio.senhaCorreta();
                    tentativas = 8;
                    // atualizar estatísticas
                    partidasPerdidas++;
                    partidasJogadas++;
                    break;          
                case 3:
                    // exibir as estatísticas finais do jogo
                    System.out.println("Partidas jogadas: " + partidasJogadas);
                    System.out.println("Partidas vencidas: " + partidasVencidas);
                    System.out.println("Partidas perdidas: " + partidasPerdidas);
                    System.out.println("Total de tentativas: " + totalTentativas);
                    System.out.println("Vitórias na primeira tentativa: " + primeiraTentativa);
                    System.out.println("Moedas totais: " + moedasTotais);
                    // encerrar a execução do programa
                    jogoAtivo = false;
                    break;
            }
        }
    }
}

/*

e:
    opcao
    tentativa[6]

s:
    V
    Q
    partidasJogadas
    partidasVencidas
    partidasPerdidas
    totalTentativas
    primeiraTentativa
    moedasTotais

int[] senhaCorreta()

    para cont de 0 ate 5 faça
        senha[cont] = numero aleatorio de 1 a 6
    fim para

    retornar senha

int calcularV(senha[], tentativa[])

    V = 0

    para cont de 0 ate 5 faça
        se senha[cont] == tentativa[cont] então
            V++
        fim se
    fim para

    retornar V

int calcularQ(senha[], tentativa[])

    marcar posições usadas da senha e da tentativa

    para cada posição faça
        contar os valores corretos em posições incorretas
    fim para

    retornar Q

boolean senhaDescoberta(V)

    retornar V == 6

boolean partidaTerminou(tentativas, V)

    retornar tentativas == 0 ou V == 6

inicio

    gerar senha

    enquanto jogoAtivo faça

        mostrar menu

        ler(opcao)

        escolha(opcao)

            caso 1

                para cont de 0 ate 7 faça

                    ler tentativa

                    calcular V

                    calcular Q

                    diminuir tentativas

                    totalTentativas++

                    mostrar V

                    mostrar Q

                    mostrar tentativas restantes

                    se partidaTerminou então

                        se senhaDescoberta então

                            calcular moedas

                            atualizar estatísticas de vitória

                        senão

                            perder 100 moedas

                            mostrar senha

                            atualizar estatísticas de derrota

                        fim se

                        gerar nova senha

                        reiniciar tentativas

                        parar repetição

                    fim se

                fim para

            caso 2

                escrever("Você desistiu")

                mostrar senha

                moedasTotais = moedasTotais - 80

                partidasPerdidas++

                partidasJogadas++

                gerar nova senha

                tentativas = 8

            caso 3

                escrever(partidasJogadas)

                escrever(partidasVencidas)

                escrever(partidasPerdidas)

                escrever(totalTentativas)

                escrever(primeiraTentativa)

                escrever(moedasTotais)

                jogoAtivo = falso

        fim escolha

    fim enquanto

fim

*/

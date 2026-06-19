import java.util.Scanner;

public class Projeto3 {
    private int[] senhaCorreta() {
        int[] senha = { 1, 1, 2, 3, 3, 5 };
        return senha;
        /*
         * int[] senha = new int[6];
         * for (int cont = 0; cont < 6; cont++) {
         * int valor = (int) (Math.random() * 6) + 1;
         * senha[cont] = valor;
         * }
         * return senha;
         */
    }

    private int[] senhaTentativa(Scanner sc) {
        int[] tentativa = new int[6];

        for (int cont = 0; cont < 6; cont++) {
            System.out.println("Digite o número " + (cont + 1) + ": ");
            tentativa[cont] = sc.nextInt();
        }
        return tentativa;
    }

    private int calcularV(int[] senha, int[] tentativa) {
        int V = 0;
        for (int cont = 0; cont < senha.length; cont++) {
            if (senha[cont] == tentativa[cont]) {
                V++;
            }
        }
        return V;
    }

    private int calcularQ(int[] senha, int[] tentativa) {
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
        return V == 6;
    }

    private int calcularMoedas(int tentativa) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Projeto3 exercicio = new Projeto3();

        boolean jogoAtivo = true;
        int tentativas = 8;
        int[] senha = exercicio.senhaCorreta();
        int qtdeTentativas = 0;

        while (jogoAtivo) {
            // ler a opção
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Fazer tentativa.");
            System.out.println("2 - Desistir da partida.");
            System.out.println("3 - Encerrar o jogo.");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    for (int cont = 0; cont < 8; cont++) {
                        System.out.println("Digite a senha da tentativa: ");
                        int[] tentativa = exercicio.senhaTentativa(sc);
                        exercicio.calcularV(senha, tentativa);
                        int V = exercicio.calcularV(senha, tentativa);
                        int Q = exercicio.calcularQ(senha, tentativa);
                        tentativas--;

                        if (exercicio.senhaDescoberta(V)) {
                            System.out.println("Parabéns, você ganhou!");
                            System.out.println(exercicio.calcularMoedas(cont+1));

                            break;
                        }

                        System.out.println("V = " + V);
                        System.out.println("Q = " + Q);
                        System.out.println("Tentativas restantes: " + tentativas);
                    }

                    break;

                case 2:
                    System.out.println();
            }
        }
    }
}

import java.util.Scanner;

public class Uni7Exe05 {

    private boolean expressaoCorreta(String expressao) {
        /* metodo para verificar se a expressão está correta quanto ao numero de parenteses */
        int contParenteses = 0;
        // percorrer o string
        for (int cont = 0; cont < expressao.length(); cont++) {
            // se o caracter na posição for ( acrescenta um
            if (expressao.charAt(cont) == '(') {
                contParenteses++;
            } else {
                // se o caracter na posição for ) diminui um
                if (expressao.charAt(cont) == ')') {
                    contParenteses--;
                    if (contParenteses < 0) {
                        return false;
                    }
                }
            }
        }
        return contParenteses == 0 ? true : false;
        /* o comando acima equivale a
        if(contaParenteses == 0)
            return true;
        else
            return false
        */
    }

    private int contarDivMult(String expressao) {
        // metodo que retorna a quantidade de operadores de divisao e multiplicação da expressão
        // variavel para contar os sinais de multiplicação e divisão
        int qtdDivMulti = 0;
        for (int cont = 0; cont < expressao.length(); cont++) {
            // se for sinal de * ou /, contar
            if (expressao.charAt(cont) == '*' || expressao.charAt(cont) == '/') {
                qtdDivMulti++;
            }
        }
        return qtdDivMulti;
    }

    private int primeiroOperador(String expressao) {
        /* metodo que retorna a posição do primeiro operador: + - * / */
        for (int cont = 0; cont < expressao.length(); cont++) {
            // se for sinal de *, /, + ou -, retornar a posição
            if (expressao.charAt(cont) == '+' || expressao.charAt(cont) == '-' || expressao.charAt(cont) == '*' || expressao.charAt(cont) == '/') {
                return cont;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // criar objeto para usar os metodos da classe
        Uni7Exe05 exercicio = new Uni7Exe05();
        // ler a expressão
        System.out.println("Digite a expressão aritmética");
        String expressao = sc.nextLine();

        // repetir para várias expressões
        while (!expressao.equalsIgnoreCase("fim")) {
            // testar se a expressão ta correta quanto ao número de parenteses
            if (exercicio.expressaoCorreta(expressao)) {
                int qtdDivMulti = exercicio.contarDivMult(expressao);
                System.out.println("Quantidade de divisões e multiplicações = " + qtdDivMulti);
                int posicaoOperador = exercicio.primeiroOperador(expressao);
                if (posicaoOperador > -1) {
                System.out.println("Posição do primeiro operador = " + posicaoOperador);
                } else {
                    System.out.println("Não existe operador aritmético na expressão.");
                }
            } else {
                System.out.println("Expressão incorreta quanto ao uso dos parênteses");
            }
            // ler a expressão
            System.out.println("Digite a expressão aritmética");
            expressao = sc.nextLine();
        }
        sc.close();
    }
}

/*
e: expressoes aritmeticas
s: para cada expressao:

   a: correta em relação aos parenteses
   b: numero de divisoes e multiplicacoes
   c: posicao do primeiro operador aritmetico
   
   
inicio
    ler(expressao)
    enquanto expressao != "FIM" faça

        se expressaoCorreta(expressao) entao
            escrever(contarDivMult(expressao))
            escrever(primeiroOperador(expressao))

        senao
            escrever("expressao incorreta")
        fim se
        ler(expressao)
    fim enquanto
fim

expressaoCorreta
    e: expressao
    s: V ou F

    inicio
        contaParenteses = 0
        para cont de 0 até tamanho expressao - 1 faça
            se expressao[cont] = '(' entao
                contaParenteses++;
*/
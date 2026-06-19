package Uni7;

import java.util.Scanner;

public class Uni7Exe02 {

    private int contarPalavras(String palavra, String frase) {
        // quantas vezes a palavar aparece na frase
        // acrescentar um espaço em branco no fim da frase para testar a ultima palavra
        frase +=" ";
        // contador das palavras
        int qtdePalavras = 0;
        // inicializar palavra para retirar da frase
        String novaPalavra = "";
        // percorrer a frase
        for (int cont = 0; cont < frase.length() ; cont++) {
            // ver se na posição cont tem uma letra e nao um espaço em branco 
            if (frase.charAt(cont) != ' ') {
                // acrescentar letra na nota palavra
                novaPalavra = novaPalavra+frase.charAt(cont);
            }
            else{
                // verificar se é a palavra pesquisada
                if (palavra.equalsIgnoreCase(novaPalavra)) {
                    // contar a palavra
                    qtdePalavras++;
                }
                // reiniciar a palavra da frase
                novaPalavra="";
            }
        }
        return qtdePalavras;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Uni7Exe02 exercicio = new Uni7Exe02();

        // ler as entradas
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();
        System.out.println("Digite uma palavra:");
        String palavra = sc.next();

        // chamar a função q conta as palabras na frase
        int qtdePalavras = exercicio.contarPalavras(palavra, frase);

        System.out.println("A palavra aparece " + qtdePalavras + " na frase.");
    }
}

/*
programa:
e: frase, palavra
s: quantas vezes a palavra está na frase

inicio
ler(frase)
ler(palavra)

contarPalavra
escrever(qtdePalavras)

fim

contarPalavras
e: frase, palavra
s: quantas vezes a palavra está na frase
 
inicio
    ler(frase)
    ler(palavra)
    frase = frase+
    qtdePalavras = 0
    novaPalavra = ""

    para cont de 0 ate tamanha da frase - 1 faça
        se frase[cont] != ' ' entao                             //cont nao funciona em java, precisa usar o char.At
            novaPalavra = novaPalavra + frase[cont]
        se nao palavra
            se palavra == novaPalavra entao                     // ==  nao funciona em java, precisa usar o equalsIgnoreCase (para comparar dois Strings)
                qtdaPalavras++
            fim se
            novaPalavra= ""
fim
 
  
*/
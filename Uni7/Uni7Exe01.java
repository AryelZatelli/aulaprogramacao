package Uni7;

import java.util.Scanner;

public class Uni7Exe01 {
    // private significa que só os metodos dessa classe podem usar esse método
    private int contarLetras(char letra, String frase) {
        /* metodo que recebe uma letra e uma frase e retorna a qtde de vezes que a letra está na frase */
        int contLetra = 0; // variavel para armazenar a qtde de vezes que a letra está na frase
        // percorrer a frase ate o seu final, que é representado pela função length
        for (int cont = 0; cont < frase.length(); cont++) {
            // verificar se a letra pesquisada corresponde à letra da frase
            if (letra == frase.charAt(cont)) {
                // contar a letra
                contLetra++;
            }
        }
        // retornar o resultado
        return contLetra;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // leitura da letra e da frase
        System.out.println("Digite uma letra: ");
        char letra = sc.next().charAt(0);

        sc.nextLine(); // para nao pular a leitura
        
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        // criar um objeto da classe Uni7Exe01
        Uni7Exe01 exercicio = new Uni7Exe01();

        // chamar a função que conta a quantidade de vezes que a letra esta na frase
        int quantidade = exercicio.contarLetras(letra, frase);

        // escrever o resultado
        System.out.println("A letra " + letra + " aparece " + quantidade + " vezes na frase.");

        sc.close();
    }
}

/*
 * função contarLetras
 * 
 * e: letra: Char parametros
 * frase: String parametros
 * s: quantidade de vezes q a letra está na frase: inteiro tipo
 * 
 * inicio
 * contLetra = 0;
 * para cont de 0 até tamanho(frase)-1 faça
 * se letra == frase[cont] entao
 * contLetra++
 * algoritmo (main)
 * 
 * e: letra, frase
 * s: qtde de vezes que a letra está na frase
 * 
 * inicio
 * ler(letra)
 * ler(frase)
 * quantidade = contarLetras(letra, frase)
 * escrever(quantidade)
 * fim se
 * fim
 * return cont[letra]
 */
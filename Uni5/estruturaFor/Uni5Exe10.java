package Uni5.estruturaFor;

public class Uni5Exe10 {
    public static void main(String[] args) {

        int encontrados = 0;

        // percorre números até encontrar 10 com a propriedade
        for (int numero = 1; encontrados < 10; numero++) {

            int temp = numero;
            int digitos = 0;

            // conta a quantidade de dígitos
            for (; temp > 0; temp /= 10) {
                digitos++;
            }

            // só funciona para quantidade par de dígitos
            if (digitos % 2 == 0) {

                int metade = digitos / 2;
                int divisor = (int) Math.pow(10, metade);

                int parte1 = numero / divisor;
                int parte2 = numero % divisor;

                int soma = parte1 + parte2;

                // verifica a propriedade
                if (soma * soma == numero) {
                    System.out.println(numero);
                    encontrados++;
                }
            }
        }
    }
}

/*
 * objetivo: encontrar os 10 primeiros números com a propriedade:
 * dividir o número ao meio, somar as partes e elevar ao quadrado
 * 
 * exemplo:
 * 3025 → 30 + 25 = 55 → 55² = 3025
 * 
 * inicio
 * encontrados = 0
 * 
 * para numero de 1 até infinito (até achar 10):
 *     contar dígitos
 *     
 *     se quantidade de dígitos for par:
 *         dividir número em duas partes
 *         soma = parte1 + parte2
 *         
 *         se soma² == numero:
 *             escrever numero
 *             encontrados++
 */

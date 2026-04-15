package Uni5.estruturaFor;

import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // repetir para 20 números
        for (int cont = 1; cont <= 20; cont++){
            // ler o numero
            System.out.println("Digite um número inteiro maior que 0: ");
            int numero = sc.nextInt();
            // testar se o número é divisível por 2
            if (numero % 2 == 0) {
                System.out.println("Par");
            } else{
                System.out.println("Ímpar");
            }            
        }

        sc.close();
    }
}

/*
e: 20 numeros inteiros
s: para cada numero informar se é par ou ímpar

inicio


  para contador de 1 a 20 faça
    ler(numero)

    se numero % 2=0 entao
      escrever("par")
    senao
      escrever("impar")
    fim se
  fim para
 fim 
*/
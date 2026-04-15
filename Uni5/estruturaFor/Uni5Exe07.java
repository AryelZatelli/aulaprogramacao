package Uni5.estruturaFor;

import java.util.Scanner;

public class Uni5Exe07 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // ler quantidade de valores
      System.out.println("Digite a quantidade de valores: ");
      int n = sc.nextInt();
      // inicializar com o menor valor possível
      float maior = Float.MIN_VALUE;
      // inicializar com o maior valor possível
      float menor = Float.MAX_VALUE;
      // repetir para os n valores
      for(int cont = 1; cont <= n; cont++){
         // ler o valor
         System.out.printf("Digite o valor %d\n", cont);
         float numero = sc.nextFloat();
         // verificar se é o maior numero
         if (numero > maior) {
            maior = numero;
         }
         // verificar se é o menor número
         if (numero < menor) {
            menor = numero;
         }
      }
      System.out.println("Maior valor: " + maior);
      System.out.println("Menor valor: " + menor);

      sc.close();
   }
}


/*
e: N
   N numeros
s: maior numero    
   menor numero    

inicio
   ler(N)
   maior = 0      // iniciar com o menor número possível  // MIN.VALUE
   menor = 9999   // iniciar com o maior nímero possível  // MAX.VALUE
   para cont de 1 até N faça
      ler(numero)
      se numero > maior então
         maior = numero
      fim se
      se numero < menor entao
         menor = numero
      fim se
   fim para
   escreva(maior numero, menor numero)
*/
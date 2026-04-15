package Uni5.estruturaFor;

public class Uni5Exe02 {
    public static void main(String[] args) {
        //inicializar variaveis para soma
        int somaPar = 0;
        int somaImpar = 0;
        // repetir para cem numeros
        for(int cont = 1; cont <= 100; cont++){
            if (cont % 2 != 0) {
                somaImpar+=cont; // += equivale a somaImpar = somaImpar + cont //
            } else{
                somaPar += cont;
            }
        }
        System.out.println("Soma dos pares: " + somaPar);
        System.out.println("Soma dos ímpares: " + somaImpar);

    }
}

/*
e: 
s: soma dos pares
   soma dos ímpares


início
     somaPar   = 0
     somaImpar = 0

     para contador de 1 a 100 faça
       se contador % 2 != 0 entao
         somaImpar = somaImpar + contador
       senao 
         somaPar = somaPar + contador
       fim se
    fim para   
   escrever(somaPar, somaImpar)
*/
package Uni5.estruturaFor;

public class Uni5Exe04 {
    public static void main(String[] args) {

        double soma = 0;

        for (float cont = 1; cont <= 20; cont++) {
            soma += (cont * 2 + 1 ) / (cont * (cont + 1));
        }   

        System.out.printf("Soma = %.8f\n", soma);
    }
}

/*
e: -
s: soma

inicio
    soma = 0
    denominador = 2
   para cont de 1 até 20 faça

        soma = soma + (cont * 2 + 1) / denominador
        numerador = numerador + 2


    fim para
  escreve(soma)
*/  
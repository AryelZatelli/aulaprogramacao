package Uni5.estruturaFor;

public class Uni5Exe03 {
    public static void main(String[] args) {

        double soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += 1.0 / i;
        }

        System.out.printf("Soma = %.6f\n", soma);
        
    }
}

/*
e: -

s: soma dos termos

inicio
    soma=0
    para cont de 1 até 100 faça
        soma = soma+ 1/ cont
    fim para
    escrever(soma)
*/

/*
s: soma dos termos

inicio
    soma=0
    para
        soma = soma+
         
    fim para
*/
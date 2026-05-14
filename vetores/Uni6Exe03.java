import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declarar o vetor de 12 posições
        float vetor[] = new float[12];

        // fazer a leitura dos valores
        for(int cont = 0; cont <= 11; cont++){
            System.out.println("Digite o valor da posição " + cont);
            vetor[cont] = sc.nextFloat();
        }

        // atualizacao do vetor
        for(int cont = 0; cont <= 11; cont++){
            // se a posição é par
            if (cont % 2 == 0) {
                vetor[cont] *= 1.02; // aumentar 2% nas posições pares
            } 
            else 
                vetor[cont] *= 1.05; // aumentar 5% nas posições ímpares
            
            // escrever o valor atualizado
            System.out.println("Vetor [" + cont + "] = " + vetor[cont]);
        
        }
         
        sc.close();
    }
}


/*
e: 12 valores -> vetor
s: vetor
   -> valores das posições ímpares aumentadas em 5% e pares em 2%

inicio
    vetor[12]
    para contador de 0 ate 11 faça
        ler(vetor[cont])
    fim para
    para contador de 0 ate 1 faça
        se cont % 2 == 0 entao
            vetor[cont] = vetor[cont] * 1.02
        se nao
            vetor[cont] = vetor[cont] * 1.05
        fim se
    fim para
fim
    escrever(vetor resultante)
*/
import java.util.Scanner;

public class Uni6Exe01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //definindo um vetor com 10 elementos
        int x[] = new int[10];

        for(int cont = 0; cont <= 9; cont++) {
            System.out.println("Digite o valor " + cont);
            x[cont] = sc.nextInt();
        }

        // escrever os numeros na ordem inversa
        for(int cont = 9; cont >= 0; cont--){
            System.out.println(x[cont]);
        }

        sc.close();
    }
} 




/*
e: 10 numeros
s: 10 numeros na ordem inversa

inicio
    para cont de 0 a 9 faça
        ler(x[cont])
    fim para
    
    para cont de 9 a 0 faça passo-1
        escrever(x[cont])
    fim para
     
     
 
*/
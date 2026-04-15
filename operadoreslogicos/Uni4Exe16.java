package operadoreslogicos;

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite a primeira idade");
    int homem1 = sc.nextInt();
    System.out.println("Digite a segunda idade");
    int homem2 = sc.nextInt();
    System.out.println("Digite a terceira idade");
    int mulher1 = sc.nextInt();
    System.out.println("Digite a quarta idade");
    int mulher2 = sc.nextInt();
    
    int homemVelho, homemNovo, mulherVelha, mulherNova;

    if (homem1> homem2) {
        homemVelho = homem1;
        homemNovo = homem2;
    } else{
        homemVelho = homem2;
        homemNovo = homem1;
    }

    if (mulher1 > mulher2) {
        mulherVelha = mulher1;
        mulherNova = mulher2;
    } else{
        mulherVelha = mulher2;
        mulherNova = mulher1;
    }

    System.out.println("Soma: " + (homemVelho + mulherNova));
    System.out.println("Produto: " + (homemNovo * mulherVelha));


    sc.close();
}
}

package Uni04;

import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("A cor é azul?");
        boolean resposta = sc.nextBoolean();
        
        if (resposta) {
            System.out.println("A resposta é sim.");
        } else {   
            System.out.println("A resposta é não.");
        }


        sc.close();   
    }
}

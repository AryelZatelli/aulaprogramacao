package Uni04;

import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        // leitura de um caracter em java: usar o metodo chatAt(0)
        char letra = sc.next().charAt(0);
        // converter a letra para maiusculo
        letra = Character.toUpperCase(letra);

        if (letra == 'M') {
            System.out.println("Masculino");
        } else if (letra == 'F') {
            System.out.println("Feminino");
        } else if (letra == 'I') {
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada incorreta");
        }

        sc.close();
    }
}

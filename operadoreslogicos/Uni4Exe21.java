package operadoreslogicos;

import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura = sc.nextDouble();
        double massa = sc.nextDouble();

        double imc = massa / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc < 25.0) {
            System.out.println("Saudável");
        } else if (imc < 30.0) {
            System.out.println("Sobrepeso");
        } else if (imc < 35.0) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40.0) {
            System.out.println("Obesidade Grau II (severa)");
        } else {
            System.out.println("Obesidade Grau III (mórbida)");
        }

        sc.close();
    }
}

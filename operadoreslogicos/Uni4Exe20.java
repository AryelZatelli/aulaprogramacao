package operadoreslogicos;

import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double ne = sc.nextDouble();

        double media = (n1 + n2 * 2 + n3 * 3 + ne) / 7;

        char conceito;
        String resultado;

        if (media >= 9.0) {
            conceito = 'A';
        } else if (media >= 7.5) {
            conceito = 'B';
        } else if (media >= 6.0) {
            conceito = 'C';
        } else if (media >= 4.0) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }

        System.out.printf("A média de aproveitamento foi: %.2f. Conceito: %c. %s\n",
                media, conceito, resultado);

        sc.close();
    }
}

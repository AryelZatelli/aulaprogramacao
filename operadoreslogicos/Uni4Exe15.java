package operadoreslogicos;

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de meses que o funcionário foi admitido: ");
        int meses = sc.nextInt();

        if (meses <= 12) {
            System.out.println("O funcionário irá receber 5% de reajuste");
        } else if (meses >= 13 && meses <= 48) {
            System.out.println("O funcionário irá receber 7% de reajuste");
        } else
            System.out.println("Reajuste não informado");
        sc.close();
    }
}

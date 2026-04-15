package operadoreslogicos;

import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vencimento = sc.nextInt();
        int pagamento = sc.nextInt();
        double valor = sc.nextDouble();

        double total;

        if (pagamento <= vencimento) {
            total = valor * 0.9;
            System.out.printf("O pagamento está em dia. O valor da prestação = R$%.2f\n", total);
        } else if (pagamento <= vencimento + 5) {
            total = valor;
            System.out.printf("O pagamento está atrasado. O valor da prestação = R$%.2f\n", total);
        } else {
            int diasAtraso = pagamento - vencimento;
            total = valor * (1 + (0.02 * diasAtraso));
            System.out.printf("O pagamento está atrasado. Multa de 2%% por dia de atraso. Valor da prestação = R$ %.2f\n", total);
        }

        sc.close();
    }
}

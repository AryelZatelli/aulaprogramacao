import java.util.Scanner;

public class Uni6Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de questões do gabarito");
        int N = sc.nextInt();
        int gabarito[] = new int[N];
        int respostasCertas = 0;


        for(int cont = 0; cont < N; cont++){
            System.out.println("Digite as respostas do gabarito");
            char respostasDoGabarito = sc.next().charAt(0);
            gabarito[cont] = respostasDoGabarito;
            System.out.println("Digite a resposta do aluno");
            char respostasAluno = sc.next().charAt(0);
            if (respostasAluno == respostasDoGabarito) {
                respostasCertas++;
            }
        }
    System.out.println("\nQuantidade de respostas certas: " + respostasCertas);
    }
}

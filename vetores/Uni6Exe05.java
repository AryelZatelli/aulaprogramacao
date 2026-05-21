import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetorHomem[] = new int[5];
        int vetorMulher[] = new int[5];
        int pontos = 0;

        for(int cont = 0; cont < 5; cont++){
            System.out.println("Digite a resposta conforme os números para o homem. \n 1 - SIM \n 2 - NÃO  \n 3 - INDIFERENTE \n");
            int respostaHomem = sc.nextInt();
            vetorHomem[cont] = respostaHomem;
        }

        for(int cont = 0; cont < 5; cont++){
            System.out.println("Digite a resposta conforme os números para a mulher. \n 1 - SIM \n 2 - NÃO  \n 3 - INDIFERENTE \n");
            int respostaMulher = sc.nextInt();
            vetorMulher[cont] = respostaMulher;
        }
        for(int cont = 0; cont < 5; cont++){
            if (vetorHomem[cont] == vetorMulher[cont]) {
                pontos+=3;
            } else if (vetorHomem[cont] == 3 && (vetorMulher[cont] == 1 || vetorMulher[cont] == 2)) {
                pontos+=1;
            } else if (vetorMulher[cont] == 3 && (vetorHomem[cont] == 1 || vetorHomem[cont] == 2)) {
                pontos+=1 ;
            } else if (vetorHomem[cont] == 1 && vetorMulher[cont] == 2) {
                pontos-=2;
            } else if (vetorMulher[cont] == 1 && vetorHomem[cont] == 2)
                pontos-=2;
        }

        if (pontos >= 15) {
            System.out.println("Casem!");
        } else if (pontos >= 10 && pontos <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (pontos >= 5 && pontos <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (pontos >= 0 && pontos <= 4) {
            System.out.println("Vale um encontro.");
        } else if (pontos >= -1 && pontos <= -9) {
            System.out.println("Melhor não perder tempo");
        } else if (pontos <= -10) {
            System.out.println("Vocês se odeiam!");
        }
    }
}

import java.util.Scanner;

public class Uni6Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char vetorSexo[] = new char[30];
        double vetorNota[] = new double[30];
        int vetorIdade[] = new int[30];
        double somaHomens = 0;
        int qtdHomens = 0;
        int menorIdade = 999;
        double notaMaisJovem = 0;
        double somaNotas = 0;

        for (int cont = 0; cont < 30; cont++) {
            System.out.println("Digite o sexo: (M/F) ");
            char sexo = sc.next().charAt(0);
            vetorSexo[cont] = sexo;
            System.out.println("Digite a nota: ");
            double nota = sc.nextDouble();
            vetorNota[cont] = nota;
            System.out.println("Digite a idade: ");
            int idade = sc.nextInt();
            vetorIdade[cont] = idade;
            somaNotas += nota;
        }
        double media = somaNotas / 30;

        for (int cont = 0; cont < 30; cont++) {
            if (vetorSexo[cont] == 'M') {
                somaHomens += vetorNota[cont];
                qtdHomens++;
            }
        }
        double mediaHomens = somaHomens / qtdHomens;
        for (int cont = 0; cont < 30; cont++) {
            if (vetorSexo[cont] == 'F' && vetorIdade[cont] < menorIdade) {
                menorIdade = vetorIdade[cont];
                notaMaisJovem = vetorNota[cont];
            }
        }
        int qtdMulheres = 0;
        for (int cont = 0; cont < 30; cont++) {
            if (vetorSexo[cont] == 'F' && vetorIdade[cont] > 50 && vetorNota[cont] > media) {
                qtdMulheres++;
            }
        }
        System.out.printf("Média geral: %.1f\n", media);
        System.out.printf("Média dos homens: %.1f\n", mediaHomens);
        System.out.printf("Nota da mulher mais jovem: %.1f\n", notaMaisJovem);
        System.out.println("Quantidade de mulheres acima de 50 que deram nota maior que a média " + qtdMulheres);

        sc.close();
    }
}

import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de clientes: ");
        int N = sc.nextInt();

        // criar os vetores
        byte sexo[] = new byte[N];
        int idade[] = new int[N];
        float nota[] = new float[N];
        // iniciar a variável
        int mulherMaisJovem = Integer.MAX_VALUE;
        int contaM = 0; // qtde homens
        float somaNotaM = 0; // soma nota dos homens
        float somaNota = 0; // soma todas as notas
        int contaAcima = 0; // qtde de mulheres com mais de 50 anos que deram nota acima da média
        float notaMulherMaisJovem = 0;

        // para cada pessoa
        for (int cont = 0; cont < N; cont++) {
            // ler os dados
            System.out.println("Digite o sexo da pessoa: [" + cont + "]");
            sexo[cont] = sc.nextByte();
            System.out.println("Digite a nota da pessoa: [" + cont + "]");
            nota[cont] = sc.nextFloat();
            System.out.println("Digite a idade da pessoa: [" + cont + "]");
            idade[cont] = sc.nextInt();

            // somar a nota
            somaNota += nota[cont];

            // testar o sexo e fazer as ações de acordo com cada um
            if (sexo[cont] == 2) {
                somaNotaM = somaNotaM + nota[cont]; // somar nota do homem
                contaM++; // contar o homem
            } else {
                // guardar a nota da mulher mais jovem
                if (idade[cont] < mulherMaisJovem) {
                    mulherMaisJovem = idade[cont];
                    notaMulherMaisJovem = nota[cont];
                }
            }
        }
        // calcular media
        float media = somaNota / N;

        // repetir para N pessoas
        for (int cont = 0; cont < N; cont++) {
            // testar se a mulher com mais de 50 anos deu nota acima da média
            if (sexo[cont] == 1 && idade[cont] >= 50 && nota[cont] > media) {
                contaAcima++;
            }
        }
        // escrever a media 
        System.out.printf("Nota média = %2.f\n ", media); 
        // escrever a media dos homens
        System.out.printf("Nota média masculina = %2.f\n ", somaNotaM / contaM);
        // escrever a nota da mulher mais jovem
        System.out.println(contaAcima + " mulher(es) acima de 50 anos com nota acima da média = %2.f\n ");

    }
}


/*
e: 
    N -> numero de pessoas
    sexo(N)
    nota(N)
    idade(N)

s: nota media geral
   nota media dos homens
   nota da mulher mais jovem
   nota superior a media das mulheres de mais de 50 anos

inicio
    ler(N)
    sexo[N]
    nota[N]
    idade[N]

inicio
    ler(N)
    mulherMaisJovem = 999
    contaAcima = 0
    contaM = 0
    somaNotaM = 0
    somaNota = 0
    para cont de 0 ate N-1 faça
        ler(sexo[cont])
        ler(nota[cont])
        ler(idade[cont])
        somaNota = somaNota + nota[cont]
        se sexo[cont] = 2 entao
            somaNotaM = somaNotaM + nota[cont]
            contaM++
        se nao 
            se idade[cont] < mulherMaisJovem entao
                mulherMaisJovem = idade[cont]
                notaMulherMaisJovem = nota[cont]
            fim se
    fim para
    media = somaNota / N
    para cont de 0 ate N-1 faça
        se sexo[cont] = 1 E nota[cont] > media E idade >= 50 entao
            contaAcima++
        fim se
    fim para

    escrever("nota media = " + media)
    escrever("nota media masculina = " + somaNotaM / contaM)
    escrever("mulher acima de 50 anos com nota acima da média " + contaAcima)
fim
*/


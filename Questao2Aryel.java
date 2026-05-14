/*
e: altura, diametro
s: volume a cada árvore
   percentual de árvores raquíticas
   volume da árvore mais alta
   diâmetro médio das árvores
   
inicio
    ler(altura)
    arvores = 0
    arvoreRaquitica = 0
    diametro = 0
    raquiticas = 0
    somaDiametro = 0
    volume = 0
    volumeAnterior = 0
    volumeMaior = 0

    enquanto (altura != 0) faça
        arvores++
        
        ler(diametro)
        somaDiametro = somaDiametro + diametro

        raio = diametro / 2
        volumeAnterior = volume //TODO PROF: qual o sentido de guardar o volume anterior?
        volume = (PI * raio2 * altura) 

        se volumeAnterior > volumeMaior entao //TODO PROF - não deveria comparar com o anterior mas com o atual. Além disso, foi pedida a maior altura, não o maior volume.
            volumeMaior = volumeAnterior
        fim se

        escrever(volume)

        se altura < 2 OU diametro < 0.50 entao
            arvoreRaquitica++
        fim se
    
        raquiticas = arvoreRaquitica / 100 * arvores //TODO PROF: deve ser fora da repetição

        ler(altura)
    fim enquanto
    
    escrever(raquiticas)
    escrever(volumeMaior) //TODO PROF: Não foi isso que foi solicitado
    escrever(somaDiametro/arvores)
        
*/

import java.util.Scanner;

public class Questao2Aryel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();

        int arvores = 0;
        int arvoreRaquitica = 0;
        double diametro = 0;
        double raquiticas = 0;
        double somaDiametro= 0;
        double volume = 0;
        double volumeAnterior = 0;
        double volumeMaior = 0;
        
        while (altura != 0) {
            arvores++;

            System.out.println("Digite o diâmetro: ");
            diametro = sc.nextDouble();
            somaDiametro+=diametro;

            double raio = diametro / 2;
            volumeAnterior = volume;
            volume = Math.PI * (raio * raio) * altura;

            if (volumeAnterior > volumeMaior) {
                volumeMaior = volumeAnterior;
            }


            System.out.printf("Volume: %.4f\n", volume);

            if (altura < 2.00 || diametro < 0.50) {
                arvoreRaquitica++;
            }
    
            raquiticas = arvoreRaquitica * 100 / arvores;

            System.out.println("Digite a altura: ");
            altura = sc.nextDouble();
        }

        System.out.printf("Percentual de árvores raquíticas: %.2f\n", raquiticas);
        System.out.printf("Volume da árvore mais alta: %.4f\n", volumeMaior);
        System.out.printf("Diâmetro médio das árvores: %.4f\n", somaDiametro / arvores);
        sc.close();
    }
}

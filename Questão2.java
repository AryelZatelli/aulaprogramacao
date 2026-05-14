/*
e: altura, diametro
s: volume a cada árvore
   percentual de árvores raquíticas
   volume da árvore mais alta
   diâmetro médio das árvores
   
inicio
    contaArvores = 0
    contaRaquitica = 0
    diametro = 0
    raquiticas = 0
    somaDiametro = 0
    volume = 0
    volumeAnterior = 0
    maiorVolume = 0

    ler(altura)

    enquanto (altura != 0) faça
        contaArvores++
        
        ler(diametro)
        somaDiametro = somaDiametro + diametro

        raio = diametro / 2
        volumeAnterior = volume
        volume = (PI * raio2 * altura) 

        se volumeAnterior > maiorVolume entao
            maiorVolume = volumeAnterior
        fim se

        escrever(volume)

        se altura < 2 OU diametro < 0.50 entao
            contaRaquitica++
        fim se
    
        raquiticas = contaRaquitica / 100 * contaArvores

        ler(altura)
    fim enquanto
    
    escrever(raquiticas)
    escrever(maiorVolume)
    escrever(somaDiametro/contaArvores)
        
*/

import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inicializar as variáveis
        double maiorVolume = 0;
        double maisAlta = 0;
        int contaRaquitica = 0;
        int contaArvores = 0;
        double somaDiametro= 0;
        
        // ler a altura
        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();
        
        // repetir até ser digitado zero
        while (altura != 0) {
            contaArvores++;

            System.out.println("Digite o diâmetro: ");
            double diametro = sc.nextDouble();
            
            // calcular o raio
            double raio = diametro / 2;
            // calcular o volume
            double volume = Math.PI * raio * raio * altura;
            // escrever o volume
            System.out.printf("Volume = %.4f\n", volume);

            // verificar se a árvore é raquítica
            if (altura < 2.00 || diametro < 0.50) {
                contaRaquitica++;
            }
            // contar a árvore
            contaArvores++;            

            // somar o diametro das arvores
            somaDiametro += diametro;

            // verificar a arvore mais alta
            if (altura > maisAlta) {
                maisAlta = altura;
                maiorVolume = volume;
            } else 
                // verificar se igualou a altura para testar o volume
                if (altura == maisAlta) {
                    if (volume > maiorVolume) {
                        maiorVolume = volume;
                    }
            }

            System.out.println("Digite a altura: ");
            altura = sc.nextDouble();
        }
        
        double perRaquiticas = (double) contaRaquitica / contaArvores * 100.0; 

        System.out.printf("Percentual de árvores raquíticas: %.2f\n", perRaquiticas);
        System.out.printf("Volume da árvore mais alta: %.4f\n", maiorVolume);
        System.out.printf("Diâmetro médio das árvores: %.4f\n", somaDiametro / contaArvores);

        sc.close();
    }
}

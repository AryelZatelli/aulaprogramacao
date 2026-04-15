package Uni5.estruturaDoWhile;

import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // inicializar as variaveis para contar os votos
        long voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, votoNulo = 0, votoBranco = 0;
        byte voto;
        // repetir os comandos
        do{
            System.out.println("Informe o voto(de 1 a 4)");
            System.out.println("5 - Nulo");
            System.out.println("6 - Branco");
            voto = sc.nextByte();
            // contar de acordo com o voto
            switch (voto) {
                case 1: voto1++; break;
                case 2: voto2++; break;
                case 3: voto3++; break;
                case 4: voto4++; break;
                case 5: votoNulo++; break;
                case 6: votoBranco++; break;
                default:
                    if (voto > 6) {
                        System.out.println("Opção inválida");
                    }
            }

        } while (voto > 0); {
            System.out.println("Votos Candidato 1 " + voto1);            
            System.out.println("Votos Candidato 2 " + voto2);            
            System.out.println("Votos Candidato 3 " + voto3);            
            System.out.println("Votos Candidato 4 " + voto4);            
            System.out.println("Votos Nulos " + votoNulo);            
            System.out.println("Votos Brancos " + votoBranco);            
            long totalVotos = voto1 + voto2 + voto3 + voto4 + votoNulo + votoBranco;
            // (float) força a divisão aceitar numeros decimais
            System.out.printf("Percentual de brancos e nulos %.2f", (float)(votoNulo + votoBranco)/totalVotos * 100.0);

            sc.close();
        }
    }
}


/*
e: voto(até o voto ser 0)

s: total de votos de cada candidato
   total de nulos 
   total de brancos
   percentual de brancos e nulos
   
inicio
    cont1 = 0
    cont2 = 0
    cont3 = 0
    cont4 = 0
    contNulo = 0
    contBranco = 0

        ler(voto)
        escolha(voto)
         1: cont1 = cont1 + 1  
         2: cont2 = cont2 + 1  
         3: cont3 = cont3 + 1  
         4: cont4 = cont4 + 1  
         5: contNulo = contNulo + 1
         6: contBranco = contBranco + 1
         se nao
         se voto > 6 entao

    escrever(cont1)
    escrever(cont2)
    escrever(cont3)
    escrever(cont4)
    escrever(contNulo)
    escrever(contBranco)
    totalVotos=(cont1 + cont2 + cont3 + cont4 + contNulo + contBranco) 
    escrever((contNulo + contBranco) / totalVotos * 100)
fim
*/
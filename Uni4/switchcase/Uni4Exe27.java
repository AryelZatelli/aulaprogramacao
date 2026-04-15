package Uni4.switchcase;

import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // entrada
        System.out.println("Digite hora e minutos da chegada:");
        int horaChegada = sc.nextInt();
        int minChegada = sc.nextInt();

        System.out.println("Digite hora e minutos de partida:");
        int horaSaida = sc.nextInt();
        int minSaida = sc.nextInt();

        int minutosTotais = (horaSaida * 60 + minSaida) -
                            (horaChegada * 60 + minChegada);

        int horas = minutosTotais / 60;
        int minutos = minutosTotais % 60;

        int horasApagar;

        if (minutosTotais < 30) {
            horasApagar = 1;
        } else {
            horasApagar = horas;
            if (minutos >= 30) {
                horasApagar++;
            }
        }

        // garantir pelo menos 1 hora
        if (horasApagar == 0) {
            horasApagar = 1;
        }

        // cálculo do valor
        switch (horasApagar) {
            case 1:
            case 2:
                System.out.printf("Valor a pagar = R$%.2f\n", horasApagar * 5.0);
                break;

            case 3:
            case 4:
                System.out.printf("Valor a pagar = R$%.2f\n", 10 + (horasApagar - 2) * 7.5);
                break;

            default:
                System.out.printf("Valor a pagar = R$%.2f\n", 25 + (horasApagar - 4) * 10.0);
        }

        System.out.printf("Ficou estacionado %d horas e %d minutos\n", horas, minutos);

        sc.close();
    }
}

/*
e: hora chegada
   minuto chegada
   hora partida
   minuto partida

s: tempo estacionado
   preço cobrado


inicio
    ler(horaChegada, minutoChegada, horaPartida, minutoPartida)3
    
    CALCULO DO TEMPO

    minutos totais = (horaPartida * 60 + minutoPartida) - 
                     (horaChegada * 60 + minutoChegada)

    minutos = minutos totais % 60
    horas   = minutos totais / 60

    se horas = 0 entao
      horas a pagar = 1
    senao
      horas a pagar = horas
      se minutos > 29 entao
    horas a pagar = horas + 1

escolha (horas a pagar)

1,
2: escrever (horas a pagar * 5)
3,
4: escrever (10 + (horas a pagar-2) * 7,50)
se nao(default)
   escrever (25 + (horas a pagar-4) * 10 )
fim escolha

escrever(horas, minutos)
fim

*/
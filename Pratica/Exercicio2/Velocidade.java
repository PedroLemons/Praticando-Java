package Pratica.Exercicio2;

import java.util.Scanner;

public class Velocidade {
    public static void main (String[] veloc) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("-------- INICIANDO O PROGRAMA --------");

        System.out.println("Digite a distancia em km");
        double distancia = sc.nextDouble();

        System.out.println("Digite o tempo em horas");
        double tempo = sc.nextDouble();

        double velocidade = distancia / tempo;

        System.out.printf("Velocidade media: %.2f km/h", velocidade);
    }
}

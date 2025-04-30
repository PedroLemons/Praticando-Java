package Pratica.Exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IndicePluvio {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        double[] indices = new double[7];
        String[] diaDaSemana = {"Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
        
        System.out.println("Indice pluviometrico por dia:");
        
        for (int i = 0; i < 7; i++) {
            while (true) {
                System.out.print(diaDaSemana[i] + ": ");
                try {
                    indices[i] = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, insira um numero.");
                }
            }
        }

        double soma = 0;
        
        for (double indice : indices) {
            soma += indice;
        }
        
        double media = soma / 7;

        double max = indices[0];
        double min = indices[0];
        int diaMax = 0;
        int diaMin = 0;

        for (int i = 1; i < 7; i++) {
            if (indices[i] > max) {
                max = indices[i];
                diaMax = i;
            }
            if (indices[i] < min) {
                min = indices[i];
                diaMin = i;
            }
        }

        System.out.printf("Indice medio: %.2f mm\n", media);
        System.out.printf("Indice max: %.2f mm (%s)\n", max, diaDaSemana[diaMax]);
        System.out.printf("Indice min: %.2f mm (%s)\n", min, diaDaSemana[diaMin]);

    }
}


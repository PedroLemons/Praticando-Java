package Pratica.Exercicio3;

import java.util.Scanner;

public class Media {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int i = 0;

        System.out.println("Digite numeros para calcular a media. Digite 'S' para encerrar.");

        while (true) {
            System.out.print("Informe um numero: ");
            String entrada = scanner.nextLine();

            if (entrada.equals("S")) {
                break;
            }

            try {
                double numero = Double.parseDouble(entrada);
                soma += numero;
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Por favor, insira um número válido ou 'S' para sair.");
            }
        }
        
        double media = soma / i;
        System.out.printf("A media é: %.2f\n", media);
 
    }
}
package Pratica.Exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SomaPar {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int somaPares = 0;
        int numeros = 20;

        System.out.println("Digite 20 numeros: ");

        for (int i = 1; i <= numeros; i++) {
            while (true) {
                try {
                    int num = scanner.nextInt();

                    if (num % 2 == 0) {
                        somaPares += num;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite um numero inteiro");

                    scanner.next();
                }
            }
        }

        System.out.println("A soma de todos os numeros pares é " + somaPares);
    }

}

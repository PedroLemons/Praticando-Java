package Pratica.Exercicio2;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        System.out.println("");
        System.out.println("-------- INICIANDO O PROGRAMA --------");


        System.out.print("Digite um numero inteiro positivo: ");
        int limite = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;
        int proxNum = 0;

        System.out.print("Serie Fibonacci " + num1 + ", " + num2);

        while (proxNum < limite) {
            proxNum = num1 + num2;

            System.out.print(", " + proxNum);
            num1 = num2;
            num2 = proxNum;
        }
    }

}

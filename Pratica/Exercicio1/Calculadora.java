package Pratica.Exercicio1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = sc.nextDouble();

        System.out.print("Digite a operacao desejada (+, -, /, x): ");
        String operacao = sc.next();

        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            case "x":
                resultado = numero1 * numero2;
                break;
            default:
                System.out.println("Erro: Operacao invalida. Escolha um dos operadoes a seguir +, -, / ou x.");
                return;
        }

        System.out.println("");
        System.out.println("");
        System.out.print("Resultado: ");
        System.out.println(resultado);
    }
}

package Pratica.Exercicio2;

import java.util.Scanner;

public class Equacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a: ");
        int a = scanner.nextInt();

        System.out.print("Digite b: ");
        int b = scanner.nextInt();

        System.out.print("Digite c: ");
        int c = scanner.nextInt();

        System.out.printf("(%dx²) + (%dx) + (%d) = 0\n", a, b, c);

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("Resultado: x1 = %.1f e x2 = %.1f\n", x1, x2);

        } else {
            System.out.println("Delta negativo.");
        }
    }
}

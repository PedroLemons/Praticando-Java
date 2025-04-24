package Pratica.Exercicio2;
import java.util.Scanner;

public class DistanciaPontos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coordenada x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Coordenada y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Coordenada x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Coordenada y2: ");
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("A distancia entre os pontos e: %.2f unidades\n", distancia);
    }
}

package Pratica.Exercicio2;

public class Velocidade {
    public static void main (String[] veloc) {

        double distancia = Double.parseDouble(veloc[0]);
        double tempo = Double.parseDouble(veloc[1]);

        double velocidade = distancia / tempo;

        System.out.printf("Velocidade media: %.2f km/h", velocidade);
    }

}

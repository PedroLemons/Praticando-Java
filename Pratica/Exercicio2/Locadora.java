package Pratica.Exercicio2;

import java.util.Scanner;

public class Locadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("-------- INICIANDO O PROGRAMA --------");

        System.out.print("Quantidade de DVDs alugados: ");
        int qtdDVD = sc.nextInt();

        System.out.print("Valor do aluguel: ");
        double valorAluguel = sc.nextDouble();

        double faturamentoMensal = (qtdDVD / 3.0) * valorAluguel;
        double faturamentoAnual = faturamentoMensal * 12;

        double multas = (qtdDVD / 3.0) * 0.1;
        double multaMensal = multas * valorAluguel * 0.1;
        double multaTotal = multaMensal * 12;

        double faturamentoTotal = faturamentoAnual + multaTotal;

        System.out.printf("Faturamento anual: R$ %.2f\n", faturamentoAnual);
        System.out.printf("Valor ganho com multas por mes: R$ %.2f\n", multaMensal);
        System.out.printf("Faturamento anual com multas: R$ %.2f\n", faturamentoTotal);
    }
}

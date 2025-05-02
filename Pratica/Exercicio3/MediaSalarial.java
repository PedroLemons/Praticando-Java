package Pratica.Exercicio3;

import java.util.Scanner;

public class MediaSalarial {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
// 1) Peça ao usuário que informe quantos funcionários existem na empresa.
        int qtdFuncionarios;
        while (true) {
            System.out.print("Informe a quantidade de funcionarios: ");
            try {
            	qtdFuncionarios = Integer.parseInt(scanner.nextLine());
                if (qtdFuncionarios > 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido. Por favor, digite um numero.");
            }
        }

// 2) Instancie um array de strings e um array de doubles com o tamanho informado.
        String[] nomes = new String[qtdFuncionarios];
        double[] salarios = new double[qtdFuncionarios];

// 3) Peça ao usuário que informe o nome e o salário de cada funcionário e armazene o nome 
// no array de strings e o salário no array de doubles.
        for (int i = 0; i < qtdFuncionarios; i++) {
            while (true) {
                System.out.printf("Informe o nome do funcionario %d: ", i + 1);
                String nome = scanner.nextLine();
// Os nomes devem conter ao menos 3 caracteres.
                if (nome != null && nome.length() >= 3) {
                    nomes[i] = nome;
                    break;
                } else {
                    System.out.println("Nome invalido. O nome deve contter ao menos 3 caracteres.");
                }
            }

// Se o usuário informar um salário inválido, peça para ele informar novamente.  
// Imprima os salários com duas casas decimais.
            while (true) {
                System.out.printf("Informe o salario do funcionario %d: ", i + 1);
                try {
                    double salario = Double.parseDouble(scanner.nextLine());
                    if (salario > 0) {
                        salarios[i] = salario;
                        break;
                    } else {
                        System.out.println("Salario invalido. Deve ser um numero positivo.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Valor invalido. Por favor, insira um numero.");
                }
            }
        }

// 4) Calcule a média salarial da empresa.
        double somaSalarios = 0;
        for (double salario : salarios) {
            somaSalarios += salario;
        }
        
        double mediaSalarial = somaSalarios / qtdFuncionarios;

// 5) Imprima a lista de nomes/salários que estão acima da média salarial
        System.out.println("Nomes com salario acima da media:");
        for (int i = 0; i < qtdFuncionarios; i++) {
            if (salarios[i] > mediaSalarial) {
                System.out.printf("%s - R$%.2f\n", nomes[i], salarios[i]);
            }
        }
    }
}

package Pratica.Exercicio2;

import java.util.Scanner;

public class BonusSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a letra correspondente ao cargo do funcionario para consulta:\n "
            + "A - Diretor\n "
            + "B - Gerente\n "
            + "C - Analista\n "
            + "D - Programador\n "
            + "E - Auxiliar de Limpeza\n"); 
        String cargo = scanner.nextLine();    

        System.out.print("Digite o salario atual do funcionario: ");
        double salario = scanner.nextDouble();

        double bonus = 0.0;

        switch (cargo) {
            case "A":
                cargo = "Diretor";
                System.out.print("Digite a quantidade de departamentos gerenciados: ");
                int departamentos = scanner.nextInt();
                bonus = 4 * salario + 3000 * departamentos;
                break;
            
                case "B":
            	cargo = "Gerente";
                System.out.print("Digite a quantidade de pessoas gerenciadas: ");
                int pessoas = scanner.nextInt();
                bonus = 2 * salario + 100 * pessoas;
                break;

            case "C":
            	cargo = "Analista";
                bonus = salario;
                break;

            case "D":
            	cargo = "Programador";
                bonus = 0.8 * salario;
                break;

            case "E":
            	cargo = "Auxiliar de limpeza";
                bonus = 0.5 * salario;
                break;

            default:
                System.out.println("Cargo nao reconhecido.");
                scanner.close();
                return;
        }

        System.out.printf("O bonus anual de um %s com salario R$%.2f e de: R$ %.2f\n", cargo, salario, bonus);

    }

}

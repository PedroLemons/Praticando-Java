package Pratica.Exercicio1;

import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("-------- INICIANDO O PROGRAMA --------");

        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = sc.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.println( primeiroNome + " " + sobrenome );

        sc.close();
    }
}


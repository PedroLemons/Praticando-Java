package Pratica.Exercicio1;

public class Calculadora {
    public static void main(String[] args) {
        args = new String[] { "10", "5", "+" };

        double numero1 = Double.parseDouble(args[0]);
        double numero2 = Double.parseDouble(args[1]);
        String operacao = args[2];

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
                System.out.println("Erro: Operacao invalida. Use +, -, / ou x.");
                return;
        }

        System.out.println("");
        System.out.println("");
        System.out.print("Resultado: ");
        System.out.println(resultado);
    }
}

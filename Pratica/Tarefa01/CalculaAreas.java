public class CalculaAreas {

    public static double calculaAreaRetangulo(double lado1, double lado2) {
        if (lado1 < 0 || lado2 < 0) {
            throw new RuntimeException("Digite um valor positivo.");
        }
        return lado1 * lado2;
    }

    public static double calculaAreaCircunferencia(double raio) {
        if (raio < 0) {
            throw new RuntimeException("Digite um valor positivo.");
        }
        return Math.PI * raio * raio;
    }

    public static double calculaAreaTriangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            throw new RuntimeException("Digite um valor positivo.");
        }
        return (base * altura) / 2.0;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        try {
            System.out.println("Escolha a forma:");
            System.out.println("1- Retangulo");
            System.out.println("2- Circulo");
            System.out.println("3- Triangulo");
            int escolha = scanner.nextInt();

            double area = 0;

            switch (escolha) {
                case 1:
                    System.out.print("Digite o lado 1 do retangulo: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Digite o lado 2 do retangulo: ");
                    double lado2 = scanner.nextDouble();
                    area = calculaAreaRetangulo(lado1, lado2);
                    break;
                case 2:
                    System.out.print("Digite o raio do circulo: ");
                    double raio = scanner.nextDouble();
                    area = calculaAreaCircunferencia(raio);
                    break;
                case 3:
                    System.out.print("Digite a base do triangulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite a altura do triangulo: ");
                    double altura = scanner.nextDouble();
                    area = calculaAreaTriangulo(base, altura);
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    scanner.close();
                    return;
            }
            System.out.printf("Valor da area: %.2f\n", area);

        } catch (RuntimeException e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
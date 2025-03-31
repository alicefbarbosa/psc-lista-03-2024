package E04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código da operação (1 - Perímetro do círculo, 2 - Área do círculo, 3 - Volume da esfera): ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        final double PI = 3.14159;

        switch (operacao) {
            case 1:
                double perimetro = 2 * PI * raio;
                System.out.println("O perímetro do círculo é: " + perimetro);
                break;

            case 2:
                double area = PI * raio * raio;
                System.out.println("A área do círculo é: " + area);
                break;

            case 3:
                double volume = (4.0 / 3) * PI * Math.pow(raio, 3);
                System.out.println("O volume da esfera é: " + volume);
                break;

            default:
                System.out.println("Erro: Código da operação inválido.");
                break;
        }

        scanner.close();
    }
}

package E06;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        Random random = new Random();
        int numeroSorteado = random.nextInt(maior - menor + 1) + menor;

        System.out.println("Número sorteado: " + numeroSorteado);
        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }

        scanner.close();
    }
}

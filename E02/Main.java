package E02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra (R$): ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago (R$): ");
        double valorPago = scanner.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("Quantia paga insuficiente para realizar a compra.");
        } else {
            double troco = valorPago - valorCompra;
            System.out.println("Troco: R$ " + troco);

            int[] notas = {50, 20, 10, 5, 2, 1};
            int[] quantidadeNotas = new int[notas.length];

            for (int i = 0; i < notas.length; i++) {
                quantidadeNotas[i] = (int) (troco / notas[i]);
                troco = troco % notas[i];
            }

            for (int i = 0; i < notas.length; i++) {
                System.out.println("Notas de R$ " + notas[i] + ": " + quantidadeNotas[i]);
            }
        }

        scanner.close();
    }
}

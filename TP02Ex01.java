//Gabriel Afonso dos Santos - CB3026167

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int primeiroValor = scanner.nextInt();

        int segundoValor = 0;
        boolean isValido = false;

        while (!isValido) {
            System.out.print("Insira o segundo valor (deve ser maior que o primeiro): ");
            segundoValor = scanner.nextInt();

            if (segundoValor > primeiroValor) {
                isValido = true;
            } else {
                System.out.println("Erro: O segundo valor deve ser maior que o primeiro. Tente novamente.");
            }
        }

        System.out.println("Valores inseridos com sucesso.");
        System.out.println("Primeiro valor: " + primeiroValor);
        System.out.println("Segundo valor: " + segundoValor);

        scanner.close();
    }
}

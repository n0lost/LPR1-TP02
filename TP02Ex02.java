//Gabriel Afonso dos Santos - CB3026167

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[10];
        int soma = 0;
        int maiorValor = Integer.MIN_VALUE;

        System.out.println("Digite dez valores positivos:");

        for (int i = 0; i < 10; i++) {
            boolean valorValido = false;

            while (!valorValido) {
                System.out.print("Valor " + (i + 1) + ": ");
                int valor = scanner.nextInt();

                if (valor > 0) {
                    valores[i] = valor;
                    soma += valor;
                    if (valor > maiorValor) {
                        maiorValor = valor;
                    }
                    valorValido = true;
                } else {
                    System.out.println("Erro: O valor deve ser positivo. Tente novamente.");
                }
            }
        }

        double media = (double) soma / 10;

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Media aritmetica: " + media);

        scanner.close();
    }
}

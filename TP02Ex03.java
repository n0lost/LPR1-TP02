//Gabriel Afonso dos Santos - CB3026167

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            int n = 0;
            boolean nValido = false;

            while (!nValido) {
                System.out.print("Informe a quantidade de valores (maior que 0 e menor que 20): ");
                n = scanner.nextInt();
                if (n > 0 && n < 20) {
                    nValido = true;
                } else {
                    System.out.println("Erro: O numero deve ser positivo e menor que 20.");
                }
            }

            int[] valores = new int[n];
            int soma = 0;
            int maiorValor = Integer.MIN_VALUE;
            int menorValor = Integer.MAX_VALUE;
            int positivos = 0;
            int negativos = 0;

            System.out.println("Digite " + n + " valores:");

            for (int i = 0; i < n; i++) {
                System.out.print("Valor " + (i + 1) + ": ");
                int valor = scanner.nextInt();

                valores[i] = valor;
                soma += valor;

                if (valor > maiorValor) {
                    maiorValor = valor;
                }

                if (valor < menorValor) {
                    menorValor = valor;
                }

                if (valor > 0) {
                    positivos++;
                } else if (valor < 0) {
                    negativos++;
                }
            }

            double media = (double) soma / n;
            double percentPositivos = (double) positivos / n * 100;
            double percentNegativos = (double) negativos / n * 100;

            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Menor valor: " + menorValor);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Media aritmetica: " + media);
            System.out.println("Porcentagem de valores positivos: " + percentPositivos + "%");
            System.out.println("Porcentagem de valores negativos: " + percentNegativos + "%");

            boolean respostaValida = false;

            while (!respostaValida) {
                System.out.print("Deseja executar novamente? (S/N): ");
                String resposta = scanner.next();

                if (resposta.equalsIgnoreCase("S")) {
                    respostaValida = true;
                    continuar = true;
                } else if (resposta.equalsIgnoreCase("N")) {
                    respostaValida = true;
                    continuar = false;
                } else {
                    System.out.println("Erro: Resposta invalida. Digite 'S' para sim ou 'N' para nao.");
                }
            }
        }

        scanner.close();
    }
}

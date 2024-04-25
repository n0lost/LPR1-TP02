//Gabriel Afonso dos Santos - CB3026167

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int m = 0;
        int n = 0;

        // Solicitar valores para M e N, garantindo que sejam entre 1 e 10
        boolean validOrder = false;
        while (!validOrder) {
            System.out.print("Informe o número de linhas (M) para a matriz (máximo 10): ");
            m = scanner.nextInt();
            System.out.print("Informe o número de colunas (N) para a matriz (máximo 10): ");
            n = scanner.nextInt();

            if (m > 0 && m <= 10 && n > 0 && n <= 10) {
                validOrder = true;
            } else {
                System.out.println("Erro: M e N devem estar entre 1 e 10.");
            }
        }

        int[][] matriz = new int[m][n];

        System.out.println("Digite os elementos da matriz " + m + "x" + n + ":");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcular a matriz transposta
        int[][] transposta = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }

        // Exibir a matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Exibir a matriz transposta
        System.out.println("Matriz transposta:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

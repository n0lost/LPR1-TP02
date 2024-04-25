//Gabriel Afonso dos Santos - CB3026167

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][4];

        System.out.println("Digite doze valores para preencher uma matriz 3x4:");

        // Preencher a matriz 3x4 com valores do usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Solicitar a constante multiplicativa
        System.out.print("Digite uma constante multiplicativa: ");
        int constante = scanner.nextInt();

        // Multiplicar cada valor na matriz pela constante
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= constante;
            }
        }

        // Exibir a matriz após a multiplicação
        System.out.println("Matriz 3x4 após multiplicação pela constante " + constante + ":");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

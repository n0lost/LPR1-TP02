//Gabriel Afonso dos Santos - CB3026167

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matrizOriginal = new int[3][4];

        System.out.println("Digite doze valores para preencher uma matriz 3x4:");

        // Preencher a matriz 3x4 com valores do usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite uma constante multiplicativa: ");
        int constante = scanner.nextInt();

        int[][] matrizMultiplicada = new int[3][4];

        // Multiplicar cada valor da matriz original pela constante e armazenar na nova matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrizMultiplicada[i][j] = matrizOriginal[i][j] * constante;
            }
        }

        System.out.println("Matriz original 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizOriginal[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz multiplicada 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizMultiplicada[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

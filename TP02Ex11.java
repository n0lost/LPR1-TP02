//Gabriel Afonso dos Santos - CB3026167 

import org.apache.commons.math3.linear.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = 0;
        boolean validSize = false;
        
        while (!validSize) {
            System.out.print("Informe a ordem da matriz (máximo 10): ");
            m = scanner.nextInt();
            if (m > 0 && m <= 10) {
                validSize = true;
            } else {
                System.out.println("Erro: a ordem deve ser entre 1 e 10.");
            }
        }

        double[][] matriz = new double[m][m];

        System.out.println("Digite os elementos da matriz " + m + "x" + m + ":");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        RealMatrix matrix = new Array2DRowRealMatrix(matriz);
        double determinante = new LUDecomposition(matrix).getDeterminant();

        System.out.println("Matriz original:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Determinante da matriz: " + determinante);

        scanner.close();
    }
}

//Gabriel Afonso dos Santos - CB3026167

package exercicios;
import java.util.Scanner;

public class TP02Ex04 {

    public static void ex04() {

        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[2][3];
    
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o valor da posição [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextDouble();
            }
        }
    
        System.out.println("Os valores da matriz sao:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}

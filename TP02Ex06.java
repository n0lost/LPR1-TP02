//Gabriel Afonso dos Santos - CB3026167

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] matriz = new String[2][3];

        System.out.println("Digite seis nomes para preencher uma matriz 2x3:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Nome [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextLine();
            }
        }

        System.out.println("Nomes armazenados na matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

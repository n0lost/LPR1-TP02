//Gabriel Afonso dos Santos - CB3026167

package exercicios;
import java.util.Scanner;

public class TP02Ex01 {


    public static void ex01() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro valor:");
        double valor1 = scanner.nextDouble();

        double valor2;
        do {
            System.out.println("Segundo valor (deve ser maior que o primeiro):");
            valor2 = scanner.nextDouble();
        } while (valor2 <= valor1);
    }
    
}

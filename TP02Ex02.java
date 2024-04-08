//Gabriel Afonso dos Santos - CB3026167

package exercicios;
import java.util.Scanner;

public class TP02Ex02 {

    public static void ex02() {
      

        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[10];
        double soma = 0;
        double maior = Double.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            do {
                System.out.println("Digite o valor " + (i + 1) + " (deve ser positivo):");
                valores[i] = scanner.nextDouble();
            } while (valores[i] < 0);

            soma += valores[i];
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }

        double media = soma / 10;

        System.out.println("O maior valor: " + maior);
        System.out.println("A soma dos valores: " + soma);
        System.out.println("A media aritmetica dos valores: " + media);
    }
    
}

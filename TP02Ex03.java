//Gabriel Afonso dos Santos - CB3026167

package exercicios;
import java.util.Scanner;

public class TP02Ex03 {

    public static void ex03() {
   
        Scanner scanner = new Scanner(System.in);

        int N;
        do {
            System.out.println("Digite a quantidade de numeros (deve ser positivo e menor que 20):");
            N = scanner.nextInt();
        } while (N <= 0 || N >= 20);
    
        double[] valores = new double[N];
        double soma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        int countPos = 0;
        int countNeg = 0;
    
        for (int i = 0; i < N; i++) {
            System.out.println("Digite o valor " + (i + 1) + ":");
            valores[i] = scanner.nextDouble();
    
            soma += valores[i];
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
            if (valores[i] > 0) {
                countPos++;
            } else if (valores[i] < 0) {
                countNeg++;
            }
        }
    
        double media = soma / N;
        double percPos = (double) countPos / N * 100;
        double percNeg = (double) countNeg / N * 100;
    
        System.out.println("O maior valor e: " + maior);
        System.out.println("O menor valor e: " + menor);
        System.out.println("A soma dos valores e: " + soma);
        System.out.println("A media aritmetica dos valores e: " + media);
        System.out.println("A porcentagem de valores que são positivos e: " + percPos + "%");
        System.out.println("A porcentagem de valores que são negativos e: " + percNeg + "%");
    }
    
}

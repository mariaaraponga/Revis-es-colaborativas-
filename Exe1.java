import java.util.Scanner;

public class Exe1 {
    public static void main (String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor de a: ");
            double a = scanner.nextDouble();

            System.out.print("Digite o valor de b: ");
            double b = scanner.nextDouble();

            
            System.out.print("Digite o valor de c: ");
            double c = scanner.nextDouble();

            Double bhaskara = (a * a) + b + c;

             System.out.print("O valor da equação é: " + bhaskara);
        }
    }
}

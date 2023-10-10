import java.util.Scanner;

public class At8 {
  public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite a largura do retângulo : ");
        double largura = scanner.nextDouble();

        double area = altura * largura;

        System.out.println("A área do retângulo é: " + area);
        scanner.close();
    }
}
  

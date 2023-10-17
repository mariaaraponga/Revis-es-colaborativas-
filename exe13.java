import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o comprimento da aresta do cubo (em cm): ");

         double aresta = scanner.nextDouble();


        double volume = Math.pow(aresta, 3);

        System.out.print("O volume do cubo é " + volume + "cm³.");

        scanner.close();
    }
}





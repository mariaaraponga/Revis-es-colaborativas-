import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Digite o número total de elétrons: ");
                int totalEletrons = scanner.nextInt();

                distribuirEletrons(totalEletrons);
            }

    }
    public static void distribuirEletrons(int totalEletrons) {
            int n= 1;
            int eletronsRestantes = totalEletrons;

            while (eletronsRestantes > 0) {
                int capacidadeCamada = 2 * n * n;
                int eletronsCamada = Math.min (capacidadeCamada, eletronsRestantes);

                System.out.println("Camada " + n + ": " + eletronsCamada + " elétrons");
                
                eletronsRestantes -= eletronsCamada;
                n++;
            }
        }
}

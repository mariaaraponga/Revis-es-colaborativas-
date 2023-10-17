public class exe10 {
    public static void main(String[] args) {
        //Defina a tensão e a resistência
        double tensao = 24; // em volts
        double resistencia = 8; // em ohms

        //Calcule a potência dissipada
        double potencia = (tensao * tensao) / resistencia;

        //Exiba o resultado
        System.out.println("A potência dissipada é " + potencia + "W.");
    }
}
 

public class exe7 {
    public static void main(String[] args) {
        //Defina a altura e a aceleração devido á gravidade
        double altura = 20; // em metros
        double aceleracaoGravitacional = 9.8; // em m/s²

        //Calcule a velocidade final
        double velocidadeFinal = Math.sqrt(2 * aceleracaoGravitacional * altura);

        //Exiba o resultado
        System.out.println("A velocidade final é " + velocidadeFinal + "m/s.");
    }
}
 

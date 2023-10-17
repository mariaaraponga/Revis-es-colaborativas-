public class exe12 {
    public static void main(String[] args) {
        //Defina a massa do objeto e a aceleração gravitacional do planeta
        double massa = 50; // em quilogramas
        double aceleracaoGravitacionalMarte = 3.7; // em  m/s² (valor para Marte)

        //Calcule o peso do objeto no planeta
        double peso = massa * aceleracaoGravitacionalMarte;

        //Exiba o resultado
        System.out.println("O peso do objeto em Marte é " + peso + "N.");
    }
}


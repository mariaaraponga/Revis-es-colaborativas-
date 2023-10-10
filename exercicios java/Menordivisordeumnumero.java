public class Menordivisordeumnumero {
    public static void main(String[]args){
        int numero = 25; //declara numero
        int menorDivisor = 13; //declara menor divor

        for (int i = 2; i <=numero; i++){ //loop for
            if (numero % i == 0) { //comando if
                menorDivisor = i;
            }
        }
        System.out.println("O menor divisor é:" + menorDivisor);
    }
}


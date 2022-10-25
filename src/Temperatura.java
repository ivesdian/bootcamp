public class Temperatura {

    public static void main(String[] args) {

        float temperatura1, temperatura2, fahrenheit1, fahrenheit2;
        final float FATOR_1, FATOR_2;

        FATOR_1=9/5f;
        FATOR_2=32;

        temperatura1=25;
        temperatura2=30;

        fahrenheit1 = (temperatura1 * FATOR_1) + FATOR_2;
        fahrenheit2 = (temperatura2 * FATOR_1) + FATOR_2;

        System.out.println("A temperatura " + temperatura1 + " graus celsius equivale a " + fahrenheit1 + " graus fahrenheit.");
        System.out.println("A temperatura " + temperatura2 + " graus celsius equivale a " + fahrenheit2 + " graus fahrenheit.");


        



    }
}

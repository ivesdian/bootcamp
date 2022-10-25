import java.util.Arrays;
import java.util.Scanner;

public class soma2 {
    public static boolean isNumber(String item){

        boolean isValid = true;

        for(int i = 0; i < item.length(); i++) {
            if (Character.isDigit(item.charAt(i)) == false) {
                isValid = false;
            }
        }
        return isValid;
    }

    public static void main(String[] args) {

        args[0] = "9";
        if (args.length == 1 ) {
            System.out.printf("Digite outro número!");

        }
        if (args.length == 0)    {
            System.out.printf("Digite os dois números!");
        }

        if (args.length == 2 && isNumber(args[0]) && isNumber(args[1]))   {
            System.out.printf("Entrada válida!");
        }   else {
            System.out.printf("Entrada inválida!");
        }



        int numero1 = Integer.parseInt(args[0]);
        int numero2 = Integer.parseInt(args[1]);
        int soma = numero1 + numero2;
        Scanner numero = new Scanner(System.in);


        if (args.length == 2)   {
           System.out.printf("A soma dos números digitados é %d", soma);
       } else if (args.length == 0) {
            System.out.println("Informe um número" );
            int primeiroNumero = numero.nextInt();
        } else if (args.length == 1) {
            System.out.println("Informe outro número" );
            int segundoNumero = numero.nextInt();
        } else if (args.length > 2) {
            System.out.println("Erro! Quantidade de números excedida.");
        }
        System.out.println(soma);
    }
}

/*
caso 1: 2 argumentos válidos
caso 2: 1 argumento válido e 1 vazio
caso 3: 2 argumentos vazios
caso 4: mais de 2 argumentos
caso 5: argumento diferente de número


 */
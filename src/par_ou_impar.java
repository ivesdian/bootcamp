import java.util.Scanner;

public class par_ou_impar {

    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        System.out.printf( (num1 % 2 == 0) ? "par" : "impar");
    }
}

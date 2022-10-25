import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class operacoes_matematicas {

    public static void main(String[] args) {


        String  soma, subtracao, divisao, multiplicacao;
        soma="somar";
        subtracao="subtrair";
        divisao="dividir";
        multiplicacao="multiplcar";
        System.out.println("Informe o primeiro número: ");
        Scanner scanner = new Scanner(System.in);
        float primeiroNumero = scanner.nextFloat();
        double resultado=0;


        System.out.println("Informe o segundo número");
        float segundoNumero = scanner.nextFloat();

        System.out.println("Informe o que deseja fazer: ");
        String operacao = scanner.nextLine();

        if (divisao.equals(operacao))    {
            resultado = primeiroNumero / segundoNumero;
        }

        if (multiplicacao.equals(operacao))    {
            resultado = primeiroNumero * segundoNumero;
        }

        if (soma.equals(operacao))    {
            resultado = primeiroNumero + segundoNumero;
        }

        if (subtracao.equals(operacao))    {
            resultado = primeiroNumero - segundoNumero;
        }

        System.out.println(resultado);



    }
}

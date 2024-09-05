package GitHub;

import java.util.Scanner;

public class calculadoraSimples {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
//NUMERO 1
        System.out.println("Número 1:");
        double n1 = user.nextDouble();

//OPERADOR
        System.out.println("""
                -OPERAÇÃO-
                Digite\s
                + para soma
                - para subtração
                * para multiplicação
                / para divisão
                % para módulo:""");
        String operador =  user.next();

//NUMERO 2
        System.out.println("Número 2");
        double n2 = user.nextDouble();

        //Operação

        boolean soma = operador.equals("+");
        boolean subtracao = operador.equals("-");
        boolean divisao = operador.equals("/");
        boolean multiplicacao = operador.equals("*");
        boolean modulo = operador.equals("%");

        var r5 = modulo ? n1%n2 : "erro";
        var r4 = multiplicacao ? n1*n2 : r5;
        var r3 = divisao ? n1/n2 : r4;
        var r2 = subtracao ? n1-n2 : r3;
        var r1 = soma ? n1+n2 : r2;

//RESULTADO
        System.out.println("RESULTADO = " + r1);

    }
}

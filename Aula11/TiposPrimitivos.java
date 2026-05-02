package Aula11;

public class TiposPrimitivos {
    public static void main(String[] args) {

        //Tipos inteiros
        int idade01 = 20;
        short idade02 = 21;
        long idade03 = 22;
        byte idade04 = 24;

        System.out.println("Idade01: " + idade01);
        System.out.println("Idade02: " + idade02);
        System.out.println("Idade03: " + idade03);
        System.out.println("Idade04: " + idade04);

//     Ponto Flutuante
        double valorPassagem01 = 4.50;
        float valorPassagem02 = 5.60f;

        System.out.println("Valor Passagem01: " + valorPassagem01);
        System.out.println("Valor Passagem02: " + valorPassagem02);

//        Tipo Char

        // char o = 'o';
        // char i = 'i';

        char o = 111;
        char i = 105;
        char interrogacao = 0x00E1; // valor = '?'

        System.out.println("Tipo char: " + o + i + interrogacao);

    }
}

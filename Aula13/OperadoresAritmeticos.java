package Aula13;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 2;
        System.out.println(resultado);

        resultado = resultado * 2; // Multipicação
        System.out.println(resultado);

        resultado = resultado / 2; // Divisão
        System.out.println(resultado);

        resultado = resultado % 2; // Resto
        System.out.println(resultado);

        String primeiraFrase = " Essa é ";
        String segundaFrase = "uma String concatenada";
        System.out.println(primeiraFrase + segundaFrase);

        resultado++;
        System.out.println(resultado);
        resultado += 1;
        System.out.println(resultado);
        resultado--;
        System.out.println(resultado);
        resultado -= 1;
        System.out.println(resultado);

        System.out.println(resultado++);// Mostra o Resultado depois incrementa
        System.out.println(--resultado);// Decrementa depois mostra o resultado


    }
}

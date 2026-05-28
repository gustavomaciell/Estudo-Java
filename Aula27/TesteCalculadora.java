package Aula27;

public class TesteCalculadora {
    public static void main(String[] args) {

        MinhaCalculadora calculadora = new MinhaCalculadora();


        System.out.println(calculadora.soma(1, 2));
        System.out.println(calculadora.soma(1.5, 2.8));
        System.out.println(calculadora.soma(1,5,9));

    }
}

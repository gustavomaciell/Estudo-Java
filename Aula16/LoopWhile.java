package Aula16;

public class LoopWhile {
    public static void main(String[] args) {

        int i = 0;
        int max = 10;

        System.out.println("Contando até " + max);

        while (i < max) {
            System.out.println("Valor de i: " + i);
            i++;
        }
        System.out.println(i); //valor 10

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 15);
        System.out.println(i);


    }
}

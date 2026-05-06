package Aula15.Lab;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Masculino(M) ou Feminino(F)?");
        char genero = scan.next().toUpperCase().charAt(0);

        switch (genero) {
            case 'M':
                System.out.println("Masculino.");
                break;
            case 'F':
                System.out.println("Feminino.");
                break;
            default:
                System.out.println("Gênero inválido.");
        }
        scan.close();
    }
}

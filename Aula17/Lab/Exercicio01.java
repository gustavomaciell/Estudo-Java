package Aula17.Lab;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean notaValida = false;

        do {
            System.out.println("Digite uma nota de 0 a 10.");
            if (scan.hasNextDouble()) {
                double nota = scan.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Você digitou uma nota inválida, digite novamente.");
                } else {
                    notaValida = true;
                    System.out.println("Você digitou a nota: " + nota);
                }
            } else {
                System.out.println("Digite um número.");
                scan.next();
            }
        } while (!notaValida);

        scan.close();
    }
}

package Aula13.Lab;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor em metros: ");
        double metros = scan.nextDouble();

        System.out.println("Conversão para centímetros: ");
        double conversao = metros * 100;
        System.out.println(metros + "m é igual a " + conversao + "cm.");
    }
}

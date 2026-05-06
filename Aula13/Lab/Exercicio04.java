package Aula13.Lab;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double media = 7;

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scan.nextDouble();

        double mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.print("Sua média foi : " + mediaNota);
        System.out.println();

        if (mediaNota >= media) {

            System.out.println("Aprovado.");
        }
        else {
            System.out.println("Reprovado.");
        }
    }
}

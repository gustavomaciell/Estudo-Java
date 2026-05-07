package Aula15.Lab;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno.");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota do aluno.");
        double nota2 = scan.nextDouble();

        double calculoNota = nota1 + nota2 / 2;

        if(calculoNota == 10){
            System.out.println("Aprovado com distinção.");
        } else if (calculoNota < 7) {
            System.out.println("Reprovado.");
        }else if (calculoNota >= 7) {
            System.out.println("Aprovado.");
        }
        scan.close();
    }
}

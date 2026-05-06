package Aula13.Lab;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = scan.nextInt();
        System.out.print("Você digitou : " + num1);
        scan.nextLine();
        System.out.println(" \nDigite outro número: ");
        num2 = scan.nextInt();
        System.out.println("Você digitou: " + num2);
        int soma = num1 + num2;
        System.out.println("A soma dos números é: " + soma);


    }
}

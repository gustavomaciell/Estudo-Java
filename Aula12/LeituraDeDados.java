package Aula12;

import java.util.Scanner;

public class LeituraDeDados {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome é: " + nomeCompleto);

        System.out.println("Digite seu Primeiro nome: ");
        String primeiroNome = scan.nextLine();
        System.out.println("Seu primero nome é: " + primeiroNome);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);*/

        System.out.println("Digite seu nome, sua idade, altura, e se tem animal de estimação.");
        String nome = scan.nextLine();
        int idade = scan.nextInt();
        double altura = scan.nextDouble();
        boolean temPet= scan.nextBoolean();

        System.out.println("Voce digitou: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura );
        System.out.println("Tem animal de estimação: " + temPet);




    }
}

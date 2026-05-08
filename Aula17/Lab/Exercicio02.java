package Aula17.Lab;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean erro;

        do {
            erro = false;
            System.out.println("Digite um nome de usuário.");
            String login = scan.nextLine();

            System.out.println("Digite uma senha.");
            String senha = scan.nextLine();

            if (login.equals(senha)) {
                erro = true;
                System.out.println("A senha não pode ser igual ao nome de usuário");
            } else {
                System.out.println("Login realizado com sucesso!");
            }
        } while (erro);

        scan.close();
    }
}

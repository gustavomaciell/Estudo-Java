package Aula15.Lab;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = scan.nextInt();

        if (num > 0){
            System.out.println("O número " + num + " é positivo.");
        }else {
            System.out.println("O número " + num + " é negativo.");
        }
        scan.close();
    }
}

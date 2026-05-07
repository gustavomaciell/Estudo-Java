package Aula15.Lab;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 números.");
        int num1 = scan.nextInt();
        System.out.printf("Numero 1: %d\n", num1);
        int num2 = scan.nextInt();
        System.out.printf("Numero 2: %d\n", num2);
        int num3 = scan.nextInt();
        System.out.printf("Numero 3: %d\n", num3);

        //Forma mais curta:
        int maiorNum = Math.max(num1, Math.max(num2, num3));

        //int maiorNum= num1;

//        if (num2 > maiorNum) {
//            maiorNum = num2;
//        }
//        if (num3 > maiorNum) {
//            maiorNum = num3;
//        }

        System.out.println("O maior número é: " + maiorNum + ".");

        scan.close();
    }
}

package Aula15.Lab;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra:");
        String input = scan.next();
        char letra = input.toLowerCase().charAt(0);

        if (input.length() > 1){
            System.out.println("Erro: " + input + " é uma palavra e não uma letra.");
        }else if (!(letra >= 'a' && letra <= 'z')){
            System.out.println("Digite uma letra.");
        }else if (letra =='a' ||
                letra == 'e' ||
                letra == 'i' ||
                letra == 'o' ||
                letra == 'u'){
            System.out.println(letra + " é uma vogal.");
        }else {
            System.out.println(letra + " é uma consoante.");
        }




        scan.close();
    }
}

package Aula19.Lab;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = vetorA;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite os valores do vetor A na posição " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();


        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("\nVetorA[" + (i + 1) + "]: " + vetorA[i] + " || VetorB[" + (i + 1) + "]: " + vetorB[i]);
        }


        scan.close();
    }
}

package Aula20.Lab;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o número da linha " + i + " e coluna " + j + ":");
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println("=====MATRIZ=====");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.printf("%3d\t", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("================");

        int qtdPar = 0;
        int qtdImpar = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    qtdPar++;
                }
                if (matriz[i][j] % 2 != 0){
                    qtdImpar++;
                }
            }
        }
        System.out.println("A quantidade de números pares é: " + qtdPar);
        System.out.println("A quantidade de números impares é: " + qtdImpar);
        scan.close();
    }
}

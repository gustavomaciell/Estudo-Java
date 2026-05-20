package Aula20.Lab;

import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] matriz = new int[4][4];

        int maiorNum = 0;
        int linhaMaior = 1;
        int colunaMaior = 1;

        System.out.println("-----MATRIZ-----");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);

                System.out.printf("%3d", matriz[i][j]);

                if (matriz[i][j] >= maiorNum) {
                    maiorNum = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
            System.out.println();
        }
        System.out.println("--------------");
        System.out.println("O maior valor é: " + maiorNum);

        int contagem = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == maiorNum) {
                    contagem++;
                    System.out.printf("%dª Ocorrência, linha: %d  ||  Coluna: %d. \n", contagem, (i + 1), (j + 1));
                }

            }
        }
    }
}
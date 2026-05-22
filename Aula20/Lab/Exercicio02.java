package Aula20.Lab;

import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] matriz = new int[10][10];

        System.out.println("===============MATRIZ===============");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.println();
        }
        int maiorLinha = matriz[5][0];
        int menorLinha = matriz[5][0];
        int maiorColuna = matriz[0][7];
        int menorColuna = matriz[0][7];

        for ( int j = 0; j < matriz[5].length;j++){
            if (matriz[5][j] > maiorLinha){
                maiorLinha = matriz[5][j];
            }
            if (matriz[5][j] < menorLinha){
                menorLinha = matriz[5][j];
            }
        }
        for (int i = 0; i < matriz.length; i++){
            if (matriz[i][7] > maiorColuna){
                maiorColuna = matriz[i][7];
            }
            if (matriz[i][7] < menorColuna){
                menorColuna = matriz[i][7];
            }
        }
        System.out.println("Linha 5");
        System.out.println("Maior número: " + maiorLinha);
        System.out.println("Menor número: " + menorLinha);

        System.out.println("Coluna 7");
        System.out.println("Maior número: " + maiorColuna);
        System.out.println("Menor número: " + menorColuna);

    }
}



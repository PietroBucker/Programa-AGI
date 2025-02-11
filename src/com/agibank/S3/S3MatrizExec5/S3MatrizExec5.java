package com.agibank.S3.S3MatrizExec5;

import java.util.Arrays;

public class S3MatrizExec5 {
    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 2},
                {4, 5},
                {7, 8},
                {10, 11}
        };
        int[][] matriz2 = {
                {7, 10, 13, 16},
                {8, 11, 14, 17},
                {9, 12, 15, 18}
        };
//        int[][] matriz1 = {
//                {1, 2, 3},
//                {4, 5, 6},
//        };
//        int[][] matriz2 = {
//                {7, 10},
//                {8, 11},
//                {9, 12}
//        };
        int nCol = matriz2[0].length;
        int nLin = matriz1.length;
        int count = 0;
        int x = 0, y = 0;
        //fazer for para prencher a novamatriz com 0 de acordo com tamnho das matrizes anteriores
        int[][] novaMatriz = new int[matriz1.length][matriz2[0].length];

        for(int i=0; i<novaMatriz.length; i++){
            for(int j=0; j< novaMatriz[0].length; j++){
                novaMatriz[i][j] = 0;
            }
        }

        if (nLin == nCol) {
            while (count < (matriz1.length * matriz2[0].length)) {
//                System.out.println("cont" + count);

                for (int i = 0; i < matriz1[0].length; i++) {
//                    System.out.println(matriz1[x][i] + "x" + matriz2[i][y]);
                    novaMatriz[x][y] += (matriz1[x][i] * matriz2[i][y]);
//                    System.out.println("y" + y);
//                    System.out.println("x" + x);
                }

                if (y < matriz1.length-1) {
                    y += 1;
                } else if (x< matriz2[0].length-1) {
                    x += 1;
                    y = 0;
                }
                count += 1;
            }
        }
        for(int i = 0; i< novaMatriz.length; i++){
            for(int j = 0; j< novaMatriz[0].length; j++){
                System.out.print(novaMatriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}


package com.agibank.S3.S3MatrizExec2;

import java.util.Arrays;

public class S3MatrizExec2 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,1,1,1},
                {1,2,1,1},
                {1,3,1,1},
                {1,4,1,1}
        };
        int accTotal = 0;
        int[] accLin = new int[4];
        int[] accCol =  new int[4];
        for(int i=0; i<4;i++){
            for(int j=0; j<4; j++){
                accTotal += matriz[i][j];
                accLin[i] += matriz[i][j];
                accCol[j] += matriz[i][j];
            }
        }
        System.out.println("Soma Total: " + accTotal);
        System.out.println("Soma Linhas: " + Arrays.toString(accLin));
        System.out.println("Soma Colunas: " + Arrays.toString(accCol));
    }
}

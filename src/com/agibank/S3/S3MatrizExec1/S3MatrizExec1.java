package com.agibank.S3.S3MatrizExec1;

public class S3MatrizExec1 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

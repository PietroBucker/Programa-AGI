package com.agibank.S3.S3MatrizExec4;

public class S3MatrizExec4 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
        };

        for(int i = 0; i<3; i++){
            for(int j = 0; j<2; j++){
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }

    }
}

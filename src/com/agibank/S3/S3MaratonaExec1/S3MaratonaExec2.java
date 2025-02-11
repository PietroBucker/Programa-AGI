package com.agibank.S3.S3MaratonaExec1;

public class S3MaratonaExec2 {
    public static void main(String[] args) {
        int idade = 30;
        double p = 1000.0;
        int r = 6/12;
        int idadeAposentaroria = 65;
        int n = idadeAposentaroria - idade;
        double[][] matrizJuros = new double[4][n];
        int linhas = matrizJuros.length;
        int colunas = matrizJuros[0].length;
        int tx = 4;

        for (int i = 0; i <linhas ; i++) {
            matrizJuros[i][0] = tx;
            tx+=2;
        }


        for (int i = 0; i < linhas; i++) {
            for (int j = 1; j < colunas; j++) {
                double taxa = matrizJuros[i][0] / 100.0; // Taxa
                int meses = j * 12; // Número de meses

                matrizJuros[i][j] = p * (Math.pow(1 + taxa, (meses + 1)) - 1) / taxa;
                //erro de logica na conta -10
            }
        }
        System.out.println("Saldo final estimado:");
        for (int i = 0; i < linhas; i++) {
            System.out.printf("- Com taxa de %.0f%%: R$ %,.2f%n",
                    matrizJuros[i][0],
                    matrizJuros[i][colunas-1]);
        }


    }
}

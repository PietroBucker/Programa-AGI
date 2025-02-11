package com.agibank.S3.S3MaratonaExec1;

import java.util.Arrays;
//Devs Pietro Bucker, Heitor Santos, Ithalo Farias, Leonardo Borges, Essi Martins
//tester: Rodrigo Secco Dias Nogueira, geovanna beatriz, mateus santhis, lilian silva, leandro sena.
//Nota = 100 - 40 = 60


public class S3MaratonaExec1 {
    public static void main(String[] args) {
        double contribuicaoMensal = 1000;
        double taxaJ = 0.005;
        int tempoContribuicao = 35;

        double accFinal = 0;
        double[] accAnual = new double[tempoContribuicao];
        int meses = 12;
        //o resultado sera armazenada em um vetor, onde cada posicao representa
        //o valor acumulado de cada ano
        for (int i = 0; i < tempoContribuicao; i++) {
            double anual = contribuicaoMensal * ((Math.pow(1.005, meses) - 1) / 0.005);
            meses += 12;
            accAnual[i] = anual;

        }


        System.out.println("total" + accFinal);
        System.out.println("matriz" + Arrays.toString(accAnual));
        //Saida como Matriz, mas o exercício pede um vetor (-5) DESCONSIDERADO
        //Saida desorganizada (-5)
    }}
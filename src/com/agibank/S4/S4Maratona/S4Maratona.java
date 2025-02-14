package com.agibank.S4.S4Maratona;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
/*
Dev Pietro Bucker Franchini
Tester Dalleth Martins
nota 100   / 100 ;
 */
public class S4Maratona {
    public static void main(String[] args) {
        // media ou media movel?
        // maior valorizacao pelo valor ou pela media
        //considerar como se eu tivesse investido no primeiro e tirado no ultimo?
        double[][] ativos = {
                {22.5, 23, 22, 24.5, 25},
                {85, 86.5, 84, 83.5, 87},
                {30, 29.5, 30.5, 31, 32.5}
        };
        String[] ordemAtivos = {"PETR4", "VALE3", "ITUB4"};
        /*
        Legenda
        ativos[0] = PETR4
        ativos[1] = VALE3
        ativos[2] = ITUB4
         */

        // 20 pontos do try
        try{

            System.out.println("PETR4 -> " + mediaDePrecos(ativos[0]));
            System.out.println(maiorValorizacao(ativos, ordemAtivos));

            double[] lucroEperda = simulaLucroOuPerda(ativos);
            for (int i = 0; i < ativos.length ; i++) {
                String lEpString = lucroEperda[i] >= 0 ? "Lucro" : "Perda";
                System.out.println(ordemAtivos[i] + " " + lEpString + " - " + lucroEperda[i]);
            }

            System.out.println("Preco do ativo VALE3 no dia 3 -> " + consultaPreco(ativos, 2, 3));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    //20 pontos
    public static double mediaDePrecos(double @NotNull [] ativo){
        double acumulador = 0;
        for (double v : ativo) {
            acumulador += v;
        }
        acumulador = acumulador/ativo.length;
        return acumulador;
    }

    //20 pontos
    public static @NotNull StringBuilder maiorValorizacao(double @NotNull [][] ativos, String[] ordemAtivos){
        validacaoAtivo(ativos);
        double[] valorizacoes = new double[ativos.length];
        double maiorValoricacao = 0;
        int indexMaiorValorizcao = 0;
        //chama a funcao simulaLucroOuPerda para dar o valor de crecimento ou de caimento
        valorizacoes = simulaLucroOuPerda(ativos);
        for (int i = 0; i < valorizacoes.length; i++) {
            if(maiorValoricacao < valorizacoes[i]){
                maiorValoricacao = valorizacoes[i];
                indexMaiorValorizcao = i;
            }
        }


        //monta a saida formtada
        return new StringBuilder()
                .append(ordemAtivos[indexMaiorValorizcao])
                .append(" -> De " + ativos[indexMaiorValorizcao][0])
                .append(" Para " + ativos[indexMaiorValorizcao][ativos.length - 1])
                .append(String.format(", Crescimento de %.2f", maiorValoricacao));
    }

    //20 pontos
    public static double[] simulaLucroOuPerda(double @NotNull [][] ativos){
        //Preço Atual - Preço Inicial) / Preço Inicial * 100.
        validacaoAtivo(ativos);
        double[] valorizacoes = new double[ativos.length];
        for (int i = 0; i < ativos.length; i++) {
            double precoInicial = ativos[i][0];
            double precoAtual = ativos[i][ativos[0].length - 1];
            valorizacoes[i] = (precoAtual - precoInicial) / precoInicial * 100;
        }
        return valorizacoes;
    }
    //20 pontos
    public static double consultaPreco(double[][] ativos, int indAtv, int indDia){
        validacaoAtivo(ativos);
        double searchVal = 0;
        for (int i = 0; i < ativos.length; i++) {
            for (int j = 0; j < ativos[0].length; j++) {
                if (i == indAtv - 1 && j == indDia - 1){
                    searchVal = ativos[i][j];
                }
            }
        }
        return searchVal;
    }

    public static void validacaoAtivo(double @NotNull [][] ativos){
        if(ativos.length < 1) {
            throw new Error("Dados Invalidos");
        }
        for (int i = 0; i < ativos.length; i++) {
            for (int j = 0; j < ativos[i].length; j++) {
                if(ativos[i].length == 0){
                    throw new Error("Dados Invalidos");
                }
            }
        }

    }
}

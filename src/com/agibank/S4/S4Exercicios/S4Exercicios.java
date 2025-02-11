package com.agibank.S4.S4Exercicios;

import org.jetbrains.annotations.NotNull;

public class S4Exercicios {
    public static void main(String[] args) {
//        exercicio1(100);
//        exercicio2(1000, 0.05, 3);
//        exercicio3(105,100);
//        double[] valores = {100.0, 102.0, 101.0, 103.0, 105.0};
//        exercicio4(valores, 3);
//        zexercicio5(5,4);
//        double[] valores2 = {0.01, 0.02, -0.01, 0.03, -0.02};
//        exercicio6(valores2);
//        double[] ativos = {1000, 2000, 1500};
//        double[] retMedio = {0.05, 0.03, 0.04};
//        exercicio7(ativos, retMedio);
        double[] serie1 = {100, 102, 104,106};
        double[] serie2 = {50, 51, 52, 53};
        exercicio9(serie1, serie2);


    }

    public static void exercicio1(double valor){
        double result = valor / 4.90;
        System.out.printf("%.2f reais equivalem a %.2f dolares.\n", valor, result);
    }

    public static void exercicio2(double capitalIni, double taxa, double tempo){
        //juros simples
        double juros = capitalIni * taxa * tempo;
        double montante = capitalIni + juros;
        System.out.printf("Montante Final %.2f\n", montante);
    }

    public static void exercicio3(double dia1, double dia2){
        //veriacao entre 2 dias
        double resutl = ((dia2 - dia1)/dia1) * 100;
        System.out.printf("Variacao de %.2f\n", resutl);
    }

    public static void exercicio4(double @NotNull [] valores, int intervalos){
        //media movel
        StringBuilder saida = new StringBuilder("Média móvel: ");
        for (int i = 0; i < valores.length - intervalos + 1; i++) {
            double result = 0;
            boolean isEnd = false;
            for (int j=i; j<intervalos+i;j++){
                result += valores[j]/intervalos;
            }
            saida.append(Double.toString(result)).append(" ");
        }
        System.out.println(saida);
    }

    public static void exercicio5(double ativo1, double ativo2){
        String saida = ativo1 > ativo2
                ? "Ativo com maior retorno é: Ativo1"
                :"Ativo com maior retorno é: Ativo2";
        System.out.println(saida);
    }

    public static double exercicio6(double @NotNull [] valores) {
        double media = 0;
        double desvio = 0;
        double result = 0;
        for (double val : valores) {
            media += val;
        }
        media = media / valores.length;

        for (double val : valores) {
            desvio += Math.pow((val - media), 2);
        }

        result = Math.sqrt((desvio / valores.length));
//        System.out.printf("%.4f\n",result);
        return result;
    }

    public static void exercicio7(double @NotNull [] ativo, double[] retornoMedio){
        double sum = 0;
        double result = 0;
        for (int i = 0; i < ativo.length; i++) {
            sum += ativo[i];
            result += ativo[i]* retornoMedio[i];
        }
        System.out.println(result + sum);
    }

    public static void exercicio8(){

    }
    public static void exercicio9(double[] serie1, double[] serie2) {
        double mediaX = 0;
        double mediaY = 0;
        double desvioX = exercicio6(serie1);
        double desvioY = exercicio6(serie2);
        System.out.println(desvioX);
        System.out.println(desvioY);
        double difMedia = 0;
        System.out.println(difMedia);
        double result = 0;

        for (int i = 0; i < serie1.length; i++) {
            mediaX += serie1[i];
            mediaY += serie2[i];
        }
        mediaX = mediaX/serie1.length;
        mediaY = mediaY/serie2.length;

        for (int i = 0; i < serie1.length ; i++) {
            difMedia += (serie1[i] - mediaX) * (serie2[i] - mediaY);
        }
        difMedia = difMedia / serie1.length;
        result = difMedia/(desvioX*desvioY);

        System.out.println(result);
    }
}

package com.agibank.S4.S4Exercicios;

import org.jetbrains.annotations.NotNull;

public class S4Exercicios {
    public static void main(String[] args) {
//        exercicio1(100);
//        exercicio2(1000, 0.05, 3);
//        exercicio3(105,100);
//        double[] valores = {100.0, 102.0, 101.0, 103.0, 105.0};
//        exercicio4(valores, 3);
//        /zexercicio5(5,4);
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
        for (int i = 2; i < valores.length; i++) {
            double result = (valores[i-2] + valores[i - 1] + valores[i])/intervalos;
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


}

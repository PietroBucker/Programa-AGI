package com.agibank.S4.S4ExecExceptions;

import java.util.Arrays;
import java.util.Scanner;

public class S4ExecExceptions {
    public static void main(String[] args) {
//        exercicio1();
        exercicio8();
    }

    public static void exercicio1(){
        double[] valores = {100,102,101,103,105};
        double[] saida = new double[valores.length-1];
        for (int i = 1; i < valores.length; i++) {
            saida[i-1] = ((valores[i] - valores[i - 1]) / valores[i - 1]) * 100;
        }
        System.out.println(Arrays.toString(saida));
    }

    public static void exercicico2(){

    }

    public static void exercicio8(){
        int numParcelas = 5;
        double jurosMes = 0.05;
        double valorEmprestimo = 1000;
        double parcFixa;
        parcFixa = (valorEmprestimo*jurosMes)/(1-(Math.pow(1+jurosMes,-numParcelas)));
        double valorJuros;
        double amortizacao;
        for (int i = 1; i <= numParcelas ; i++) {
            valorJuros = valorEmprestimo*jurosMes;
            amortizacao = parcFixa - valorJuros ;
            System.out.printf("%d - %.2f - %.2f - %.2f - ", i, valorEmprestimo, valorJuros, amortizacao);
            valorEmprestimo = valorEmprestimo - amortizacao;
            System.out.printf("%.2f \n" ,valorEmprestimo);
        }
        System.out.println("--------------------------");
    }
}

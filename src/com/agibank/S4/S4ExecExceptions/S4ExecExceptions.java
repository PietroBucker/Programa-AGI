package com.agibank.S4.S4ExecExceptions;

import java.util.Arrays;
import java.util.Scanner;

public class S4ExecExceptions {
    public static void main(String[] args) {
        exercicio1();
        exercicio3();
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

    public static void exercicio3(){}
}

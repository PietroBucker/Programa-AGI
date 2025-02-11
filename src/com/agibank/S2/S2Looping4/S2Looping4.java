package com.agibank.S2.S2Looping4;

import java.util.Scanner;

public class S2Looping4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero");
        int valor = sc.nextInt();
        int penultimo = 1;
        int ultimo = 0;
        int aux = 0;
        //0,1,1,2,3,5
        while (ultimo < valor){
            aux = ultimo;
            System.out.println(ultimo);
            ultimo = penultimo + ultimo;
            penultimo = aux;
        }
        sc.close();
    }
}
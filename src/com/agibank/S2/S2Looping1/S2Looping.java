package com.agibank.S2.S2Looping1;

import java.util.Scanner;

public class S2Looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x,y,acc;
        System.out.println("digite X: ");
        x = sc.nextFloat();
        System.out.println("digite Y: ");
        y = sc.nextFloat();
        int parteInteiraY = (int)y;
        float parteDecY = y - parteInteiraY;
        acc = 1; //inicialização do acumulador 8
//        looping para calculo de potencia.
        for(int i=0; i<Math.abs(parteInteiraY); i++){
            acc *= x;
        }
        if(y < 0){
            System.out.printf("%.2f elevado a %d é igual a: 1/%.2f",x,(int)y,acc);
        } else if (parteDecY > 0) {
            float raiz = x;

            for (int i = 0; i < 10; i++) { // 10 iterações de aproximação
                raiz = parteDecY * (raiz + x / raiz);
            }
            acc *= raiz;
            System.out.printf("%.2f elevado a %.2f é igual a: %.2f",x,y,acc);
        } else{
            System.out.printf("%.2f elevado a %d é igual a: %.2f",x,(int)y,acc);
        }
        sc.close();
    }

}

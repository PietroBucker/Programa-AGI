package com.agibank.S3.S3Exercicio1;

import java.util.ArrayList;

public class S3Exercicio1 {
    public static void main(String[] args) {

        int[] precosDiarios = {1,2,3,4,5,1,3,4,5,6};
        int first=1, last=0, count=1;

        for (int i = 1; i<10; i++){
            if(precosDiarios[i-1] < precosDiarios[i]){
                last = i + 1;
                count +=1;
            }
            else {
                if(count >=3){
                    break;
                }
                first = i + 1;
                count=0;
            }
        }
        System.out.println(first + "-" + last);
    }
}

package com.agibank.S2.S2SwitchCase1;

import java.util.Scanner;

public class S2SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Selecione uma opção.
                CDB - 1
                CDI - 2
                FII - 3
                Tesouro Direto - 4
                """);

        int opt = sc.nextInt();

        switch (opt){
            case 1:
                System.out.println("voce escolheu CDB");
                break;
            case 2:
                System.out.println("voce escolheu CDI");
                break;
            case 3:
                System.out.println("voce escolheu FII");
                break;
            case 4:
                System.out.println("voce escolheu Tesouro Direto");
                break;
            default:
                System.out.println("Opçao invalida");
        }
        sc.close();
    }

}

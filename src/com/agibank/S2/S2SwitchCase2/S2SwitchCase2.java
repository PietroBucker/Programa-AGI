package com.agibank.S2.S2SwitchCase2;

import java.util.Scanner;

public class S2SwitchCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De 1 a 5 o quanto voce esta satifeito sendo 1 pouco satisfeito e 5 muito satisfeito.");

        int opt = sc.nextInt();

        switch (opt){
            case 1:
                System.out.println("'MUITO RUIM' voce atribuiu nota: " + opt);
                break;
            case 2:
                System.out.println("'RUIM' voce atribuiu nota: " + opt);
                break;
            case 3:
                System.out.println("'RASOAVEL' voce atribuiu nota: " + opt);
                break;
            case 4:
                System.out.println("'BOM' voce atribuiu nota: " + opt);
                break;
            case 5:
                System.out.println("'MUITO BOM' voce atribuiu nota: " + opt);
                break;
            default:
                System.out.println("Opçao invalida");
        }
        sc.close();
    }
}

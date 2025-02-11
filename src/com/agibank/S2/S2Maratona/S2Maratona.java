package com.agibank.S2.S2Maratona;

import java.util.Scanner;

// dev =  Pietro -> -> nota = 100
// tester = Leonardo Borges
// notas do tester para Pietro 100, não entro nenhum erro

public class S2Maratona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x=1, y=1, radians, v;
        double g = 9.8;
        double t = 0;
        System.out.println("Digite o angulo de arremeço o projetil");
        radians = Math.toRadians(sc.nextDouble());
        System.out.println("Digite o velocida do projetil m/s");
        v = sc.nextDouble();

        //converter a entrade de grau para radiano
        //velocidade em m/s
        System.out.println("Trajetoira");
        System.out.println("--| X |-| Y |--");
        while (y > 0){
            t+=0.01;
            x = (v*Math.cos(radians))*t;
            y = ((v*Math.sin(radians))*t)-((0.5*g)*Math.pow(t,2));
            System.out.printf("-|%.2f|-|%.2f|- \n", x, y);
        }
        sc.close();
    }
}

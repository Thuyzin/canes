package com.senac.canes.canes.jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.;

        int jogoVelha[][] = {
                            {" "," "," "}
                            {" "," "," "}
                            {" "," "," "}
        };

        System.out.println("Digite o nome do player 1");
        var p1 = s.next();
        System.out.println("Digite o nome do player 2");
        var p2 = s.next();

        System.out.println("Player 1 : " + p1 + " |" + " Player 2 : " + p2);

        for (var jogo = 0; jogo < 9; jogo++ ) {
            System.out.println("Player 1 escolha uma posição");


        }
    }
}

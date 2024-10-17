package com.senac.canes.canes.exercises;

import java.util.Scanner;

public class IfElse4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a quantidade de macas que voce comprou.");
        var qtd = s.nextInt();
        var valorTotal = 0.0;

        if(qtd < 12) {
            valorTotal = qtd * 0.3;
        } else {
            valorTotal = qtd * 0.25;
        }

        System.out.println("Voce precisa pagar " + valorTotal);
    }
}

package com.senac.canes.canes.exercises;

import java.util.Scanner;

public class IfElse1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro numero.");
        var n1 = s.nextInt();
        System.out.println("Digite o segundo numero.");
        var n2 = s.nextInt();

        if(n1 > n2) {
            System.out.println(n1 + " Maior numero");
        }else{
            System.out.println(n2 + " Maior numero");
        }
    }

}

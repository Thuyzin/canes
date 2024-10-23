package com.senac.canes.canes.exercises;

import java.util.Scanner;

public class IfElse7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a quatidade de lados");
        int lados = s.nextInt();
        System.out.println("Digite a medida dos lados (em centimetros)");
        int medida = s.nextInt();

        if(lados == 3){
            var c = (medida * medida) /2;
            System.out.println("***** Triangulo *****");
            System.out.println("Area do Triangulo: " + c);

        }else if(lados == 4){
            var c = medida * medida;
            System.out.println("***** Quadrado *****");
            System.out.println("Area do Quadrado: " + c);

        }else if(lados == 5){
            System.out.println("***** Pentagono *****");
        }else{
            System.out.println("Tente novamente");
        }

    }
}

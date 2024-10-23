package com.senac.canes.canes.exercises;

import java.util.Scanner;

public class IfElse10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("********** Informe a medida do primeiro lado **********");
        int m1 = s.nextInt();
        System.out.println("********** Informe a medida do segundo lado **********");
        int m2 = s.nextInt();
        System.out.println("********** Informe a medida do teceiro lado **********");
        int m3 = s.nextInt();

        //Equilatero
        if( m1 == m2 && m2 == m3 && m3 == m1){
            System.out.println("********** TRIANGULO EQUILATERO **********:");
        //ISOSCELE
        }else if(m1 == m2 || m1 == m3 || m2 == m3){
            System.out.println("********** TRIANGULO ISOSCELE **********:");

        //ESCALENO
        }else if(m1 != m2 && m2 != m3 && m3 != m1){
            System.out.println("********** TRIANGULO ESCALENO **********:");

        }else{
            System.out.println("********** TRIANGULO NAO ENCONTRADO **********:");
        }

    }

}

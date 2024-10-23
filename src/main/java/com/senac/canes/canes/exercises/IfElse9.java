package com.senac.canes.canes.exercises;

import java.util.Scanner;

public class IfElse9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("********** Informe o primeiro numero **********");
        int v1 = s.nextInt();
        System.out.println("********** Informe o segundo numero **********");
        int v2 = s.nextInt();
        System.out.println("********** Informe o terceiro numero **********");
        int v3 = s.nextInt();

        if(v1 == v2 || v2 == v3 || v3 == v1){
            System.out.println("********** Nao e permitido usar numeros iguais **********");
        }else{
            if(v1 > v2 && v1 > v3){
                System.out.println("********** o primeiro numero e o maior " + v1 + " **********" );
            } else if (v2 > v3) {
                System.out.println("********** o segundo numero e o maior " + v2 + " **********");
            }else{
                System.out.println("********** o terceiro numero e o maior " + v3 + " **********");
            }
        }

    }

}

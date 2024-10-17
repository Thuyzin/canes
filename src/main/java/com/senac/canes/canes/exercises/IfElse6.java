package com.senac.canes.canes.exercises;

import java.util.Scanner;

public class IfElse6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua altura em centimetros");
        int altura = s.nextInt();
        System.out.println("Digite seu sexo: 1 para homem | 2 para mulher");
        var sexo = s.nextInt();


        if(sexo != 1 && sexo != 2){
            System.out.println("Digite o numero certo na escolha do sexo");
        } else {
            if (sexo == 1) {
                var calcular = (72.7 * altura) - 58;
                System.out.println("Seu peso ideal é " + calcular);
            } else if (sexo == 2) {
                var calcular = (62.1 * altura) - 44.7;
                System.out.println("Seu peso ideal é " + calcular);
            }
    }
}
    }

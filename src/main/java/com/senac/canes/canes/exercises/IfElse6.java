package com.senac.canes.canes.exercises;

import java.util.Scanner;

public class IfElse6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = s.nextDouble();


        System.out.print("Digite o sexo da pessoa (1: feminino, 2: masculino): ");
        int sexo = s.nextInt();

        //variavel auxiliar para conta
        double pesoIdeal = 0;


        if (sexo == 1) {

            pesoIdeal = (62.1 * altura) - 44.7;
        } else if (sexo == 2) {

            pesoIdeal = (72.7 * altura) - 58;
        } else {

            System.out.println("Sexo inválido! Digite 1 para feminino ou 2 para masculino.");

        }


        System.out.printf("O peso ideal é: %.2f kg%n", pesoIdeal);
    }
}


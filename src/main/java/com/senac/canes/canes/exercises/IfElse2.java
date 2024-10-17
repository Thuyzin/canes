package com.senac.canes.canes.exercises;

import java.util.Scanner;

public class IfElse2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade.");
        var idade = s.nextInt();

        if(idade >= 16){
            System.out.println("Voce podera votar");
        }else{
            System.out.println("Voce nao podera votar");
        }

    }
}

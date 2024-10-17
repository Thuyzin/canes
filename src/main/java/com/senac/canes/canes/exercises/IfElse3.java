package com.senac.canes.canes.exercises;

import java.util.Scanner;

public class IfElse3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a senha");
        var senha = s.nextInt();
        var acesso = 1234;

        if(senha == 1234){
            System.out.println("ACESSO PERMITIDO");
        }else{
            System.out.println("ACESSO NEGADO");
        }
    }
}

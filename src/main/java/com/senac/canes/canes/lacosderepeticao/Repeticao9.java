package com.senac.canes.canes.lacosderepeticao;

import java.util.Scanner;

public class Repeticao9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        var nome = "";
        var idade = 0;
        var idadeMenor = Integer.MAX_VALUE;
        var nomeMenor = "";

        for (var x = 0; x < 10; x++){
            System.out.println("Digite seu nome");
            nome = s.next();
            System.out.println("Digite sua idade");
            idade = s.nextInt();

            if(idade < idadeMenor){
                nomeMenor = nome;
                idadeMenor = idade;
            }
        }

        System.out.println("O nome da pessoa mais nova e: " + nomeMenor + " Com a idade: " + idade);
    }
}

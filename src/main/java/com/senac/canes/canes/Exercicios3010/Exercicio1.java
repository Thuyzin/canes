package com.senac.canes.canes.Exercicios3010;

import java.util.Scanner;
import java.util.Objects;

public class Exercicio1 {

    Scanner s = new Scanner(System.in);

    public static class ContaBancaria {

        private double saldo = getSaldo();
        private String titular = "Kevin";

        public void depositar(double valor) {
            this.saldo += valor;
        }
        public void sacar(double valor){
            this.saldo -= valor;
        }
        public double getSaldo(){
            return this.saldo;
        }
        public String getTitular(){
            return this.titular;
        }
        public void setTitular(String nome){
            this.titular = nome;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ContaBancaria conta = new ContaBancaria();

            System.out.println("Digite o nome do titular da conta: ");
            conta.setTitular(sc.next());
            System.out.println("Qual operacao deseja fazer? \n 1- Depositar \n 2- Sacar\n 3- Visualizar saldo\n 4- Sair");
            String operacao = sc.next();

            while (!Objects.equals(operacao, "4")) {
                switch (operacao) {
                    case "1":
                        System.out.println("Quanto deseja depositar? ");
                        conta.depositar(sc.nextInt());
                        System.out.println("Operacao sucedida");
                        break;
                    case "2":
                        System.out.println("Quanto deseja sacar? ");
                        conta.sacar(sc.nextInt());
                        System.out.println("Operacao sucedida");
                        break;
                    case "3":
                        System.out.println(conta.getSaldo());
                        break;
                    default : System.out.println("Operacao invalida");
                }
                System.out.println("Qual operacao deseja fazer? \n 1- Depositar \n 2- Sacar\n 3- Visualizar saldo\n 4- Sair");
                operacao =sc.next();
            }
        }
    }

    //EXERCICIO 2

    /*public static void main(String[] args) {

        System.out.println("Digite o numero do dia da semana");
        int num = s.nextInt();

        switch (num) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido");
        }
    }*/

    //EXERCICIO 3

    /*public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero entre 0 e 10");
        int numero = s.nextInt();

        if (numero == 0){
            System.out.println("Zero");
        }else {
        switch (numero) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Sete");
                break;
            case 8:
                System.out.println("Oito");
                break;
            case 9:
                System.out.println("Nove");
                break;
            case 10:
                System.out.println("Dez");
                break;
        }*/
        }

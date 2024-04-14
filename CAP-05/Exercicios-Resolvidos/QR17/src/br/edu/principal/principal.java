package br.edu.principal;

import java.util.Scanner;

public class principal {
   
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário de Carlos:");
        double salarioCarlos = sc.nextDouble();

        double salarioJoao = salarioCarlos / 3;

        double taxaPoupanca = 0.02;

        double taxaFundo = 0.05;

        double valorCarlos = salarioCarlos;

        double valorJoao = salarioJoao;
        int meses = 0;

        while (valorJoao < valorCarlos) {
            valorCarlos += valorCarlos * taxaPoupanca;

            valorJoao += valorJoao * taxaFundo;
            meses++;
        }
        System.out.println("O valor de João igualará ou ultrapassará o valor de Carlos em " + meses + " meses.");
    }
}
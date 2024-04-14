package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = 0;
		double r = 0;
		
		System.out.println("Digite um número: ");
		num = sc.nextDouble();
		r = num%2;
		
		if(r == 0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é ímpar");
		}
		
	}

}

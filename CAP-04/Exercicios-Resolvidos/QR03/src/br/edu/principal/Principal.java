package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = sc.nextDouble();
		
		if(num1>num2) {
			System.out.println("O maior número é: " + num1);
			
		}else if(num2>num1) {
			System.out.println("O maior número é: " + num2);
		
		}else if(num1==num2) {
			System.out.println("Os números são iguais.");
		}

	}


}

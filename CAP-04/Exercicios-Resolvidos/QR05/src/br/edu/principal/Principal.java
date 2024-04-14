package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números em ordem crescente: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		
		System.out.println("Digite um número fora de ordem: ");
		double num4 = sc.nextDouble();
		
		if (num4 > num3) {
			System.out.println("A ordem decrescente é: " + num4 + " - " + num3 + " - " + num2 + " - " + num1);
			
		}else if(num4 > num2 && num4 < num3) {
			System.out.println("A ordem decrescente é: " + num3 + " - " + num4 + " - " + num2 + " - " + num1);
			
		}else if(num4 > num1 && num4 < num2) {
			System.out.println("A ordem decrescente é: " + num3 + " - " + num2 + " - " + num4 + " - " + num1);
			
		}else if(num4 < num1) {
			System.out.println("A ordem decrescente é: " + num3 + " - " + num2 + " - " + num1 + " - " + num4);
		}
	}

}

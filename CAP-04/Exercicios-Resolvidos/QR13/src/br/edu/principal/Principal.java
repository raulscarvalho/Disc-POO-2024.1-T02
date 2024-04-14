package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opc = 0;
		double sal = 0;
		double imp = 0;
		double aum = 0;
		double novosal = 0;
		
		
		
		System.out.println("Menu de Opcões:");
		System.out.println("1. Imposto");
		System.out.println("2. Novo Salário");
		System.out.println("3. Classificação");
		System.out.println("Digite a opção desejada.");
		opc = sc.nextInt();
		
		if (opc == 1) {
			System.out.println("Digite seu salário.");
			sal = sc.nextDouble();
			
			if (sal < 500) {
				imp = sal * 5/100;
			}
			
			else if (sal >= 500 && sal <= 850) {
				imp = sal * 1/10;
			}
			
			else if (sal > 850) {
				imp = sal * 15/100;
			}
		
			System.out.println("O valor do imposto é: " + imp);
		
		}
		
		else if (opc == 2) {
			System.out.println("Digite seu salário.");
			sal = sc.nextDouble();
			
			if (sal > 1500) {
				aum = 25;
			}
			
			else if (sal >= 750 && sal <= 1500) {
				aum = 50;
			}
			
			else if (sal >= 450 && sal < 750 ) {
				aum = 75;
			}
			
			else if (sal < 450) {
				aum = 100;
			}
			
			novosal = sal + aum;
			
			System.out.println("O novo salário é " + novosal);
		
		}
		
		else if (opc == 3) {
			System.out.println("Digite seu salário.");
			sal = sc.nextDouble();
			
			if (sal <= 700) {
				System.out.println("Mal renumerado.");
			}
			
			else if (sal > 700) {
				System.out.println("Bem renumerado.");
			}
		}
		
		else {
			System.out.println("Opção inválida.");
		}

	

	}

}

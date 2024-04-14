package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu salário atual: ");
		double sal = sc.nextDouble();
		
		double aum = 0;
		if (sal <= 300) {
			aum = sal * 15/100;
		}
		else if (sal > 300 && sal < 600) {
			aum = sal * 10/100;
		}
		else if (sal >= 600 && sal <= 900) {
			aum = sal * 5/100;
		}
		else if (sal > 900) {
			aum = 0;
		}
		
		double novosal = sal + aum;
		
		System.out.println("O valor de aumento é " + aum);
		System.out.println("O valor do novo salário é " + novosal);
	}

}

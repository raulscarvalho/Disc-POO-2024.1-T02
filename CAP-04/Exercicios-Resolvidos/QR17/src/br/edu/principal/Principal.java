package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double delta = 0;
		double x1 = 0;
		double x2 = 0;

		System.out.println("Digite o valor de a, b e c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if (a == 0) {
			System.out.println("Estes valores não condizem com uma equação de segundo grau.");
		}
		else {
			delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Não existe raiz real.");
			}
			else if (delta == 0) {
				System.out.println("Existe uma raiz real.");
				x1 = b*(-1) / (2 * a);
				System.out.println("O valor da raiz é " + x1);
			}
			else if (delta > 0) {
				System.out.println("Existem duas raízes reais.");
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("O valor das raizes é " + x1 + " e " + x2);
			}
		}
	}

}

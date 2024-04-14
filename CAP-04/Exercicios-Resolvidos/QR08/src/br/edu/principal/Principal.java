package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		double soma = 0;
		double raiz = 0;
		double op = 0;
		
		System.out.print("            MENU\n[1] Somar dois números \n[2] Raiz quadrada de um número ");
		System.out.println("Digite sua Opção: ");
		op = sc.nextDouble();
		
		if(op ==1) {
			System.out.println("Digite o primeiro número");
			num1 = sc.nextDouble();
			System.out.println("Digite o segundo número");
			num2 = sc.nextDouble();
			
			soma = num1+num2;
			System.out.println("A soma de "+num1+" e "+num2+" é"+soma);
		}
		else if(op ==2) {
			System.out.println("Digite um valor: ");
			num1 = sc.nextDouble();
			raiz = Math.sqrt(num1);
			System.out.println("A raiz de "+" é "+raiz);
		}
		else if (op !=1 & op !=2) {
			System.out.println("Opção inválida");
		}
	}

}

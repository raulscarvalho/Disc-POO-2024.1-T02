package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal = 0;
		double novoSal = 0;
		double boni = 0;
		double aux =0;
		
		System.out.println("Digite o valor do salário do funcionário ");
		sal = sc.nextDouble();
		
		if(sal<=500) {
			boni=sal*12/100;
		}
		else if(sal<=1200) {
			boni=sal*12/100;
		}else {
			boni=0;
		}
		
		if(sal<=600) {
			aux = 150;
		}else {
			aux=100;
		}
		
		novoSal = sal+boni+aux;
		
		System.out.println("Novo salário é: "+novoSal);
	}

}

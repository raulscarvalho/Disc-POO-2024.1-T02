package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pre = 0;
		double venda = 0;
		double novoPre = 0;
		
		System.out.println("Digite o valor da venda média mensal do produto: ");
		venda = sc.nextDouble();
		System.out.println("Digite o preço atual do produto: ");
		pre = sc.nextDouble();
		
		if(venda<500 | pre<30) {
			novoPre = pre+ ((pre/100)*10);
		}
		else if((venda>=500 && venda<1200) | (pre>=30 && pre<80)){
			novoPre = pre+ ((pre/100)*15);
		}
		else if(venda>=1200 | pre>=80) {
			novoPre = pre- ((pre/100)*20);
		}
		
		System.out.println("O novo preço é: "+novoPre);
	}

}

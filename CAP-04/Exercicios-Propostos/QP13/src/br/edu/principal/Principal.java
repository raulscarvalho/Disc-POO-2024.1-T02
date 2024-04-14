package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto: ");
		double preco = sc.nextDouble();
		double aum = 0;
		if (preco <= 50) {
			aum = preco * 5/100;
		}
		else if (preco > 50 && preco <= 100) {
			aum = preco * 10/100;
		}
		else if (preco > 100) {
			aum = preco * 15/100;
		}
		double novopreco = preco + aum;
		System.out.println(novopreco);
		
		if (novopreco <= 80) {
			System.out.println("Classificação: Barato");
		}
		else if (novopreco > 80 && novopreco <= 120) {
			System.out.println("Classificação: Normal");
		}
		else if (novopreco > 120 && novopreco <= 200) {
			System.out.println("Classificação: Caro");
		}
		else if (novopreco > 200) {
			System.out.println("Classificação: Muito caro");
		}


	}

}

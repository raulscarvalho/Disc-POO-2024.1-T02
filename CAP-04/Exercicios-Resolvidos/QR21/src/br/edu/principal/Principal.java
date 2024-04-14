package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o código de estado?");
		int cod_est = sc.nextInt();
		
		System.out.println("Qual o código da carga?");
		int cod_carga = sc.nextInt();
		
		System.out.println("Qual o peso do caminhão, em toneladas?");
		double pesot = sc.nextInt();
		
		double pesokg = pesot * 1000;
		double preco_carga = 0;
		double imp = 0;
		
		if (cod_carga >= 10 && cod_carga <= 20) {
			preco_carga = pesokg * 100;
		}
		else if (cod_carga >= 21 && cod_carga <= 30) {
			preco_carga = pesokg * 250;
		}
		else if (cod_carga >= 31 && cod_carga <= 40) {
			preco_carga = pesokg * 340;
		}
		
		
		if (cod_est == 1) {
			imp = preco_carga * 35/100;
		}
		else if (cod_est == 2) {
			imp = preco_carga * 25/100;
		}
		else if (cod_est == 3) {
			imp = preco_carga * 15/100;
		}
		else if (cod_est == 4) {
			imp = preco_carga * 5/100;
		}
		else if (cod_est == 5) {
			imp = 0;
		}
		
		double valor_total = preco_carga + imp;
		
		System.out.println("Peso em kg: " + pesokg);
		System.out.println("Preço da carga: " + preco_carga);
		System.out.println("Valor do imposto: " + imp);
		System.out.println("Valor total transportado pelo caminhão: " + valor_total);
	}

}

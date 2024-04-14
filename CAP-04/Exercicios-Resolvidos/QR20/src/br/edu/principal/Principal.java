package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod_prod = 0;
		double peso_quilos = 0;
		int cod_pais = 0;
		double peso_gramas = 0;
		double pre_total = 0;
		double imposto = 0;
		double valor_total = 0;
		double pre_grama = 0;
		
		System.out.println("Digite o código do produto ");
		cod_prod = sc.nextInt();
		System.out.println("Digite o peso em quilos ");
		peso_quilos = sc.nextDouble();
		System.out.println("Digite o código do país ");
		cod_pais = sc.nextInt();
		
		peso_gramas = peso_quilos * 1000;
		System.out.println("O peso em gramas é: "+peso_gramas+"g");
		
		if(cod_prod >= 1 && cod_prod <=4) {
			pre_grama = 10;
		}
		else if(cod_prod >= 5 && cod_prod <=7) {
			pre_grama = 25;
		}
		else if(cod_prod >= 8 && cod_prod <=10) {
			pre_grama = 35;
		}
		
		pre_total = peso_gramas * pre_grama;
		
		if(cod_pais ==1) {
			imposto = 0;
		}
		else if(cod_pais ==2) {
			imposto = pre_total*(15/100);
		}
		else if(cod_pais ==3) {
			imposto = pre_total*(25/100);
		}
		
		System.out.println("O imposto é de: "+imposto);
		
		valor_total = pre_total+imposto;
		System.out.println("O valor total é de: "+valor_total);
	}

}

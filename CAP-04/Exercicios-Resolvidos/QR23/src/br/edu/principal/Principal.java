package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String turno = "";
		String categoria = "";
		
		System.out.println("Qual o valor do salário mínimo?");
		double sal_min = sc.nextDouble();
		
		System.out.println("Qual o turno?");
		turno = sc.next();
		
		System.out.println("Qual a categoria?");
		categoria = sc.next();
		
		System.out.println("Qual a quantidade de horas trabalhadas?");
		double horast = sc.nextDouble();
		
		double valorcoef = 0;
		
		if (turno.equals("M")) {
			valorcoef = sal_min * 1/10;
		}
		else if (turno.equals("V")) {
			valorcoef = sal_min * 15/100;
		}
		else if (turno.equals("N")) {
			valorcoef = sal_min * 12/100;
		}
		System.out.println(turno);
		double sal_bruto = horast * valorcoef;
		
		double imp = 0;
		
		if (categoria.equals("O")) {
			if (sal_bruto >= 300) {
				imp = sal_bruto * 1/20;
			}
			else if (sal_bruto < 300) {
				imp = sal_bruto * 3/100;
			}

		}
		else if (categoria.equals("G")) {
			if (sal_bruto >= 400) {
				imp = sal_bruto * 3/50;
			}
			else if (sal_bruto < 400) {
				imp = sal_bruto * 1/25;
			}
		}
		
		double grat = 0;
		
		if (turno.equals("N") && horast > 80) {
			grat = 50;
		}
		else {
			grat = 30;
		}
		
		double auxalimento = 0;
		
		if (categoria.equals("O") || valorcoef <= 25) {
			auxalimento = sal_bruto * 1/3;
		}
		else {
			auxalimento = sal_bruto * 1/2;
		}
		
		double sal_liq = sal_bruto - imp + grat + auxalimento;
		
		
		System.out.println("O coeficiente do salário é " + valorcoef);
		System.out.println("O valor do salário bruto é " + sal_bruto);
		System.out.println("O imposto é " + imp);
		System.out.println("A gratificação é " + grat);
		System.out.println("O auxílio alimentação é " + auxalimento);
		System.out.println("O salário líquido é " + sal_liq);
		
		if (sal_liq < 350) {
			System.out.println("Mal renumerado.");
		}
		else if (sal_liq >= 350 && sal_liq <= 600) {
			System.out.println("Normal.");
		}
		else if (sal_liq > 600) {
			System.out.println("Bem renumerado.");
		}

	}

}

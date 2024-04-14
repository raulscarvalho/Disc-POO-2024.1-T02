package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sal_min = 0;
		double ht = 0;
		int dep = 0;
		double hext = 0;
		
		System.out.println("Qual o salário mínimo?");
		sal_min = sc.nextDouble();
		
		System.out.println("Qual o número de horas trabalhadas?");
		ht = sc.nextDouble();
		
		System.out.println("Qual o total de dependentes?");
		dep = sc.nextInt();
		
		System.out.println("Qual o número de horas extras trabalhadas?");
		hext = sc.nextDouble();
		
		double valor_ht = sal_min/5;
		double valor_hext = 3/2 * hext * valor_ht;
		int valor_dep = 32 * dep;
		double sal_mes = ht * valor_ht;
		double sal_bruto = sal_mes + valor_hext + valor_dep;
		double imp = 0;
		double sal_liq = 0;
	
		if (sal_bruto < 200) {
			imp = 0;
		}
		else if (sal_bruto >= 200 && sal_bruto <= 500) {
			imp = sal_bruto * 1/10;
		}
		else if (sal_bruto > 500) {
			imp = sal_bruto * 1/5;
		}
		
		sal_liq = sal_bruto - imp;
		
		double grat = 0;
	
		if (sal_liq <= 350) {
			grat = 100;
		}
		else if (sal_liq > 350) {
			grat = 50;
		}
		sal_liq = sal_bruto - imp;
		double sal_receber = sal_liq + grat;
		
		System.out.println("O salário a receber é: " + sal_receber);
		
		
	} 

}

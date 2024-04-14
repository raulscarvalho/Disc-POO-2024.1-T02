package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal_base = 0;
		double tempo = 0;
		double imposto = 0;
		double grat = 0;
		double sal_liq = 0;
		
		System.out.println("Digite o salário base ");
		sal_base = sc.nextDouble();
		
		System.out.println("Digite o tempo de serviço (anos) ");
		tempo = sc.nextDouble();
		
		if(sal_base<200) {
			imposto = 0;
		}
		else if(sal_base<=450){
			imposto = ((sal_base/100)*3);
		}
		else if(sal_base<=700){
			imposto = ((sal_base/100)*8);
		}else {
			imposto = ((sal_base/100)*12);
		}
		
		System.out.println("O imposto é de: R$"+imposto);
		
		if(sal_base>500) {
			if(tempo<=3) {
				grat = 20;
			}else {
				grat = 30;
			}
		}else {
			if(tempo<=3) {
				grat = 23;
			}
			else if(tempo<6) {
				grat = 35;
			}else {
				grat = 33;
			}
		}
		
		System.out.println("A gratificação é de R$"+grat);
		
		sal_liq = sal_base - imposto +grat;
		
		System.out.println("O salário liquido é de R$ "+sal_liq);
		
		if(sal_liq<=350) {
			System.out.println("Classificação A");
		}
		else if (sal_liq <600) {
			System.out.println("Classificação B");
		}else {
			System.out.println("Classificação C");
		}
	}

}

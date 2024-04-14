package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = 0;
		double m1 = 0;
		double a1 = 0;
		double d2 = 0;
		double m2 = 0;
		double a2 = 0;
		
		System.out.println("Digite a primeira data");
		System.out.println("dia (dd):");
		d1 = sc.nextDouble();
		System.out.println("mês (mm):");
		m1 = sc.nextDouble();
		System.out.println("ano (aaaa):");
		a1 = sc.nextDouble();
		
		System.out.println("Digite a segunda data");
		System.out.println("dia (dd):");
		d2 = sc.nextDouble();
		System.out.println("mês (mm):");
		m2 = sc.nextDouble();
		System.out.println("ano (aaaa):");
		a2 = sc.nextDouble();
		
		if(a1>a2) {
			System.out.println("A maior data é: "+d1+" - "+m1+" - "+a1);
		}
		else if(a2>a1) {
			System.out.println("A maior data é: "+d2+" - "+m2+" - "+a2);
		}
		else if(m1>m2) {
			System.out.println("A maior data é: "+d1+" - "+m1+" - "+a1);
		}
		else if(m2>m1) {
			System.out.println("A maior data é: "+d2+" - "+m2+" - "+a2);
		}
		else if(d1>d2) {
			System.out.println("A maior data é: "+d1+" - "+m1+" - "+a1);
		}
		else if(d2>d1) {
			System.out.println("A maior data é: "+d2+" - "+m2+" - "+a2);
		} 
		else {
			System.out.println("As datas são iguais!");
		}

	}

}

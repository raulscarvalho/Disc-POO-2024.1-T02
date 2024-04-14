package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual sua altura em metros?");
		double altura = sc.nextDouble();
		
		System.out.println("Qual seu peso em kg?");
		double peso = sc.nextDouble();
		
		if (altura < 1.2) {
			if (peso <= 60) {
				System.out.println("Classificação A.");
			}
			else if (peso > 60 && peso <= 90) {
				System.out.println("Classificação D.");
			}
			else if (peso > 90) {
				System.out.println("Classificação G.");
			}
		}
		else if (altura > 1.2 && altura <= 1.7) {
			if (peso <= 60) {
				System.out.println("Classificação B.");
			}
			else if (peso > 60 && peso <= 90) {
				System.out.println("Classificação E.");
			}
			else if (peso > 90) {
				System.out.println("Classificação H.");
			}
		}
		else if (altura > 1.7) {
			if (peso <= 60) {
				System.out.println("Classificação C.");
			}
			else if (peso > 60 && peso <= 90) {
				System.out.println("Classificação F.");
			}
			else if (peso > 90) {
				System.out.println("Classificação I.");
			}
		}
	}		
}



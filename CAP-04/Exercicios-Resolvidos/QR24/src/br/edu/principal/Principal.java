package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pre = 0, valor_adic = 0, imposto = 0, pre_custo = 0, desconto = 0, novo_pre = 0;
		String tipo, refrig;
		
		System.out.println("Digite o preço do produto: ");
		pre = sc.nextDouble();
		System.out.println("Digite o tipo do produto (A — alimentação; L — limpeza; e V — vestuário): ");
		tipo = sc.next();
		System.out.println("Digite a refrigeração do produto (S — produto que necessita de refrigeração; e N — produto que não necessita de refrigeração): ");
		refrig = sc.next();
		
		if(refrig == "N") {
			if(tipo == "A") {
				if(pre<15) {
					valor_adic = 2;
				}else {
					valor_adic = 5;
				}
			}
			else if(tipo == "L") {
				if(pre<10) {
					valor_adic = 1.5;
				}else {
					valor_adic = 2.5;
				}
			}
			else if(tipo == "V") {
				if(pre<30) {
					valor_adic = 3;
				}else {
					valor_adic = 2.5;
				}
			}
		}else {
			if(tipo == "A") {
				valor_adic = 8;
			}
			else if(tipo == "L") {
				valor_adic = 0;
			}
			else if(tipo == "V") {
				valor_adic = 0;
			}
		}
		System.out.println("O valor adicional é de: R$"+valor_adic);
		if(pre<25) {
			imposto = (pre/100)*5;	
		}else {
			imposto = (pre/100)*8;
		}
		System.out.println("O valor do imposto é de: R$"+imposto);
		pre_custo = pre+imposto;
		System.out.println("O preço de custo é de: R$"+pre_custo);
		if(tipo != "A" && refrig != "S") {
			desconto = (pre_custo/100)*3;
		}else {
			desconto = 0;
		}
		System.out.println("O valor do desconto é de: R$"+desconto);
		novo_pre= pre_custo+valor_adic-desconto;
		System.out.println("O novo preço é de: R$"+novo_pre);
		if(novo_pre<=50) {
			System.out.println("Barato");
		}
		else if(novo_pre<100) {
			System.out.println("Normal");
		}else {
			System.out.println("Caro");
		}
	}
}
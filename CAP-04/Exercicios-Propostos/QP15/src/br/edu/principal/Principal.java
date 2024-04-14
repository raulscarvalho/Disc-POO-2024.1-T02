package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecione o tipo de investimento: ");
		System.out.println("1. Poupança ");
		System.out.println("2. Fundos de renda fixa ");
		int tipo = sc.nextInt();
		System.out.println("Digite o valor do investimento: ");
		double investimento = sc.nextDouble();
		
		double rendimento = 0;
		
		if (tipo == 1) {
			rendimento = investimento * 3/100;
		}
		else if (tipo == 2) {
			rendimento = investimento * 4/100;
		}
		double valorfinal = investimento + rendimento;
		System.out.println("O valor corrigido do seu investimento é " + valorfinal);

	}

}

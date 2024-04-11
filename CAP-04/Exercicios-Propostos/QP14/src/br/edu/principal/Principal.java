package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Esse programa calcula o aumento do salário de um funcionário de acordo com seu salário atual.");
		Scanner sc = new Scanner(System.in);
		double salario = 0;
		double novoSal = 0;
		System.out.println("Digite o salário do funcionário: ");
		salario = sc.nextDouble();
		
		if (salario<=300) {
			novoSal = salario + (salario/2);
		}
		else if (salario > 300 && salario <= 500) {
			novoSal = salario + ((salario/100)*40);
		}
		else if (salario > 500 && salario <= 700) {
			novoSal = salario + ((salario/100)*30);
		}
		else if (salario > 700 && salario <= 800) {
			novoSal = salario + ((salario/100)*20);
		}
		else if (salario > 800 && salario <= 1000) {
			novoSal = salario + ((salario/100)*10);
		}
		else if (salario > 1000 ) {
			novoSal = salario + ((salario/100)*5);
		}
		
		System.out.println("O novo salário do funcionário é de R$"+new DecimalFormat(".##").format(novoSal));
	}

}

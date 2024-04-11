package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá. Esse programa calcula a gratificação de um funcionário, baseado no número de horas extras e horas que um funcionário faltou");
		double minutosExtra = 0;
		double minutosFaltados = 0;
		double gratificacao = 0;
		
		System.out.println("Digite o número de minutos extras trabalhados pelo funcionário: ");
		minutosExtra = sc.nextDouble();
		System.out.println("Digite o número de minutos faltados pelo funcionário: ");
		minutosFaltados = sc.nextDouble();
		
		double H = minutosExtra -(2/3 * (minutosFaltados));
		
		if (H<600) {
			gratificacao = 100;
		}
		else if (H>600 && H<=1200) {
			gratificacao = 200;
		}
		else if (H>1200 && H<=1800){
			gratificacao = 300;
		}
		else if (H>1800 && H<=2400){
			gratificacao = 400;
		}
		else if (H>=2400){
			gratificacao = 500;
		}
		
		System.out.println("A gratificação do funcionário é de R$"+new DecimalFormat(".##").format(gratificacao));
	}

}

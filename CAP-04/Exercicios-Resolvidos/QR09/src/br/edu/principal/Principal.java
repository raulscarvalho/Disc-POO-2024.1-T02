package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o número do dia, do mês, e do ano.");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int ano = sc.nextInt();
		
		String mesStr = " ";
		
		if (mes == 1) {
			mesStr = "janeiro";
		}
		else if (mes == 2) {
			mesStr = "fevereiro";
		}
		else if (mes == 3) {
			mesStr = "março";
		}
		else if (mes == 4) {
			mesStr = "abril";
		}
		else if (mes == 5) {
			mesStr = "maio";
		}
		else if (mes == 6) {
			mesStr = "junho";
		}
		else if (mes == 7) {
			mesStr = "julho";
		}
		else if (mes == 8) {
			mesStr = "agosto";
		}
		else if (mes == 9) {
			mesStr = "setembro";
		}
		else if (mes == 10) {
			mesStr = "outubro";
		}
		else if (mes == 11) {
			mesStr = "novembro";
		}
		else if (mes == 12) {
			mesStr = "dezembro";
		}
		System.out.println("Data atual: " + dia + "/" + mesStr + "/" + ano);
	
		System.out.println("Digite as horas e os minutos.");
		int h = sc.nextInt();
		int min = sc.nextInt();
		
		String minmnr10 = "";
		
		if (min<10) {
			minmnr10 = "0" + min;
		}else {
			minmnr10 = min + "";
		}
		System.out.println("Hora atual: " + h + ":" + minmnr10);
	
	
	}

}

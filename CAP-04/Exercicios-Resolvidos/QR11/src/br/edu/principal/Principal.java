package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horai = 0;
		int mini = 0;
		int horaf = 0;
		int minf = 0;
		int horad = 0;
		int mind = 0;
		
		System.out.println("Digite o horário inicial: ");
		System.out.println("Hora: ");
		horai = sc.nextInt();
		System.out.println("Minuto: ");
		mini = sc.nextInt();
		
		System.out.println("Digite o horário final: ");
		System.out.println("Hora: ");
		horaf = sc.nextInt();
		System.out.println("Minuto: ");
		minf = sc.nextInt();

		if (minf < mini) {
			horaf = horaf - 1;
			minf = minf +60;
		}
		
		if (horaf < horai) {
			horaf = horaf + 24;
			
		}
		
		horad = horaf - horai;
		mind = minf - mini;
		
		System.out.println("O jogo durou " + horad + " hora(s) e " + mind + " minutos.");
		
	}

}

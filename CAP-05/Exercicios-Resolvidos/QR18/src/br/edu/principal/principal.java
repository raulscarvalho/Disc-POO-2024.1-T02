package br.edu.principal;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Digite um número ou 0 para sair: ");
            int numero = sc.nextInt();
            if (numero <= 0) {
                break;
            }
            System.out.println("Valor lido: " + numero);
            System.out.println("Quadrado: " + (numero * numero));
            System.out.println("Cubo: " + (numero * numero * numero));
            System.out.println("Raiz quadrada: " + Math.sqrt(numero));
        }
        sc.close();
    }
}
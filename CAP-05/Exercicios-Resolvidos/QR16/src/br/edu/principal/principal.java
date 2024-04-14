package br.edu.principal;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, height, area;

        System.out.println("Entre com a base do triângulo:");
        base = sc.nextDouble();

        System.out.println("Entre com a altura do triângulo:");
        height = sc.nextDouble();

        if (base <= 0 || height <= 0) {
            System.out.println("Entrada inválida. As medidas devem ser maiores que 0.");
        } else {
            area = (base * height) / 2;
            System.out.println("A área do triângulo é: " + area);
        }
    }
}
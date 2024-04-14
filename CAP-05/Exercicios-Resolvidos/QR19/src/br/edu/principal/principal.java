package br.edu.principal;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n, soma;

        do {
            System.out.print("Digite dois números inteiros positivos (m, n): ");
            m = sc.nextInt();
            n = sc.nextInt();

            if (m <= n) {
                soma = 0;
                for (int i = m; i <= n; i++) {
                    soma += i;
                }
                System.out.println("Soma dos números entre " + m + " e " + n + ": " + soma);
            } else {
                System.out.println("m deve ser menor ou igual a n.");
            }
        } while (m <= n);

        sc.close();
    }
}
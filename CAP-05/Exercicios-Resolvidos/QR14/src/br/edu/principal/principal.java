package br.edu.principal;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor da dívida: R$");
        double valorDivida = sc.nextDouble();
        
        System.out.println("\nValor da dívida\tValor dos juros\tQuantidade de parcelas\tValor da parcela");
        
        for (int parcelas = 1; parcelas <= 12; parcelas += 3) {
            double valorJuros = valorDivida * (parcelas / 100.0);
            double valorTotal = valorDivida + valorJuros;
            double valorParcela = valorTotal / parcelas;
            
            System.out.printf("R$ %.2f\t\tR$ %.2f\t\t%d\t\t\tR$ %.2f\n", valorTotal, valorJuros, parcelas, valorParcela);
        }
        
        sc.close();
    }
}
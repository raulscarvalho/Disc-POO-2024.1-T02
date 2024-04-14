package br.edu.principal;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double totalImpostos = 0;
        
        while (true) {
            System.out.print("Digite o preço unitário do produto (ou um valor negativo para encerrar): ");
            double precoUnitario = sc.nextDouble();
            
            if (precoUnitario <= 0) {
                break;
            }
            
            System.out.print("Digite o país de origem do produto (1 - Estados Unidos; 2 - México; 3 - Outros): ");
            int paisOrigem = sc.nextInt();
            
            System.out.print("Digite o meio de transporte do produto (T - Terrestre; F - Fluvial; A - Aéreo): ");
            char meioTransporte = sc.next().charAt(0);
            meioTransporte = Character.toUpperCase(meioTransporte);
            
            System.out.print("O produto é carga perigosa? (S - Sim; N - Não): ");
            char cargaPerigosa = sc.next().charAt(0);
            cargaPerigosa = Character.toUpperCase(cargaPerigosa);
            
            double imposto;
            if (precoUnitario <= 100) {
                imposto = precoUnitario * 0.05;
            } else {
                imposto = precoUnitario * 0.10;
            }
            totalImpostos += imposto;
            
            double valorTransporte;
            if (cargaPerigosa == 'S') {
                switch (paisOrigem) {
                    case 1:
                        valorTransporte = 50.00;
                        break;
                    case 2:
                        valorTransporte = 21.00;
                        break;
                    case 3:
                        valorTransporte = 24.00;
                        break;
                    default:
                        valorTransporte = 0.00;
                }
            } else {
                switch (paisOrigem) {
                    case 1:
                        valorTransporte = 12.00;
                        break;
                    case 2:
                        valorTransporte = 21.00;
                        break;
                    case 3:
                        valorTransporte = 60.00;
                        break;
                    default:
                        valorTransporte = 0.00;
                }
            }
            
            double valorSeguro = 0;
            if (paisOrigem == 2 || meioTransporte == 'A') {
                valorSeguro = precoUnitario / 2;
            }
            
            double precoFinal = precoUnitario + imposto + valorTransporte + valorSeguro;
            
            System.out.println("Imposto: R$" + imposto);
            System.out.println("Valor do transporte: R$" + valorTransporte);
            System.out.println("Valor do seguro: R$" + valorSeguro);
            System.out.println("Preço final: R$" + precoFinal);
            System.out.println("-----------------------------------------");
        }
        
        System.out.println("Total dos impostos de todos os produtos: R$" + totalImpostos);
        
        sc.close();
    }
}
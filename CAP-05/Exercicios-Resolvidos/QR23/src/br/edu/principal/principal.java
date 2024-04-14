package br.edu.principal;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();
        
        double valorQuilowatt = salarioMinimo / 8;
        
        double faturamentoGeral = 0;
        int quantidadeEntre500e1000 = 0;
        
        while (true) {
            System.out.print("Digite a quantidade de quilowatts consumida (ou 0 para encerrar): ");
            int quilowatts = sc.nextInt();
            
            if (quilowatts == 0) {
                break;
            }
            
            System.out.print("Digite o tipo de consumidor (1 - residencial; 2 - comercial; 3 - industrial): ");
            int tipoConsumidor = sc.nextInt();
            
            double valorConta = quilowatts * valorQuilowatt;
            
            double acrescimo = 0;
            switch (tipoConsumidor) {
                case 1:
                    acrescimo = valorConta * 0.05;
                    break;
                case 2:
                    acrescimo = valorConta * 0.10;
                    break;
                case 3:
                    acrescimo = valorConta * 0.15;
                    break;
            }
            
            valorConta += acrescimo;
            
            faturamentoGeral += valorConta;
            
            if (valorConta >= 500 && valorConta <= 1000) {
                quantidadeEntre500e1000++;
            }
        }
        
        System.out.println("Valor de cada quilowatt: R$" + valorQuilowatt);
        System.out.println("Faturamento geral da empresa: R$" + faturamentoGeral);
        System.out.println("Quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00: " + quantidadeEntre500e1000);
        
        sc.close();
    }
}
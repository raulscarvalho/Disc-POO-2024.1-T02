package br.edu.principal;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precoUnitario = new double[12];
        char[] refrigeracao = new char[12];
        char[] categoria = new char[12];
        double[] custoEstocagem = new double[12];
        double[] imposto = new double[12];
        double[] precoFinal = new double[12];
        String[] classificacao = new String[12];
        double mediaValoresAdicionais = 0;
        double maiorPrecoFinal = 0;
        double menorPrecoFinal = Double.MAX_VALUE;
        double totalImpostos = 0;
        int quantidadeBarato = 0;
        int quantidadeCaro = 0;
        int quantidadeNormal = 0;

        for (int i = 0; i < 12; i++) {
            System.out.println("Informe o preço unitário do produto " + (i + 1) + ":");
            precoUnitario[i] = sc.nextDouble();

            System.out.println("Informe se o produto " + (i + 1) + " necessita de refrigeração (S/N):");
            refrigeracao[i] = sc.next().charAt(0);

            System.out.println("Informe a categoria do produto " + (i + 1) + " (A/L/V):");
            categoria[i] = sc.next().charAt(0);

            if (precoUnitario[i] <= 20) {
                if (categoria[i] == 'A') {
                    custoEstocagem[i] = 2.00;
                } else if (categoria[i] == 'L') {
                    custoEstocagem[i] = 3.00;
                } else if (categoria[i] == 'V') {
                    custoEstocagem[i] = 4.00;
                }
            } else if (precoUnitario[i] > 20 && precoUnitario[i] <= 50) {
                if (refrigeracao[i] == 'S') {
                    custoEstocagem[i] = 6.00;
                } else if (refrigeracao[i] == 'N') {
                    custoEstocagem[i] = 0.00;
                }
            } else if (precoUnitario[i] > 50) {
                if (refrigeracao[i] == 'S') {
                    if (categoria[i] == 'A') {
                        custoEstocagem[i] = 5.00;
                    } else if (categoria[i] == 'L') {
                        custoEstocagem[i] = 2.00;
                    } else if (categoria[i] == 'V') {
                        custoEstocagem[i] = 4.00;
                    }
                } else if (refrigeracao[i] == 'N') {
                    if (categoria[i] == 'A' || categoria[i] == 'V') {
                        custoEstocagem[i] = 0.00;
                    } else if (categoria[i] == 'L') {
                        custoEstocagem[i] = 1.00;
                    }
                }
            }

            if (!(categoria[i] == 'A' && refrigeracao[i] == 'S')) {
                imposto[i] = precoUnitario[i] * 0.02;
            } else {
                imposto[i] = precoUnitario[i] * 0.04;
            }

            precoFinal[i] = precoUnitario[i] + custoEstocagem[i] + imposto[i];

            if (precoFinal[i] <= 20.00) {
                classificacao[i] = "Barato";
            } else if (precoFinal[i] > 20.00 && precoFinal[i] <= 100.00) {
                classificacao[i] = "Normal";
            } else if (precoFinal[i] > 100.00) {
                classificacao[i] = "Caro";
            }

            mediaValoresAdicionais += custoEstocagem[i] + imposto[i];

            if (precoFinal[i] > maiorPrecoFinal) {
                maiorPrecoFinal = precoFinal[i];
            }
            if (precoFinal[i] < menorPrecoFinal) {
                menorPrecoFinal = precoFinal[i];
            }

            totalImpostos += imposto[i];

            if (classificacao[i] == "Barato") {
                quantidadeBarato++;
            } else if (classificacao[i] == "Caro") {
                quantidadeCaro++;
            } else if (classificacao[i] == "Normal") {
                quantidadeNormal++;
            }
        }

        mediaValoresAdicionais /= 12;

        System.out.println("Custo de estocagem:");
        for (double c : custoEstocagem) {
            System.out.printf("%.2f ", c);
        }
        System.out.println();

        System.out.println("Imposto:");
        for (double i : imposto) {
            System.out.printf("%.2f ", i);
        }
        System.out.println();

        System.out.println("Preço final:");
        for (double p : precoFinal) {
            System.out.printf("%.2f ", p);
        }
        System.out.println();

        System.out.println("Classificação:");
        for (String c : classificacao) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Média dos valores adicionais: " + String.format("%.2f", mediaValoresAdicionais));
        System.out.println("Maior preço final: " + String.format("%.2f", maiorPrecoFinal));
        System.out.println("Menor preço final: " + String.format("%.2f", menorPrecoFinal));
        System.out.println("Total de impostos: " + String.format("%.2f", totalImpostos));
        System.out.println("Quantidade de produtos com classificação Barato: " + quantidadeBarato);
        System.out.println("Quantidade de produtos com classificação Caro: " + quantidadeCaro);
        System.out.println("Quantidade de produtos com classificação Normal: " + quantidadeNormal);
    }
}
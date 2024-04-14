package br.edu.principal;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        double somaPares = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        
        while (true) {
            System.out.print("Digite um número (ou 30.000 para finalizar): ");
            double numero = sc.nextDouble();
            
            if (numero == 30000) {
                break;
            }
            
            soma += numero;
            quantidade++;
            
            if (numero > maior) {
                maior = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
            
            if (numero % 2 == 0) {
                somaPares += numero;
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }
        
        double media = (quantidade != 0) ? soma / quantidade : 0;
        
        double mediaPares = (quantidadePares != 0) ? somaPares / quantidadePares : 0;
        
        double porcentagemImpares = (double) quantidadeImpares / quantidade * 100;
        
        System.out.println("Soma dos números digitados: " + soma);
        System.out.println("Quantidade de números digitados: " + quantidade);
        System.out.println("Média dos números digitados: " + media);
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);
        System.out.println("Média dos números pares: " + mediaPares);
        System.out.println("Porcentagem de números ímpares: " + porcentagemImpares + "%");
        
        sc.close();
    }
}
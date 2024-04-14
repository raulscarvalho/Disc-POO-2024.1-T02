package br.edu.principal;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. Classificação");
            System.out.println("4. Finalizar o programa");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    calcularImposto();
                    break;
                case 2:
                    calcularNovoSalario();
                    break;
                case 3:
                    classificarSalario();
                    break;
                case 4:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
        
        sc.close();
    }
    
    public static void calcularImposto() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: R$");
        double salario = sc.nextDouble();
        
        double imposto;
        if (salario < 500) {
            imposto = salario * 0.05;
        } else if (salario >= 500 && salario <= 850) {
            imposto = salario * 0.10;
        } else {
            imposto = salario * 0.15;
        }
        
        System.out.println("O valor do imposto é: R$" + imposto);
    }
    
    public static void calcularNovoSalario() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: R$");
        double salario = sc.nextDouble();
        
        double novoSalario;
        if (salario > 1500) {
            novoSalario = salario + 25;
        } else if (salario >= 750 && salario <= 1500) {
            novoSalario = salario + 50;
        } else if (salario >= 450 && salario < 750) {
            novoSalario = salario + 75;
        } else {
            novoSalario = salario + 100;
        }
        
        System.out.println("O novo salário é: R$" + novoSalario);
    }
    
    public static void classificarSalario() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: R$");
        double salario = sc.nextDouble();
        
        if (salario <= 700) {
            System.out.println("Mal remunerado");
        } else {
            System.out.println("Bem remunerado");
        }
    }
}
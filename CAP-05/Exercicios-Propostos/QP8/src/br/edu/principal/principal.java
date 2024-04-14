package br.edu.principal;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        double peso;
        double altura;
        char cordoolho;
        char cordocabelo;

        int pessoascommaisde50oumenosde60 = 0;
        double somadaspessoascom150 = 0;
        int contagemdaspessoascom150 = 0;
        int contagemdaspessoascomolhosazul = 0;
        int contagemdepessoasruivassemolhoazul = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");

            System.out.print("Idade: ");
            idade = sc.nextInt();

            System.out.print("Peso: ");
            peso = sc.nextDouble();

            System.out.print("Altura: ");
            altura = sc.nextDouble();

            System.out.print("Cor dos olhos (A — azul; P — preto; V — verde; e C — castanho): ");
            cordoolho = sc.next().charAt(0);

            System.out.print("Cor dos cabelos (P — preto; C — castanho; L — louro; e R — ruivo): ");
            cordocabelo = sc.next().charAt(0);

            if (idade > 50 && peso < 60) {
                pessoascommaisde50oumenosde60++;
            }

            if (altura < 1.50) {
                somadaspessoascom150 += idade;
                contagemdaspessoascom150++;
            }

            if (cordoolho == 'A') {
            	contagemdepessoasruivassemolhoazul++;
            }

            if (cordocabelo == 'R' && cordoolho != 'A') {
            	contagemdepessoasruivassemolhoazul++;
            }
        }

        double pessoascom150m = somadaspessoascom150 / contagemdaspessoascom150;
        double porcentagemdeolhosazul = (contagemdaspessoascomolhosazul / 6.0) * 100;

        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg: " + pessoascommaisde50oumenosde60);
        System.out.println("Média das idades das pessoas com altura inferior a 1,50 m: " + contagemdaspessoascom150);
        System.out.println("Porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas: " + contagemdaspessoascomolhosazul + "%");
        System.out.println("Quantidade de pessoas ruivas e que não possuem olhos azuis: " + contagemdepessoasruivassemolhoazul);
    }
}
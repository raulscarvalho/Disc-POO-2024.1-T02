package br.edu.principal;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, sexo;
        double salario;

        double mediaSalarios = 0;
        int maiorIdade = 0, menorIdade = 150, quantidadeMulheresAte200 = 0;
        int idadeMenorSalario = 0, sexoMenorSalario = 0;
        double menorSalario = Double.MAX_VALUE;

        int contador = 0;

        do {
            System.out.println("Digite a idade (-1 para finalizar): ");
            idade = sc.nextInt();

            if (idade >= 0) {
                System.out.println("Digite o sexo (1 para masculino, 2 para feminino): ");
                sexo = sc.nextInt();

                System.out.println("Digite o salário: ");
                salario = sc.nextDouble();

                mediaSalarios += salario;

                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }

                if (idade < menorIdade) {
                    menorIdade = idade;
                }

                if (sexo == 2 && salario <= 200) {
                    quantidadeMulheresAte200++;
                }

                if (salario < menorSalario) {
                    menorSalario = salario;
                    idadeMenorSalario = idade;
                    sexoMenorSalario = sexo;
                }

                contador++;
            }
        } while (idade >= 0);

        mediaSalarios /= contador;

        System.out.println("Média dos salários: " + mediaSalarios);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de mulheres com salário até R$ 200,00: " + quantidadeMulheresAte200);
        System.out.println("Idade e sexo da pessoa com menor salário: " + idadeMenorSalario + " (" + (sexoMenorSalario == 1 ? "Masculino" : "Feminino") + ")");
    }
}
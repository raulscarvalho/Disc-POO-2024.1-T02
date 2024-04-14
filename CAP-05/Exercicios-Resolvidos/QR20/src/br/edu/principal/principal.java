package br.edu.principal;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo;
        char sexo;
        int horasAula;
        double salarioBruto;
        double salarioLiquido;
        double desconto;
        double mediaSalarioLiquidoMasculino = 0;
        double mediaSalarioLiquidoFeminino = 0;
        int qtdSalariosMasculinos = 0;
        int qtdSalariosFemininos = 0;

        do {
            System.out.print("Informe o código do professor (99999 para encerrar): ");
            codigo = sc.nextInt();

            if (codigo != 99999) {
                System.out.print("Informe o sexo do professor (M/F): ");
                sexo = sc.next().charAt(0);

                System.out.print("Informe o número de horas/aula dadas mensalmente: ");
                horasAula = sc.nextInt();

                salarioBruto = horasAula * 30.0;

                if (sexo == 'M') {
                    desconto = salarioBruto * 0.1;
                } else {
                    desconto = salarioBruto * 0.05;
                }

                salarioLiquido = salarioBruto - desconto;

                System.out.printf("Código: %d\n", codigo);
                System.out.printf("Salário bruto: %.2f\n", salarioBruto);
                System.out.printf("Salário líquido: %.2f\n", salarioLiquido);
                System.out.println();

                if (sexo == 'M') {
                    mediaSalarioLiquidoMasculino += salarioLiquido;
                    qtdSalariosMasculinos++;
                } else {
                    mediaSalarioLiquidoFeminino += salarioLiquido;
                    qtdSalariosFemininos++;
                }
            }
        } while (codigo != 99999);

        if (qtdSalariosMasculinos > 0) {
            mediaSalarioLiquidoMasculino /= qtdSalariosMasculinos;
        }

        if (qtdSalariosFemininos > 0) {
            mediaSalarioLiquidoFeminino /= qtdSalariosFemininos;
        }

        System.out.printf("Média dos salários líquidos dos professores do sexo masculino: %.2f\n", mediaSalarioLiquidoMasculino);
        System.out.printf("Média dos salários líquidos dos professores do sexo feminino: %.2f\n", mediaSalarioLiquidoFeminino);
    }
}
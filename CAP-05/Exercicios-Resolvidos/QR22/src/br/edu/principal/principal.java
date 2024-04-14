package br.edu.principal;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numFeminino = 0;
        int numMasculino = 0;
        int totalHomensComExperiencia = 0;
        int totalHomens = 0;
        int totalMulheresComMenosDe21ComExperiencia = 0;
        int menorIdadeMulherComExperiencia = Integer.MAX_VALUE;
        int idadeTotalHomensComExperiencia = 0;
        int quantidadeHomensComExperiencia = 0;

        while (true) {
            System.out.print("Digite a idade do candidato (ou 0 para encerrar): ");
            int idade = sc.nextInt();
            
            if (idade == 0) {
                break;
            }
            
            System.out.print("Digite o sexo do candidato (M ou F): ");
            char sexo = sc.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
            
            System.out.print("O candidato tem experiência no serviço? (S ou N): ");
            char experiencia = sc.next().charAt(0);
            experiencia = Character.toUpperCase(experiencia);
            
            if (sexo == 'M') {
                numMasculino++;
                totalHomens++;
                if (experiencia == 'S') {
                    totalHomensComExperiencia++;
                    idadeTotalHomensComExperiencia += idade;
                    quantidadeHomensComExperiencia++;
                }
            } else if (sexo == 'F') {
                numFeminino++;
                if (idade < 21 && experiencia == 'S') {
                    totalMulheresComMenosDe21ComExperiencia++;
                }
                if (experiencia == 'S' && idade < menorIdadeMulherComExperiencia) {
                    menorIdadeMulherComExperiencia = idade;
                }
            }
        }
        
        // Cálculo da média de idade dos homens com experiência
        double mediaIdadeHomensComExperiencia = (quantidadeHomensComExperiencia != 0) ? (double)idadeTotalHomensComExperiencia / quantidadeHomensComExperiencia : 0;
        
        // Cálculo da porcentagem de homens com mais de 45 anos entre o total dos homens
        double porcentagemHomensMaisDe45 = (totalHomens != 0) ? (double)(totalHomensComExperiencia * 100) / totalHomens : 0;

        // Exibição dos resultados
        System.out.println("Número de candidatos do sexo feminino: " + numFeminino);
        System.out.println("Número de candidatos do sexo masculino: " + numMasculino);
        System.out.println("Idade média dos homens com experiência: " + mediaIdadeHomensComExperiencia);
        System.out.println("Porcentagem de homens com mais de 45 anos entre o total dos homens: " + porcentagemHomensMaisDe45 + "%");
        System.out.println("Número de mulheres com idade inferior a 21 anos e com experiência no serviço: " + totalMulheresComMenosDe21ComExperiencia);
        System.out.println("Menor idade entre as mulheres que já têm experiência no serviço: " + (menorIdadeMulherComExperiencia == Integer.MAX_VALUE ? "Nenhuma mulher com experiência" : menorIdadeMulherComExperiencia));

        sc.close();
    }
}

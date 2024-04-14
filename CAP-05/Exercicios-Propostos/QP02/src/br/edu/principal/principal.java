package br.edu.principal;

public class principal {

public static void main(String[] args) {
    double precoIngresso = 5.0;
    double despesas = 200.0;
    int ingressosVendidos = 120;

    System.out.println("Tabela de valores de lucros esperados em função do preço do ingresso:");
    System.out.println("Preço do Ingresso | Lucro Esperado | Ingressos Vendidos");
    System.out.println("-------------------------------------------------------");

    while (precoIngresso >= 1.0) {
        double lucroEsperado = (precoIngresso * ingressosVendidos) - despesas;
        System.out.printf("%8.2f | %14.2f | %16d\n", precoIngresso, lucroEsperado, ingressosVendidos);

        precoIngresso -= 0.5;
        ingressosVendidos += 26;
    }
}

}

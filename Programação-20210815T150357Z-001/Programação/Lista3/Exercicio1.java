/*1 – Desenvolva um algoritmo que calcule o imposto de renda de um contribuinte
considerando que os dados do contribuinte são: número do CPF, número de
dependentes e renda mensal. Para o contribuinte será feito um desconto de 5% de
salário mínimo por dependente (máximo de 3 dependentes 15%).
Os valores da alíquota para cálculo do imposto são:
Renda líquida                  Alíquota
até 2 salários mínimos          Isento
2..3 salários mínimos             5%
3..5 salários mínimos             10%
5..7 salários mínimos             15%
acima de 7 salários mínimos       20%
Deve ser solicitado o valor atual do salário mínimo ao iniciar o algoritmo 
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	String cpf;
	double dependentes;
	double suaRenda;
	double salarioMinimo;
	double descontoDependentes = 0;
	double pagar;
	
	System.out.println("Insira o valor de sua renda líquida anual");
	suaRenda = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o valor do salário mínimo:");
	salarioMinimo = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira seu CPF: ");
	cpf = String.valueOf(in.nextLine());
	
	System.out.println("Insira o número de dependentes:");
	dependentes = Double.parseDouble(in.nextLine());
	
	if(dependentes == 1) {
		descontoDependentes = 0.05;
	}else if (dependentes == 2) {
		descontoDependentes = 0.10;
	}else if (dependentes == 3) {
		descontoDependentes = 0.15;
	}else {
		System.out.println("Insira um número válido de contribuintes");
	}
	
	
	
	if(suaRenda <= 2*salarioMinimo) {
		System.out.println("O CPF " + cpf + ",encontra-se isento do pagamento de Imposto de Renda");
	}else if(suaRenda > 2*salarioMinimo && suaRenda <= 3*salarioMinimo) {	
		pagar = (suaRenda * 0.05) - (salarioMinimo * descontoDependentes);
	System.out.println("O CPF " + cpf + ",terá de pagar um valor de Imposto de Renda de " + pagar + "R$");
	}else if(suaRenda > 3*salarioMinimo && suaRenda <= 5*salarioMinimo) {
		pagar = (suaRenda * 0.10) - (salarioMinimo * descontoDependentes);
		System.out.println("O CPF" + cpf + ",terá de pagar um valor de Imposto de Renda de " + pagar + "R$");
	}else if (suaRenda > 5*salarioMinimo && suaRenda == 7*salarioMinimo) {
		pagar = (suaRenda * 0.15) - (salarioMinimo * descontoDependentes);
		System.out.println("O CPF " + cpf + ",terá de pagar um valor de Imposto de Renda de " + pagar + "R$");	
	}else if (suaRenda > 7*salarioMinimo ) {
		pagar = (suaRenda * 0.20) - (salarioMinimo * descontoDependentes);
		System.out.println("O CPF " + cpf + ",terá de pagar um valor de Imposto de Renda de " + pagar + "R$");
		
	}
	
}
}

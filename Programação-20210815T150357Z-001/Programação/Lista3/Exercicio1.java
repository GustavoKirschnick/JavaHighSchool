/*1 � Desenvolva um algoritmo que calcule o imposto de renda de um contribuinte
considerando que os dados do contribuinte s�o: n�mero do CPF, n�mero de
dependentes e renda mensal. Para o contribuinte ser� feito um desconto de 5% de
sal�rio m�nimo por dependente (m�ximo de 3 dependentes 15%).
Os valores da al�quota para c�lculo do imposto s�o:
Renda l�quida                  Al�quota
at� 2 sal�rios m�nimos          Isento
2..3 sal�rios m�nimos             5%
3..5 sal�rios m�nimos             10%
5..7 sal�rios m�nimos             15%
acima de 7 sal�rios m�nimos       20%
Deve ser solicitado o valor atual do sal�rio m�nimo ao iniciar o algoritmo 
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
	
	System.out.println("Insira o valor de sua renda l�quida anual");
	suaRenda = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o valor do sal�rio m�nimo:");
	salarioMinimo = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira seu CPF: ");
	cpf = String.valueOf(in.nextLine());
	
	System.out.println("Insira o n�mero de dependentes:");
	dependentes = Double.parseDouble(in.nextLine());
	
	if(dependentes == 1) {
		descontoDependentes = 0.05;
	}else if (dependentes == 2) {
		descontoDependentes = 0.10;
	}else if (dependentes == 3) {
		descontoDependentes = 0.15;
	}else {
		System.out.println("Insira um n�mero v�lido de contribuintes");
	}
	
	
	
	if(suaRenda <= 2*salarioMinimo) {
		System.out.println("O CPF " + cpf + ",encontra-se isento do pagamento de Imposto de Renda");
	}else if(suaRenda > 2*salarioMinimo && suaRenda <= 3*salarioMinimo) {	
		pagar = (suaRenda * 0.05) - (salarioMinimo * descontoDependentes);
	System.out.println("O CPF " + cpf + ",ter� de pagar um valor de Imposto de Renda de " + pagar + "R$");
	}else if(suaRenda > 3*salarioMinimo && suaRenda <= 5*salarioMinimo) {
		pagar = (suaRenda * 0.10) - (salarioMinimo * descontoDependentes);
		System.out.println("O CPF" + cpf + ",ter� de pagar um valor de Imposto de Renda de " + pagar + "R$");
	}else if (suaRenda > 5*salarioMinimo && suaRenda == 7*salarioMinimo) {
		pagar = (suaRenda * 0.15) - (salarioMinimo * descontoDependentes);
		System.out.println("O CPF " + cpf + ",ter� de pagar um valor de Imposto de Renda de " + pagar + "R$");	
	}else if (suaRenda > 7*salarioMinimo ) {
		pagar = (suaRenda * 0.20) - (salarioMinimo * descontoDependentes);
		System.out.println("O CPF " + cpf + ",ter� de pagar um valor de Imposto de Renda de " + pagar + "R$");
		
	}
	
}
}

/*A empresa “MultiSoft” decidiu conceder um aumento de salário para os seus
funcionários de acordo com a tabela abaixo:
Salário Atual R$ Índice de aumento
0 a 300,00 10%
300,01 a 600,00 11%
600,01 a 900,00 12%
900,01 a 1500,00 6%
1500,01 a 2000,00 3%
Acima de 2000 Sem aumento
Escrever um algoritmo que lê, para cada funcionário, o seu nome e o seu salário
atual, escrevendo depois o nome do funcionário, seu salário atual, o percentual de
seu aumento e o valor do salário corrigido
 * 
 * 
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	String nome;
	double salarioAtual;
	double correcao;
	
	System.out.println("Insira seu nome ");
	nome = String.valueOf(in.nextLine());
	
	System.out.println("Insira seu salário atual ");
	salarioAtual = Double.parseDouble(in.nextLine());
	
	if(salarioAtual > 0 && salarioAtual == 300.00) {
		correcao = (salarioAtual * 10/100) + salarioAtual;
		System.out.println("Senhor(a) " +nome+ " seu salário, sem correção de valor, é de: " +salarioAtual+ ". Corrigindo esse valor, seu salário será de " +correcao);		
	} else if(salarioAtual>300.00 && salarioAtual == 600.00) {
		correcao = (salarioAtual * 11/100) + salarioAtual;
		System.out.println("Senhor(a) " +nome+ " seu salário, sem correção de valor, é de: " +salarioAtual+ ". Corrigindo esse valor, seu salário será de " +correcao);		
	}else if(salarioAtual>600.00 && salarioAtual == 900.00) {
		correcao = (salarioAtual * 12/100) + salarioAtual;
		System.out.println("Senhor(a) " +nome+ " seu salário, sem correção de valor, é de: " +salarioAtual+ ". Corrigindo esse valor, seu salário será de " +correcao);		
	} else if (salarioAtual >900.00 && salarioAtual == 1500.00) {
		correcao = (salarioAtual * 6/100) + salarioAtual;
		System.out.println("Senhor(a) " +nome+ " seu salário, sem correção de valor, é de: " +salarioAtual+ ". Corrigindo esse valor, seu salário será de " +correcao);		
	}else if (salarioAtual > 1500.00 && salarioAtual == 2000.00) {
		correcao = (salarioAtual * 3/100) + salarioAtual;
		System.out.println("Senhor(a) " +nome+ " seu salário, sem correção de valor, é de: " +salarioAtual+ ". Corrigindo esse valor, seu salário será de " +correcao);		
	}else if ( salarioAtual > 2000.00) {
		System.out.println("Senhor(a) " +nome+ " seu salário é de " +salarioAtual);
	}
	
}
}

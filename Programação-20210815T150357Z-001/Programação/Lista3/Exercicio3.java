/*A empresa �MultiSoft� decidiu conceder um aumento de sal�rio para os seus
funcion�rios de acordo com a tabela abaixo:
Sal�rio Atual R$ �ndice de aumento
0 a 300,00 10%
300,01 a 600,00 11%
600,01 a 900,00 12%
900,01 a 1500,00 6%
1500,01 a 2000,00 3%
Acima de 2000 Sem aumento
Escrever um algoritmo que l�, para cada funcion�rio, o seu nome e o seu sal�rio
atual, escrevendo depois o nome do funcion�rio, seu sal�rio atual, o percentual de
seu aumento e o valor do sal�rio corrigido
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
	
	System.out.println("Insira seu sal�rio atual ");
	salarioAtual = Double.parseDouble(in.nextLine());
	
	if(salarioAtual > 0 && salarioAtual == 300.00) {
		correcao = (salarioAtual * 10/100) + salarioAtual;
		System.out.println("Senhor(a) " +nome+ " seu sal�rio, sem corre��o de valor, � de: " +salarioAtual+ ". Corrigindo esse valor, seu sal�rio ser� de " +correcao);		
	} else if(salarioAtual>300.00 && salarioAtual == 600.00) {
		correcao = (salarioAtual * 11/100) + salarioAtual;
		System.out.println("Senhor(a) " +nome+ " seu sal�rio, sem corre��o de valor, � de: " +salarioAtual+ ". Corrigindo esse valor, seu sal�rio ser� de " +correcao);		
	}else if(salarioAtual>600.00 && salarioAtual == 900.00) {
		correcao = (salarioAtual * 12/100) + salarioAtual;
		System.out.println("Senhor(a) " +nome+ " seu sal�rio, sem corre��o de valor, � de: " +salarioAtual+ ". Corrigindo esse valor, seu sal�rio ser� de " +correcao);		
	} else if (salarioAtual >900.00 && salarioAtual == 1500.00) {
		correcao = (salarioAtual * 6/100) + salarioAtual;
		System.out.println("Senhor(a) " +nome+ " seu sal�rio, sem corre��o de valor, � de: " +salarioAtual+ ". Corrigindo esse valor, seu sal�rio ser� de " +correcao);		
	}else if (salarioAtual > 1500.00 && salarioAtual == 2000.00) {
		correcao = (salarioAtual * 3/100) + salarioAtual;
		System.out.println("Senhor(a) " +nome+ " seu sal�rio, sem corre��o de valor, � de: " +salarioAtual+ ". Corrigindo esse valor, seu sal�rio ser� de " +correcao);		
	}else if ( salarioAtual > 2000.00) {
		System.out.println("Senhor(a) " +nome+ " seu sal�rio � de " +salarioAtual);
	}
	
}
}

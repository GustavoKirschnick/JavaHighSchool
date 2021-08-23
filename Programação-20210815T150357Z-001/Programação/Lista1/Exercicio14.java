/*14 - Faça um algoritmo que lê o nome de um vendedor, lê o salário fixo 
 * do vendedor, lê o total (em reais) de vendas por ele efetuadas e lê o
 *  percentual que ganha sobre o total de vendas. O algoritmo deve 
 *  calcular o salário total do vendedor e exibir, ao final,
 *   a seguinte frase:
 * O vendedor <nome do vendedor> recebeu <salario total> reais.
 */
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio14 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	String nomeVendedor;
	double salarioFixo;
	double totalVendas;
	double percentualSobreAsVendas;
	double salarioFinal;
	
	System.out.println("Insira o nome do vendedor: ");
	nomeVendedor = String.valueOf(in.nextLine());
	
	System.out.println("Insira o salário fixo do vendedor: ");
	salarioFixo = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira, em reais, o total de vendas: ");
	totalVendas = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o percentual ganho sobre o total de vendas:");
	percentualSobreAsVendas = Double.parseDouble(in.nextLine());
	
	salarioFinal = (salarioFixo) + (totalVendas * percentualSobreAsVendas/100 );
	
	System.out.println("O vendedor " + nomeVendedor + " recebeu " + salarioFinal +  " reais.");
	
	
	
	
	
	
	
}
}

/*4 - Escreva um programa que informe se existe estoque para atender um pedido
feito a uma f�brica. O programa dever� receber como entradas o n�mero de itens
em estoque e o n�mero de itens a serem fornecidos, e dar� como sa�da o estoque
atualizado (itens em estoque menos itens a ser fornecidos) ou uma mensagem
indicando n�o haver itens suficientes em estoque para atender ao pedido  
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double itensEmEstoque;
	double itensSair;
	double resto;
	
	System.out.println("Insira o n�mero de itens em estoque ");
	itensEmEstoque = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o n�mero de itens a serem retirados ");
	itensSair = Double.parseDouble(in.nextLine());
	
	resto = itensEmEstoque - itensSair;
	
	if(itensEmEstoque >= itensSair) {
		System.out.println("O estoque tem capacidade para essa retirada! Agora restam " +resto );
		
	}else if (itensEmEstoque < itensSair) {
		System.out.println("O estoque n�o tem capacidade para essa retirada!");
	}
	
}
}

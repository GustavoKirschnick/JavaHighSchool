/*4 - Escreva um programa que informe se existe estoque para atender um pedido
feito a uma fábrica. O programa deverá receber como entradas o número de itens
em estoque e o número de itens a serem fornecidos, e dará como saída o estoque
atualizado (itens em estoque menos itens a ser fornecidos) ou uma mensagem
indicando não haver itens suficientes em estoque para atender ao pedido  
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double itensEmEstoque;
	double itensSair;
	double resto;
	
	System.out.println("Insira o número de itens em estoque ");
	itensEmEstoque = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o número de itens a serem retirados ");
	itensSair = Double.parseDouble(in.nextLine());
	
	resto = itensEmEstoque - itensSair;
	
	if(itensEmEstoque >= itensSair) {
		System.out.println("O estoque tem capacidade para essa retirada! Agora restam " +resto );
		
	}else if (itensEmEstoque < itensSair) {
		System.out.println("O estoque não tem capacidade para essa retirada!");
	}
	
}
}

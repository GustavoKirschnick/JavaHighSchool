/*11 - Faça um algoritmo para calcular e exibir o valor de uma prestação
 *  em atraso. prestacao_atrasada <- prestacao + (prestacao*(taxa/100)
 *  *num_dias_atraso), taxa é o percentual de juros por dia, 
 *  num_dias_atraso é o número de dias em atraso e prestação 
 *  é o valor da prestação normal. O valor da prestação, a taxa e o 
 *  número de dias em atraso devem ser fornecidos pelo usuário.
 */
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio11 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double valorPrestacao;
	double taxaMulta;
	double diasDeAtraso;
	double novaPrestacao;
	
	System.out.println("Insira o valor da prestação: ");
	valorPrestacao = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o valor da taxa, em porcentagem,: ");
	taxaMulta = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira os dias de atraso: ");
	diasDeAtraso = Double.parseDouble(in.nextLine());
	
	novaPrestacao =  valorPrestacao + (valorPrestacao * taxaMulta/100) *
			diasDeAtraso;
	 System.out.println("O valor da nova prestação será de: " + novaPrestacao);
	 
}
}

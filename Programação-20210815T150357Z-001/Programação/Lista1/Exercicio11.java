/*11 - Fa�a um algoritmo para calcular e exibir o valor de uma presta��o
 *  em atraso. prestacao_atrasada <- prestacao + (prestacao*(taxa/100)
 *  *num_dias_atraso), taxa � o percentual de juros por dia, 
 *  num_dias_atraso � o n�mero de dias em atraso e presta��o 
 *  � o valor da presta��o normal. O valor da presta��o, a taxa e o 
 *  n�mero de dias em atraso devem ser fornecidos pelo usu�rio.
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
	
	System.out.println("Insira o valor da presta��o: ");
	valorPrestacao = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o valor da taxa, em porcentagem,: ");
	taxaMulta = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira os dias de atraso: ");
	diasDeAtraso = Double.parseDouble(in.nextLine());
	
	novaPrestacao =  valorPrestacao + (valorPrestacao * taxaMulta/100) *
			diasDeAtraso;
	 System.out.println("O valor da nova presta��o ser� de: " + novaPrestacao);
	 
}
}

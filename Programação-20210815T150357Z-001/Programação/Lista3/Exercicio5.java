/*5 - Fa�a um programa que l� dois valores, o primeiro servindo de indicador de
opera��o e o segundo correspondendo ao raio de uma circunfer�ncia. Caso o
primeiro valor lido seja igual a 1, calcular e imprimir a �rea desta circunfer�ncia
(3,14*raio�). Se o valor lido for 2, calcular e imprimir o per�metro da circunfer�ncia
(2*3,14*raio). E se o valor lido for diferente destes dois valores, imprimir uma
mensagem dizendo que o indicador de opera��o foi mal fornecido. 
 */

package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double raio;
	double escolha;
	double operar;
	
	System.out.println("Informe o valor do raio da circunfer�ncia");
	raio = Double.parseDouble(in.nextLine());
	
	System.out.println("Pressione 1 para calcular a �rea e 2 para calcular o per�metro da circunfer�ncia");
	escolha = Double.parseDouble(in.nextLine());
	
	if(escolha == 1) {
		operar = Math.PI * Math.pow(raio,2);
		System.out.println("A �rea da circunfer�ncia � de " +operar);
	}else if ( escolha ==2) {
		operar = 2* Math.PI * raio;
		System.out.println("O per�metro da circunfer�ncia e de " +operar);
	}else {
		System.out.println("Escolha um n�mero v�lido (1 ou 2)!");
	}
	
	
	
	
	
	
}
}

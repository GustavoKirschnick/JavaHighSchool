/*5 - Faça um programa que lê dois valores, o primeiro servindo de indicador de
operação e o segundo correspondendo ao raio de uma circunferência. Caso o
primeiro valor lido seja igual a 1, calcular e imprimir a área desta circunferência
(3,14*raio²). Se o valor lido for 2, calcular e imprimir o perímetro da circunferência
(2*3,14*raio). E se o valor lido for diferente destes dois valores, imprimir uma
mensagem dizendo que o indicador de operação foi mal fornecido. 
 */

package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double raio;
	double escolha;
	double operar;
	
	System.out.println("Informe o valor do raio da circunferência");
	raio = Double.parseDouble(in.nextLine());
	
	System.out.println("Pressione 1 para calcular a área e 2 para calcular o perímetro da circunferência");
	escolha = Double.parseDouble(in.nextLine());
	
	if(escolha == 1) {
		operar = Math.PI * Math.pow(raio,2);
		System.out.println("A área da circunferência é de " +operar);
	}else if ( escolha ==2) {
		operar = 2* Math.PI * raio;
		System.out.println("O perímetro da circunferência e de " +operar);
	}else {
		System.out.println("Escolha um número válido (1 ou 2)!");
	}
	
	
	
	
	
	
}
}

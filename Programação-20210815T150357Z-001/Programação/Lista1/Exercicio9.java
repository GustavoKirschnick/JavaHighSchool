/*9 - Faça um algoritmo para calcular e exibir um salário 
 reajustado em 23,75%. O salário atual deve ser fornecido pelo usuário.
 */
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio9 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double salarioAtual;
	double novoSalario;
	
	System.out.println("Qual o valor de seu atual salário: ");
	salarioAtual = Double.parseDouble(in.nextLine());
	
	novoSalario = salarioAtual + salarioAtual * 2345/10000;
	
	System.out.println("seu novo salário será de: " + novoSalario);
	
	
	
	
	
	
	
}	

}

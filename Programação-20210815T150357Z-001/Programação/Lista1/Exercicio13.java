/*13 - Fa�a um algoritmo que receba do usu�rio uma quantidade 
 * de chuva dada em polegadas e 
 * exiba o equivalente em mil�metros (25,4 mm = 1 polegada).
 */
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio13 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double valorEmPolegadas;
	double valorEmMm;
	
	System.out.println("Insira o valor, em polegadas,: " );
	valorEmPolegadas = Double.parseDouble(in.nextLine());
	
	valorEmMm = valorEmPolegadas * 25.4;
	
	System.out.println("O valor, em mm, ser� de: " + valorEmMm);
	
	
	
}
}

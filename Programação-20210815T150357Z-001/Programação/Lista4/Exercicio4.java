/*4 - Escrever um algoritmo que lê um valor N inteiro e positivo e que calcula e
escreve o valor de E:
E = 1 + 1 / 1 + 1 / 2 + 1 / 3 + 1 / N!
 * 
 */
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
    double n;
    double e;
    
    System.out.println("Insira o valor de N: ");
    n = Double.parseDouble(in.nextLine());
    
    e =  1 + 1 / 1 + 1 / 2 + 1 / 3 + 1 / n;

	System.out.println("O valor de E é: " + e);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
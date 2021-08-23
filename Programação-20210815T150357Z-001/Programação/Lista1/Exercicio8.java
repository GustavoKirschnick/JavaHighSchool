/*8 – Faça um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e
 * escrever o valor correspondente em graus Celsius ( C=(F-32)/1.8). 
 */
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio8 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double fahrenheit;
	double celsius;
	
	System.out.println("Insira o valor em Fahrenheit: ");
	fahrenheit = Double.parseDouble(in.nextLine());
	
	celsius = (fahrenheit - 32)/ 1.8;
	
	System.out.println("O valor, em Celsius, será de:" + celsius);
	
	
	
}
}

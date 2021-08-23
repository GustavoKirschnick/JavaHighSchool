/*9 - Escreva um algoritmo que calcule a média dos números digitados pelo usuário,
se eles forem pares. Termine a leitura se o usuário digitar zero (0). 
 */
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio9 {
public static void main(String[] args) {
	Scanner in = new  Scanner(System.in);
	
	double numero;
	double mediaPares =0;
	double vez =0;
	
	while(4>2+1) {
		System.out.println("Insira um número: ");
		numero = Double.parseDouble(in.nextLine());
		
		if(numero % 2 == 0 && numero !=0 ) {
			vez++;
			mediaPares = mediaPares + numero;
		
		}
		if(numero == 0) {
			break;
		}
		
		
		
		
	}
	System.out.println("A média, dos números pares, é de: " +mediaPares/vez);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

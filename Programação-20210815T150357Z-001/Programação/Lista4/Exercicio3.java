/*3 � Fazer um programa que retorne quantos valores digitados pelo usu�rio s�o
negativos:
*/
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	
	double valor;
	int neg =0;
	
	while(2>1) {
		System.out.println("Digite os n�meros desejados: (Digite zero para finalizar)");
		valor = Double.parseDouble(in.nextLine());
		
		if(valor < 0) {
			neg++;
			
		}
		 if(valor == 0) {
			break; 
		 }
		
		}

	System.out.println("Voc� digitou " + neg + " valores negativos");
}

	
	
	
}


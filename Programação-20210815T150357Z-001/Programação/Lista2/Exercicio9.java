/* 9 - Fa�a um algoritmo que leia um n� inteiro e mostre uma mensagem 
 * indicando se este n�mero � par ou �mpar. Ex: se (x%2=0) �x � par�, 
se (x%2=1) �x � impar�
*/
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio9 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double valor;
	
	System.out.println("Insira um n�mero: ");
	valor = Double.parseDouble(in.nextLine());
	
	if(valor%2==0) {
		System.out.println("O n�mero � par");
	}else {
		System.out.println("O n�mero � �mpar");
	}
	
	
	
}
}

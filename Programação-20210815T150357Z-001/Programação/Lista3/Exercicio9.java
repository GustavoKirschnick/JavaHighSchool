/*9 - Construa um algoritmo que receba o c�digo de v�rios produtos e os classifique
de acordo com a tabela abaixo:
C�digo                      Classifica��o
1                      Alimento n�o perec�vel
2 a 4                    Alimento perec�vel
5 e 6                        Vestu�rio
   7                       Higiene pessoal
8 a 15              Limpeza e utens�lios dom�sticos
 * 
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio9 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int prod;
	
	System.out.println("Insira o c�digo do produto:  ");
	prod = Integer.parseInt(in.nextLine());
	
	if (prod == 1) {
		System.out.println("O produto � um alimento n�o perec�vel");
	}else if (prod>=2 && prod<= 4) {
		System.out.println("O produto � um alimento perec�vel");
	}else if (prod >= 5 && prod <=6) {
		System.out.println("O produto � uma pe�a de vestu�rio");
	}else if(prod ==7) {
		System.out.println("O produto � de higiene pessoal");
	}else if(prod>=8 && prod<=15) {
		System.out.println("O produto � de limpeza e utens�lios dom�sticos");
	}
	
}
}

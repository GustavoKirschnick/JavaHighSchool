/*9 - Construa um algoritmo que receba o código de vários produtos e os classifique
de acordo com a tabela abaixo:
Código                      Classificação
1                      Alimento não perecível
2 a 4                    Alimento perecível
5 e 6                        Vestuário
   7                       Higiene pessoal
8 a 15              Limpeza e utensílios domésticos
 * 
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio9 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int prod;
	
	System.out.println("Insira o código do produto:  ");
	prod = Integer.parseInt(in.nextLine());
	
	if (prod == 1) {
		System.out.println("O produto é um alimento não perecível");
	}else if (prod>=2 && prod<= 4) {
		System.out.println("O produto é um alimento perecível");
	}else if (prod >= 5 && prod <=6) {
		System.out.println("O produto é uma peça de vestuário");
	}else if(prod ==7) {
		System.out.println("O produto é de higiene pessoal");
	}else if(prod>=8 && prod<=15) {
		System.out.println("O produto é de limpeza e utensílios domésticos");
	}
	
}
}

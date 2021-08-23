//4 - Ler 2 valores e escrever o maior deles.
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double val1;
	double val2;
	
	System.out.println("Insira o primeiro valor: ");
	val1 = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o segundo valor: ");
	val2 = Double.parseDouble(in.nextLine());
	
	if(val1>val2){
		System.out.println("O maior valor é: " + val1);
	}else  {
			System.out.println("O maior valor é: " + val2);
	

	}
	
	
	
	
	
	
}
}

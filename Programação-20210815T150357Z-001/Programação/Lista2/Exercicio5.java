//5 - Ler 2 valores e escrevê-los em ordem crescente.
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double valor1;
		double valor2;
		
		System.out.println("Digite o primeiro valor");
		valor1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o segundo valor");
		valor2 = Double.parseDouble(in.nextLine());
				
		if (valor1 > valor2) {
			System.out.println(+valor2+" , " +valor1);
		}else {
			System.out.println(+valor1+ " , " +valor2);
		}
	}
}

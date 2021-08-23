/* 7 - Ler 3 valores e escrever a soma dos 2 maiores (Considerando valores
distintos). */
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio7 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double valor1;
	double valor2;
	double valor3;
	
	System.out.println("Insira o primeiro valor: ");
	valor1 = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o segundo  valor: ");
	valor2 = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o terceiro valor: ");
	valor3 = Double.parseDouble(in.nextLine());
	
	if (valor1 < valor2 && valor1 < valor3){
		System.out.println("A soma dos 2 maiores valores será de: " + (valor2 + valor3));
	}else if (valor2<valor3 && valor2<valor1) {
		System.out.println("A soma dos 2 maiores valores será de: " + (valor1+valor3));
	}else {
		System.out.println("A soma dos 2 maiores valores será de: " + (valor1 + valor2));
	}
	
	
	
}
}

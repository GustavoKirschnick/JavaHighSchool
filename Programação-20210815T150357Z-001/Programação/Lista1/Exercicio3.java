/* 3 – Faça um algoritmo para calcular a área superficial de uma esfera 
(4*pi*r^2) */


package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double area;
		double numero;
		numero = 2;
		
		
		System.out.println("Qual o valor do raio: ");
		raio = Double.parseDouble(in.nextLine());
		
		
		area = 4 * Math.PI * Math.pow(raio,numero);
		
		System.out.println("A área é de: " + area);
			
	}

}



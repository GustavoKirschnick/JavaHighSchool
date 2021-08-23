//2 – Faça um algoritmo para calcular a área de um cubo retangular ((h*l)+(h*b)+(l*b))*2




package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
	Scanner in =  new Scanner(System.in);
	
	double altura;
	double largura;
	double base;
	double area;
	
	System.out.println("Qual o valor da altura do cubo retangular: ");
	altura = Double.parseDouble(in.nextLine());
	
	System.out.println("Qual o valor da largura do cubo retangular: ");
	largura = Double.parseDouble(in.nextLine());
	
	System.out.println("Qual o valor da base do cubo retangular: ");
	base = Double.parseDouble(in.nextLine());
	
	area = ((altura *largura )+(altura *base)+(largura * base))*2;
	
			System.out.println("A área do cubo retangular é:" + area);
			
	
	
	
	
	
	
	
	
}
}

/* 11. Faça um programa que receba um valor qualquer, ao usuário digitar 1
converta para m2
, ao usuário digitar 2, converta para m3
*/
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio11 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double valor;
	double escolha;
	double resultado;
	
	System.out.println("Insira o valor numérico: ");
	valor = Double.parseDouble(in.nextLine());
	
	System.out.println("Para transformar em metros ao quadrado, digite 1. Para transformar em metros cúbicos, digite 2");
	escolha = Double.parseDouble(in.nextLine());
	
	if(escolha == 1) {
	resultado = valor/1000;
	System.out.println(+resultado + "m²");
	} else if(escolha == 2) {
	resultado = valor/1000000;
	System.out.println(+resultado + "m³");
		
	}
}
}

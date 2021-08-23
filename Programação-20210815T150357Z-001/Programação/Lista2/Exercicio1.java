//1 – Ler um valor e escrever se é positivo, negativo ou zero.

package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double valor;
	
	System.out.println("Insira o valor numérico: ");
	valor = Double.parseDouble(in.nextLine());
	
	if(valor < 0) {
		System.out.println("Esse número é negativo!");
	} else if (valor > 0) {
		System.out.println("Esse valor é positivo!");
	} else {
		System.out.println("Esse valor é nulo!");
	}
}
}

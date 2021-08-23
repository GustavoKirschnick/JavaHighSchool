

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double raio;
	double altura;
	double area;
	
	System.out.println("Qual o valor do raio: ");
	raio = Double.parseDouble(in.nextLine());
	
	System.out.println("Qual o valor da altura: ");
	altura = Double.parseDouble(in.nextLine());
	
	area = Math.PI * raio * altura;
	
	
	System.out.println("A �rea do cone ser� de: " + area);
	
	
	
}
}

/*12 - Fa�a um algoritmo que calcule a m�dia de quatro n�meros inteiros.
Os n�meros devem ser dados pelo usu�rio*/

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio12 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double valor1;
	double valor2;
	double valor3;
	double valor4;
	double mediaValor;
	
	System.out.println("Insira o primeiro valor: ");
	valor1 = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o segundo valor: ");
	valor2 = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o terceiro valor: ");
	valor3 = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o quarto valor: ");
	valor4 = Double.parseDouble(in.nextLine());
	
	mediaValor = (valor1 + valor2 + valor3 + valor4)/4;
	
	System.out.println("A m�dia ser� de: " + mediaValor);
	
	
}
}

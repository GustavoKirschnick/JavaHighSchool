////1 – Fazer um programa que imprima os números múltiplos de 10 até 1000:
package br.edu.ifcvideira.Lista4;

public class Exercicio1segundamaneira {
public static void main(String[] args) {
	
	for(int num = 0; num<=1000; num++)
	{
		if(num % 10 == 0) {
			System.out.println(num);
		}
	}
}
}

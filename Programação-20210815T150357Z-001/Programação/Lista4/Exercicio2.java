/*
 *  2 � Fazer um programa que calcule a tabuada de qualquer n�mero, e o limite de
 c�lculo deve ser definido pelo usu�rio:
 */


package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	
	double tabnumero;
	double limite;
	double num = 0;
	System.out.println("Insira o limite");
	limite = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira a o n�mero que voc� gostaria de saber a tabuada");
	tabnumero = Double.parseDouble(in.nextLine());
	
	
	while(num < limite) {
		num++;
		System.out.println("O " +num + " X " +tabnumero+ " = "+ num*tabnumero );
		
	}
	
	
	
}
}

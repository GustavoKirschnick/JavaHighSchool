/*5 - João tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10
metro e cresce 3 centímetros por ano. Construa um algoritmo que calcule e
imprima quantos anos serão necessários para que Zé seja maior que João.
 */
package br.edu.ifcvideira.Lista4;

public class Exercicio5 {
public static void main(String[] args) {
	
	double altJoao =1.50;
	double altZe = 1.10; 
	double anos =0;
	
	
	while(altJoao>altZe) {
		altJoao+=0.20;
		altZe+=0.30;
		
		anos++;
		
		if(altZe>altJoao) {
			System.out.println("Demorou " + anos + " para Zé ficar maior do que João.");
					
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}

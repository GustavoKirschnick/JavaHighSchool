/*5 - Jo�o tem 1,50 metro e cresce 2 cent�metros por ano, enquanto Z� tem 1,10
metro e cresce 3 cent�metros por ano. Construa um algoritmo que calcule e
imprima quantos anos ser�o necess�rios para que Z� seja maior que Jo�o.
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
			System.out.println("Demorou " + anos + " para Z� ficar maior do que Jo�o.");
					
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}

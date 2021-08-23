/*6 - Escreva um algoritmo que leia um número n (número de termos de uma
progressão aritmética), a1 ( o primeiro termo da progressão) e r (a razão da
progressão) e escreva os n termos desta progressão, bem como a soma dos
elementos. 
 */
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double n;
	double a1;
	double r;
	double an = 0;
	double soma =0;
	
	System.out.println("Insira a razão da PA");
	r = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o número de n termos da PA");
	n = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o primeiro termo da PA");
    a1 = Double.parseDouble(in.nextLine());
    
    while(an < n) {
    	soma += a1;
    	System.out.println(+a1);
    	a1 += r;
    	an++;
    }
    System.out.println("A soma é de: " +soma);
    




}

}

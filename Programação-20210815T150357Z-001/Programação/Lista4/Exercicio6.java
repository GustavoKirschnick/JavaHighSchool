/*6 - Escreva um algoritmo que leia um n�mero n (n�mero de termos de uma
progress�o aritm�tica), a1 ( o primeiro termo da progress�o) e r (a raz�o da
progress�o) e escreva os n termos desta progress�o, bem como a soma dos
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
	
	System.out.println("Insira a raz�o da PA");
	r = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o n�mero de n termos da PA");
	n = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o primeiro termo da PA");
    a1 = Double.parseDouble(in.nextLine());
    
    while(an < n) {
    	soma += a1;
    	System.out.println(+a1);
    	a1 += r;
    	an++;
    }
    System.out.println("A soma � de: " +soma);
    




}

}

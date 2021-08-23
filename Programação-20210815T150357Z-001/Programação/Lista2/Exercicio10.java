/*10. Leia quantos gols o TIME A marcou em uma partida e leia quantos 
 * gols o TIME B marcou. Escrever o nome do vencedor. Caso não haja 
 * vencedor deverá ser impressa a palavra EMPATE
 */
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio10 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double golsTimeA;
	double golsTimeB;
	
	System.out.println("Insira o número de gols do Time A: ");
	golsTimeA = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o número de gols do time B: ");
	golsTimeB = Double.parseDouble(in.nextLine());
	
	if(golsTimeA > golsTimeB) {
		System.out.println("O Time A é o vencedor");
	}else if(golsTimeA < golsTimeB) {
		System.out.println("O Time B é o vencedor");
	}else {
			System.out.println("Ocorreu um empate!");
	}
	
	
	
	
	
	
}
}

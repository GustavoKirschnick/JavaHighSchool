/*15 - Faça um algoritmo que leia o nome de um piloto, leia a distância 
 * percorrida em km e o tempo que o piloto levou para percorrê-la 
 * (em horas). O algoritmo deve calcular a velocidade média 
 * (velocidade = distancia / tempo) - em km/h, e exibir a seguinte frase:
A velocidade média do <nome do piloto> foi <velocidade media calculada> 
km/h.
 */
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio15 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double distanciaEmKm;
	double tempoHoras;
	double velocidadeMedia;
	String nomePiloto;
	
	System.out.println("Insira a distância, em km, percorrida pelo piloto: ");
	distanciaEmKm = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o tempo, em horas : ");
	tempoHoras = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o nome do piloto: ");
	nomePiloto = String.valueOf(in.nextLine());
	
	velocidadeMedia = distanciaEmKm / tempoHoras;
	
	System.out.println("A velocidade média de " + nomePiloto + " foi de :" + velocidadeMedia +"Km/h");
	
	
}
}

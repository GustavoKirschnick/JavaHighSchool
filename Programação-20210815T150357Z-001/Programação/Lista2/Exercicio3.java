/*3 - Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma
mensagem que diga se ela poderá ou não votar este ano (não é necessário
considerar o mês em que a pessoa nasceu). */
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double anoAtual;
	double anoNascimento;
	double voto;
	
	System.out.println("Insira seu ano de nascimento: ");
	anoNascimento = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o ano atual : ");
	anoAtual = Double.parseDouble(in.nextLine());
	
	voto = (anoAtual - anoNascimento);
	
	if(voto >= 16) {
		System.out.println("Parabéns! Vote com consciência!");
	} else {
		System.out.println("Aguarde para votar");
	}
	
	
}
}

/*2 - Elabore um algoritmo que efetue a leitura do nome e do sexo de uma pessoa
(pode ser o número 1 para masculino, 2 para feminino), apresentando como saída
uma das seguintes mensagens: “Excelentíssimo Sr.”, para o sexo informado como
masculino, ou a mensagem “Excelentíssima Sra.”, para o sexo informado como
feminino. Apresente também o nome da pessoa.
 * 
 * 
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	String nome;
	double escolha;
	
	System.out.println("Insira seu nome: ");
	nome = String.valueOf(in.nextLine());
	
	System.out.println("Aperte 1 para gênero masculino e 2 para gênero feminino");
	escolha = Double.parseDouble(in.nextLine());
	
	if(escolha == 1) {
		System.out.println("Excelentíssimo Sr. " + nome + ".");
	} else if (escolha ==2) {
		System.out.println("Excelentíssima Sra. " + nome + ".");
	}else {
		System.out.println("Insira um número válido");
	}
	
	
}
}

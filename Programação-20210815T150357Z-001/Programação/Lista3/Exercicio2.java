/*2 - Elabore um algoritmo que efetue a leitura do nome e do sexo de uma pessoa
(pode ser o n�mero 1 para masculino, 2 para feminino), apresentando como sa�da
uma das seguintes mensagens: �Excelent�ssimo Sr.�, para o sexo informado como
masculino, ou a mensagem �Excelent�ssima Sra.�, para o sexo informado como
feminino. Apresente tamb�m o nome da pessoa.
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
	
	System.out.println("Aperte 1 para g�nero masculino e 2 para g�nero feminino");
	escolha = Double.parseDouble(in.nextLine());
	
	if(escolha == 1) {
		System.out.println("Excelent�ssimo Sr. " + nome + ".");
	} else if (escolha ==2) {
		System.out.println("Excelent�ssima Sra. " + nome + ".");
	}else {
		System.out.println("Insira um n�mero v�lido");
	}
	
	
}
}

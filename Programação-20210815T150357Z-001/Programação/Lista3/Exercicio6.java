/*6 - Uma loja fornece 5% de desconto para funcionários e 10% de desconto para
clientes especiais. Faça um programa que calcule o valor total a ser pago por uma
pessoa. O programa deverá ler o valor total da compra efetuada e um código que
identifique se o comprador é um cliente comum ou um dos dois tipos de clientes
que recebem desconto. Utilize 1 para funcionário, 2 para cliente especial e
qualquer outro valor é cliente comum.
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double valor;
	double escolha;
	double valorComDesconto;
	
	System.out.println("Insira o valor da compra ");
	valor = Double.parseDouble(in.nextLine());
	
	System.out.println("Pressione 0 caso você seja um cliente comum, 1 para funcionários e 2 para clientes especiais ");
	escolha = Double.parseDouble(in.nextLine());
	
	if(escolha == 0) {
		System.out.println("O subtotal da compra é de: " +valor);
	}else if (escolha == 1) {
		valorComDesconto = valor - (valor * 5/100);
		System.out.println("O subtotal da compra é de: " +valorComDesconto );
	}else if (escolha == 2) {
		valorComDesconto =(valor) - (valor * 10/100);
		System.out.println("O subtotal da compra é de: " +valorComDesconto );
	}else {
		System.out.println("Erro!");
	}
		
	
}
}

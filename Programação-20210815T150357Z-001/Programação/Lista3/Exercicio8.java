/*8 - A partir do pre�o � vista de um determinado produto, calcular o pre�o total a
pagar e o valor da presta��o mensal, referentes ao pagamento parcelado. Se o
pagamento for parcelado em tr�s vezes dever� ser dado um acr�scimo de 10% no
total a ser pago. Se for parcelado em 5 vezes, o acr�scimo � de 20%.
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio8 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double preco;
	double escolha;
	double novoPreco;
	double parcela;
	
	System.out.println("Insira o valor do pre�o do produto: ");
	preco = Double.parseDouble(in.nextLine());
	

	System.out.println("Pressione 1 para parcelar em tr�s vezes, 2 para parcelar em cinco vezes");
    escolha = Double.parseDouble(in.nextLine());
    
    if(escolha == 1) {
    	novoPreco = preco + (preco* 10/100);
    	parcela = novoPreco/3;
    	System.out.println("O pre�o de cada parcela ser� de: " +parcela);
    }else if(escolha == 2) {
    	novoPreco = preco + (preco*20/100);
    	parcela = novoPreco/5;
    	System.out.println("O pre�o de cada parcela ser� de: " +parcela);
    }
		


}
}

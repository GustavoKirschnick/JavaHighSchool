/*8 - A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando
dados sobre o número de filhos e salário. A prefeitura deseja saber:
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$1000,00.
O final da leitura de dados se dará com a entrada de um salário negativo. 
 * 
 */
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio8 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int filhos = 0;
	double salarios;
	double maiorSalario =0;
	double percentualInf =0;
	double medSalarios =0;
	double medFilhos=0;
	double numPessoas =0;
	
	
	while(2>1) {
		System.out.println("Insira o número de filhos: ");
		filhos= Integer.parseInt(in.nextLine());
		
		System.out.println("Insira o valor de seu salário: ");
		salarios = Double.parseDouble(in.nextLine());
		
		
		
		medSalarios += salarios;
		medFilhos += filhos;
		
		
		if(maiorSalario < salarios) {
			maiorSalario = salarios;
		}
		
		if(salarios<1000) {
			percentualInf++;
		}
		
		
		
		
		
		
		
		
		
		if(salarios<0) {
			break;
		}
	numPessoas++;
	
	}
	
	System.out.println("A média de salários da população é de: " +medSalarios);
	System.out.println("A média de filhos, por habitante, é de:" +medFilhos) ;
	System.out.println("0 maior salário é de: " +maiorSalario);
	System.out.println("O percentual de pessoas com salário de até 1000R$ é de: " +percentualInf);
	System.out.println("O número de pessoas as quais responderam essa pesquisa é de: " +numPessoas);
}
}

/*8 - A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando
dados sobre o n�mero de filhos e sal�rio. A prefeitura deseja saber:
a) m�dia do sal�rio da popula��o;
b) m�dia do n�mero de filhos;
c) maior sal�rio;
d) percentual de pessoas com sal�rio at� R$1000,00.
O final da leitura de dados se dar� com a entrada de um sal�rio negativo. 
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
		System.out.println("Insira o n�mero de filhos: ");
		filhos= Integer.parseInt(in.nextLine());
		
		System.out.println("Insira o valor de seu sal�rio: ");
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
	
	System.out.println("A m�dia de sal�rios da popula��o � de: " +medSalarios);
	System.out.println("A m�dia de filhos, por habitante, � de:" +medFilhos) ;
	System.out.println("0 maior sal�rio � de: " +maiorSalario);
	System.out.println("O percentual de pessoas com sal�rio de at� 1000R$ � de: " +percentualInf);
	System.out.println("O n�mero de pessoas as quais responderam essa pesquisa � de: " +numPessoas);
}
}

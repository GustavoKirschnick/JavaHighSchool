/*7 - Em uma eleição presidencial existem quatro candidatos. Os votos são
informados através de códigos. Os dados utilizados para a contagem dos votos
obedecem à seguinte codificação:
- 1,2,3,4 = voto para os respectivos candidatos;
- 5 = voto nulo;
- 6 = voto em branco;
Elabore um algoritmo que leia o código do candidato em um voto. Calcule e
escreva:
- total de votos para cada candidato;
- total de votos nulos;
- total de votos em branco;
Como finalizador do conjunto de votos, tem-se o valor 0.
 * 
 * 
 * 
 * 
 */
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio7 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int escolha;
	double c1 = 0;
	double c2 = 0;
	double c3 = 0;
	double c4 = 0;
	double v5 = 0;
	double v6 = 0;
	
	while(2>1) {
	System.out.println("Escolha a opção de voto abaixo: \n"
			+ "1 - Candidato 1 \n"
			+ "2 - Candidato 2 \n"
			+ "3 - Candidato 3 \n"
			+ "4 - Candidato 4 \n"
			+ "5 - Voto nulo   \n"
			+ "6 - Voto banco  \n"
			);
	escolha = Integer.parseInt(in.nextLine());
	
	if(escolha == 1) {
		c1++;
	}
	if(escolha == 2) {
		c2++;
	}
	if(escolha == 3) {
		c3++;
	}
	if(escolha == 4) {
		c4++;
	}
	if(escolha == 5) {
		v5++;
	}
	if(escolha == 6) {
		v6++;
	}
	
	
	if(escolha == 0) {
		break;
	}
	
	}
	
	System.out.println("O Candidato 1 recebeu " +c1+ " votos.");
	System.out.println("O Candidato 2 recebeu " +c2+ " votos.");
	System.out.println("O Candidato 3 recebeu " +c3+ " votos.");
	System.out.println("O Candidato 4 recebeu " +c4+ " votos.");
	System.out.println("Foram contabilizados  " +v5+ " votos nulos.");
	System.out.println("Foram contabilizados  " +v6+ " votos brancos.");
	
	
	
	
	
}
}

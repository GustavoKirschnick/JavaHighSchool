/*7 - Dados os nomes de 5 municípios de uma região e suas temperaturas médias,
emitir o seguinte relatório:
 a) temperatura média da região;
 b) número de municípios com temperatura média inferior a 10ºC;
 c) nome dos municípios que apresentam temperatura média superior a 30ºC.
 * 
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio7 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	String c1;
	String c2;
	String c3;
	String c4;
	String c5;
	
	double tc1;
	double tc2;
	double tc3;
	double tc4;
	double tc5;
	double tmc;
	
	int munTempInf=0;
	int munTempSup=0;
	
	System.out.println("Insira o nome da primeira cidade : ");
	c1 = String.valueOf(in.nextLine());
	System.out.println("Insira a temperatura média da primeira cidade: ");
	tc1 = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o nome da segunda cidade : ");
	c2 = String.valueOf(in.nextLine());
	System.out.println("Insira a temperatura média da segunda cidade: ");
	tc2 = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o nome da terceira cidade : ");
	c3 = String.valueOf(in.nextLine());
	System.out.println("Insira a temperatura média da terceira cidade: ");
	tc3 = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o nome da quarta cidade : ");
	c4 = String.valueOf(in.nextLine());
	System.out.println("Insira a temperatura média da quarta cidade: ");
	tc4 = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o nome da quinta cidade : ");
	c5 = String.valueOf(in.nextLine());
	System.out.println("Insira a temperatura média da quinta cidade: ");
	tc5 = Double.parseDouble(in.nextLine());
	
	tmc = (tc1 + tc2 + tc3 +tc4 + tc5) /5;
	System.out.println("A média de temperatura das cinco cidades é de: " +tmc); 
	
	
	
	if (tc1 < 10) {
		munTempInf++;
	}
	if (tc2 < 10) {
		munTempInf++;
	}
	if (tc3 < 10) {
		munTempInf++;
	}
	if (tc4 < 10) {
		munTempInf++;
	}
	if (tc5 < 10) {
		munTempInf++;
	}
	System.out.println("O número de municípios com temperatura inferior à 10ºC é de: " +munTempInf);
	System.out.println("O número de municípios com temperatura superior à 30ºC é de: ");
	if(tc1>30) {
		System.out.println(c1);
	}
	if(tc2>30) {
		System.out.println(c2);
	}
	if(tc3>30) {
		System.out.println(c3);
	}
	if(tc4>30) {
		System.out.println(c4);
	}
	if(tc5>30) {
		System.out.println(c5);
	}
	
	
	
	
	in.close();
}
}

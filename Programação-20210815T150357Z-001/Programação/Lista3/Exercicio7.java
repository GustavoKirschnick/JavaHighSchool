/*7 - Dados os nomes de 5 munic�pios de uma regi�o e suas temperaturas m�dias,
emitir o seguinte relat�rio:
 a) temperatura m�dia da regi�o;
 b) n�mero de munic�pios com temperatura m�dia inferior a 10�C;
 c) nome dos munic�pios que apresentam temperatura m�dia superior a 30�C.
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
	System.out.println("Insira a temperatura m�dia da primeira cidade: ");
	tc1 = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o nome da segunda cidade : ");
	c2 = String.valueOf(in.nextLine());
	System.out.println("Insira a temperatura m�dia da segunda cidade: ");
	tc2 = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o nome da terceira cidade : ");
	c3 = String.valueOf(in.nextLine());
	System.out.println("Insira a temperatura m�dia da terceira cidade: ");
	tc3 = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o nome da quarta cidade : ");
	c4 = String.valueOf(in.nextLine());
	System.out.println("Insira a temperatura m�dia da quarta cidade: ");
	tc4 = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o nome da quinta cidade : ");
	c5 = String.valueOf(in.nextLine());
	System.out.println("Insira a temperatura m�dia da quinta cidade: ");
	tc5 = Double.parseDouble(in.nextLine());
	
	tmc = (tc1 + tc2 + tc3 +tc4 + tc5) /5;
	System.out.println("A m�dia de temperatura das cinco cidades � de: " +tmc); 
	
	
	
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
	System.out.println("O n�mero de munic�pios com temperatura inferior � 10�C � de: " +munTempInf);
	System.out.println("O n�mero de munic�pios com temperatura superior � 30�C � de: ");
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

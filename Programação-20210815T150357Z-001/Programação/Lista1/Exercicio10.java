/*10 - Fa�a um algoritmo para calcular e exibir do sal�rio l�quido de
um professor, onde o n�mero de horas, o valor da hora e o percentual 
do INSS devem ser fornecidos pelo usu�rio:
salario_bruto <- num_hora_aula * valor_hora_aula 
salario_liquido <- salario_bruto � (salario_bruto * percentual_INSS).  
 */
package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio10 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double hora;
	double valorHora;
	double percentualInss;
	double salarioBruto;
	double salarioLiquido;
	
	System.out.println("Insira o n�mero de horas trabalhadas: ");
	hora = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o valor da hora: ");
	valorHora = Double.parseDouble(in.nextLine());
	
	System.out.println("Insira o percentual do INSS: ");
	percentualInss = Double.parseDouble(in.nextLine());
	
	salarioBruto = hora * valorHora;
	
	salarioLiquido = salarioBruto - (salarioBruto * percentualInss/100);
	
	System.out.println("O sal�rio liquido do professor � de: " + salarioLiquido);
	
	
	
	
	
	
}
}

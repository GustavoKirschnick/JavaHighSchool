/*10 – (Prensa hidráulica) Faça um programa que o usuário escolha o que deseja
calcular, ao digitar 1 – seja calculada a força 1 (F1), ao digitar 2 – seja calculada a
força 2 (F2), ao digitar 3 – seja calculada a área 1 (A1), ao digitar 4 – seja calculada
a área 2 (A2). Fórmula base: F1/A1 = F2/A2.
 */
package br.edu.ifcvideira.Lista3;
import java.util.Scanner;
public class Exercicio10 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double f1;
	double a1;
	double f2;
	double a2;
	int escolha;
	
	
	System.out.println("Escolha a opção para calcular \n"
			+ "1. Força 1 \n"
			+ "2. Força 2 \n"
			+ "3. Area 1 \n"
			+ "4. Area 2");
	escolha = Integer.parseInt(in.nextLine());
	
	if(escolha == 1) {
		
		System.out.println("Digite a area 1");
		a1=Double.parseDouble(in.nextLine());
		System.out.println("Digite a força 2");
		f2=Double.parseDouble(in.nextLine());
		System.out.println("Digite a area 2");
		a2=Double.parseDouble(in.nextLine());
		
		f1= a1*(f2/a2);
		
		System.out.println("A força 1 é: "+f1);
	}else if(escolha == 2) {
		
		System.out.println("Digite a força 1");
		f1=Double.parseDouble(in.nextLine());
		System.out.println("Digite a area 1");
		a1=Double.parseDouble(in.nextLine());
		System.out.println("Digite a area 2");
		a2=Double.parseDouble(in.nextLine());
		
		f2= a2*(f1/a1);
		
		System.out.println("A força 2 é: "+f2);
	}else if(escolha == 3) {

		System.out.println("Digite a força 1");
		f1=Double.parseDouble(in.nextLine());
		System.out.println("Digite a força 2");
		f2=Double.parseDouble(in.nextLine());
		System.out.println("Digite a area 2");
		a2=Double.parseDouble(in.nextLine());
		
		a1= (f2/a2)/f1;
		
		System.out.println("A area 1 é: "+a1);
	}else if(escolha == 4) {

		System.out.println("Digite a força 1");
		f1=Double.parseDouble(in.nextLine());
		System.out.println("Digite a força 2");
		f2=Double.parseDouble(in.nextLine());
		System.out.println("Digite a area 1");
		a1=Double.parseDouble(in.nextLine());
		
		a2= (f1/a1)/f2;
		
		System.out.println("A area 2 é: "+a2);
	}
}

	
	
	
}


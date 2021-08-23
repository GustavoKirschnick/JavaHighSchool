package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio10 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
      double tI =0;
      double tF;
      double m;
      double l;
      double c;
      
      while(tI != -1000) {
    	  System.out.println("Informe a temperatura inicial: ");
    	  tI = Double.parseDouble(in.nextLine());
    	  
    	  if(tI == 0 || tI == 100){
    		  System.out.println("Forneça valor de massa, em Kg :");
    		  m = Double.parseDouble(in.nextLine());
    		  
    		  System.out.println("Forneça valor de calor latente, em J/Kg :");
    		  l = Double.parseDouble(in.nextLine());
    		  
    		  System.out.println("A quantidade de calor foi de: " + (m*l) + " Joules");
    	  }else if(tI == -1000) {
    		  break;
    	  }else {
    		  System.out.println("Forneça valor da massa, em Kg:");
    		  m = Double.parseDouble(in.nextLine());
    		  
    		  System.out.println("Forneça valor do calor específico, em J/ Kg* K");
    		  c = Double.parseDouble(in.nextLine());
    		  
    		  System.out.println("Insira a temperatura final, em ºC");
    		  tF = Double.parseDouble(in.nextLine());
    		  
    		  System.out.println("A quantidade de calor é de: " + (m*c*(tF-tI)));
    		  
    		  
    	  }
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      }























}
}

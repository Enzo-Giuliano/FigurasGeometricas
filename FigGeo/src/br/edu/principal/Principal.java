package br.edu.principal;

import br.edu.figurasgeometricasplanas.*;
import br.edu.figurasgeometricasespaciais.*;
import java.util.Scanner;

public class Principal {
		
	public static void main(String[] args) {
		
		byte escolhatip = 0;
		String repet;
		byte stop = 1;
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Deseja fazer cálculo de: \n1. Figura Plana\n2. Figura Espacial\n");
	    escolhatip = sc.nextByte();
	   	
		if (escolhatip == 1) {
			MenuPlanas mp = new MenuPlanas();
			mp.FigsPlanas();
		}
		
		if (escolhatip == 2) {
		    MenuEspaciais me = new MenuEspaciais();
		    me.FigEspaciais();
	    }
		
		while (stop == 1) {
			System.out.println("\nDeseja utilizar o programa novamente (S/N)?\n");
			repet = sc.next().toUpperCase();
			if (repet.equals("S")) {
				System.out.println("\nDeseja fazer cálculo de: \n1. Figura Plana\n2. Figura Espacial\n");
			    escolhatip = sc.nextByte();
			   	
				if (escolhatip == 1) {
					MenuPlanas mp = new MenuPlanas();
					mp.FigsPlanas();
				}
				
				if (escolhatip == 2) {
				    MenuEspaciais me = new MenuEspaciais();
				    me.FigEspaciais();
			    }
			}
			else {
				System.out.println("\nObrigado por usar o programa!");
				stop = 0;
			}
		}
   
    }
}
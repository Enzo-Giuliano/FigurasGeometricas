package br.edu.figurasgeometricasplanas;

import java.util.Scanner;
import java.text.DecimalFormat;


public class MenuPlanas {
     
	
	double escolhafig;
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	
	
	public void FigsPlanas() {
		
		
		System.out.println("\nDeseja fazer cálculo da área de um: \n1. Triângulo\n2. Quadrado\n3. Circulo\n4. Trapézio\n5. Paralelogramo\n6. Losango\n7. Retângulo\n");
		escolhafig = sc.nextByte();
		
		if (escolhafig == 1) {		
		   Triangulo objTrian = new Triangulo();
		   
		   System.out.print("\nDigite a medida da base: ");
		   double x = sc.nextDouble();
		   objTrian.setBase(x);
		   
		   System.out.print("\nDigite a medida da altura: ");
		   x = sc.nextDouble();
		   objTrian.setAltura(x);
		   
		   objTrian.listaAtributos();
	       objTrian.calcArea1();  
	       
	       System.out.println("\nA área do triângulo vale: " + df.format(objTrian.getArea()));
		}
		
		if (escolhafig == 2) {
	       Quadrado objQuad = new Quadrado();
	       
	        System.out.print("\nDigite a medida do lado: ");
		    double x = sc.nextDouble();
	        objQuad.setLado(x);
	        objQuad.Valid(x);
	        
	        if (objQuad.lado > 0) {
	           objQuad.listaAtributos();
		       objQuad.CalcArea1();
		   
		    System.out.println("\nA área do quadrado vale: " + df.format(objQuad.getArea()));
		    }
		}
	        
		if (escolhafig == 3) {
		   Circulo objCirc = new Circulo();
		   
		   System.out.print("\nDigite a medida do raio: ");
		   double x = sc.nextDouble();
		   objCirc.setRaio(x);
		   
		   objCirc.listaAtributos();
		   objCirc.CalcArea1();
		   
		   System.out.println("\nA área do círculo vale: " + df.format(objCirc.getArea()));
		}
		
		if (escolhafig == 4) {		
           Trapezio objTrap = new Trapezio();
           
           System.out.print("\nDigite a medida da base menor: ");
   		   double x = sc.nextDouble();
   		   objTrap.setBaseMenor(x);
   		   
   		   System.out.print("\nDigite a medida da base maior: ");
   		   x = sc.nextDouble();
   		   objTrap.setBaseMaior(x);
   		   
   		   System.out.print("\nDigite a medida da altura: ");
   		   x = sc.nextDouble();
   		   objTrap.setAltura(x);
   		   
   		   objTrap.listaAtributos();
   		   objTrap.CalcArea1();
   		   
   		System.out.println("\nA área do trapézio vale: " + df.format(objTrap.getArea()));
		}
		
		if (escolhafig == 5) {	
		   Paralelogramo objParalel = new Paralelogramo();
		   
		   System.out.print("\nDigite a medida da base: ");
		   double x = sc.nextDouble();
		   objParalel.setBase(x);
		   
		   System.out.print("\nDigite a medida da altura: ");
		   x = sc.nextDouble();
		   objParalel.setAltura(x);
		   
		   objParalel.listaAtributos();
	       objParalel.CalcArea1();  
	       
	       System.out.println("\nA área do paralelogramo vale: " + df.format(objParalel.getArea())); 
		}
		
	    if (escolhafig == 6) {
	       Losango objLosan = new Losango();			
		   
	       System.out.print("\nDigite a medida da diagonal maior: ");
		   double x = sc.nextDouble();
		   objLosan.setDiagonalMaior(x);
		   
		   System.out.print("\nDigite a medida da diagonal menor: ");
		   x = sc.nextDouble();
		   objLosan.setDiagonalMenor(x);
		   
		   objLosan.listaAtributos();
	       objLosan.CalcArea1();  
	       
	       System.out.println("\nA área do losango vale: " + df.format(objLosan.getArea())); 
	    }
	    
		if (escolhafig == 7) {
	       Retangulo objRetan = new Retangulo();
		   
	       System.out.print("\nDigite a medida da base: ");
		   double x = sc.nextDouble();
		   objRetan.setBase(x);
		   
		   System.out.print("\nDigite a medida da altura: ");
		   x = sc.nextDouble();
		   objRetan.setAltura(x);
		   
		   objRetan.listaAtributos();
	       objRetan.CalcArea1();  
	       
	       System.out.println("\nA área do retângulo vale: " + df.format(objRetan.getArea())); 
		}
	}
}

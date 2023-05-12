package br.edu.figurasgeometricasespaciais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MenuEspaciais {

	
    byte escolhafig;
    byte escolhacalc;
  
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00"); 
	
	public void FigEspaciais() {
	  System.out.println("\nDeseja fazer cálculo de: \n\n1. Cubo\n2. Prisma\n3. Esfera\n4. Cilindro\n5. Tetraedro\n6. Cone\n7. Paralelepípedo\n8. Pirâmide\n");
	  escolhafig = sc.nextByte();
		
	 switch (escolhafig) {	
	   case 1:
		Cubo objCubo = new Cubo();
		
		System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Lateral\n2. Área Total\n3. Volume\n");	
		escolhacalc = sc.nextByte();
		
		System.out.print("\nDigite a medida do lado: ");
		double x = sc.nextDouble();
	    objCubo.setLado(x);
	    
	    objCubo.listaAtributos();
	    
		switch(escolhacalc) {
		  
		  case 1:
		    objCubo.CalcAreaLateral();
		    System.out.println("\nA área lateral do cubo vale: " + df.format(objCubo.getAreaLateral()));
		    break;
		  case 2:  
		    objCubo.CalcAreaTotal();
		    System.out.println("\nA área total do cubo vale: " + df.format(objCubo.getAreaTotal()));
		    break;
		  case 3:  
		    objCubo.CalcVolume();
		    System.out.println("\nO volume do cubo vale: " + df.format(objCubo.getVolume()));
		}
		break;
	 
	   case 2:
		Prisma objPrism = new Prisma();
		
		System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área da Base\n2. Área da Face\n3. Área Lateral\n4. Área Total\n5. Volume\n");	
		escolhacalc = sc.nextByte();
		
		System.out.print("\nDigite o valor da aresta da base: ");
		x = sc.nextDouble();
		objPrism.setArestaBase(x);
		
		switch (escolhacalc) {
		 case 1:
		   objPrism.calcAreaBase();
		   objPrism.listaAtributos();
		   System.out.println("\n\nA área da base do prisma vale: " + df.format(objPrism.getAreaBase()));
		   break;
		 case 2:  
		   System.out.print("\nDigite o valor da aresta lateral: ");
		   x = sc.nextDouble();
		   objPrism.setArestaLateral(x);
		   objPrism.calcAreaFace();
		   objPrism.listaAtributos();
		   System.out.println("\n\nA área da face do prisma vale: " + df.format(objPrism.getAreaFace()));
		   break;
		 case 3:  
		   System.out.print("\nDigite o valor da aresta lateral: ");
		   x = sc.nextDouble();
		   objPrism.setArestaLateral(x);
		   objPrism.calcAreaLateral();
		   objPrism.listaAtributos();
		   System.out.println("\n\nA área lateral do prisma vale: " + df.format(objPrism.getAreaLateral()));
		   break;
		 case 4:  
		   System.out.print("\nDigite o valor da aresta lateral: ");
		   x = sc.nextDouble();
	       objPrism.setArestaLateral(x);	 
		   objPrism.calcAreaTotal();
		   objPrism.listaAtributos();
		   System.out.println("\nA área total do prisma vale: " + df.format(objPrism.getAreaTotal()));
		   break;
		 case 5:
		   System.out.print("\n\nDigite o valor da altura do prisma: ");
		   x = sc.nextDouble();
		   objPrism.setAltura(x);
		   objPrism.calcVolume();
		   objPrism.listaAtributos();
		   System.out.println("\n\nO volume do prisma vale: " + df.format(objPrism.getVolume()));
		}
		break;
	 
	  case 3:
		Esfera objEsfera = new Esfera();
		
		System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Total\n2. Volume\n");	
	    escolhacalc = sc.nextByte();
	    
	    System.out.print("\nÁREA DA ESFERA\n\nDigite a medida do raio: ");
	    x = sc.nextDouble();
	    objEsfera.setRaio(x);
	    
	    objEsfera.listaAtributos();
		switch(escolhacalc) {
		 case 1:
		  objEsfera.calcAreaTotal();
		  System.out.println("\nA área total da esfera vale: " + df.format(objEsfera.getArea()));
		  break;
		 case 2:
		  objEsfera.calcVolume();
		  System.out.println("\nO volume da esfera vale: " + df.format(objEsfera.getVolume()));
		}
		break;
	 
	  case 4:	
      Cilindro objCilin = new Cilindro();
		
      System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Lateral\n2. Área Total\n3. Volume\n");	
	    escolhacalc = sc.nextByte();
	    
	    System.out.print("\nDigite a medida do raio: ");
		x = sc.nextDouble();
		objCilin.setRaio(x);
		
		System.out.print("\nDigite a medida da altura: ");
		x = sc.nextDouble();
		objCilin.setAltura(x);
		
		objCilin.listaAtributos();
		switch(escolhacalc) {
		  case 1:
			objCilin.calcAreaLateral();
			System.out.println("\nA área lateral da esfera vale: " + df.format(objCilin.getAreaLateral()));
		    break;
		  case 2:
			objCilin.calcAreaTotal();
			System.out.println("\nA área total da esfera vale: " + df.format(objCilin.getAreaTotal()));
		    break;
		  case 3:
			objCilin.calcVolume();
			System.out.println("\nA área total da esfera vale: " + df.format(objCilin.getVolume()));
		}
		break;
	 
	  case 5:	
          Tetraedro objTetra = new Tetraedro();
			
          System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Total\n2. Volume\n");	
		    escolhacalc = sc.nextByte();
		    
		    
		    System.out.print("\nDigite a medida da aresta da base: ");
			x = sc.nextDouble();
			objTetra.setArestaBase(x);
			objTetra.listaAtributos();
			
			switch(escolhacalc) {
			  case 1:
				objTetra.calcAreaTotal();
				System.out.println("\nA área total do tetraedro vale: " + df.format(objTetra.getAreaTotal()));
			    break;
			  case 2:
				objTetra.calcVolume();
				System.out.println("\nO volume do tetraedro vale: " + df.format(objTetra.getVolume()));
			    break;
			}
		 break;
	 
	  case 6:	
          Cone objCone = new Cone();
			
          System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Lateral\n2. Área Total\n3. Volume\n");	
		    escolhacalc = sc.nextByte();
		    
		    System.out.print("\nDigite a medida do raio: ");
			x = sc.nextDouble();
			objCone.setRaio(x);
			
			System.out.print("\nDigite a medida da altura: ");
			x = sc.nextDouble();
			objCone.setAltura(x);
			
			objCone.listaAtributos();
			
			switch(escolhacalc) {
			  case 1:
				objCone.calcAreaLateral();
				
				System.out.println("\nA área lateral do cone vale: " + df.format(objCone.getAreaLateral()));
			    break;
			  case 2:
				objCone.calcAreaTotal();
				System.out.println("\nA área total do cone vale: " + df.format(objCone.getAreaTotal()));
				break;
			  case 3:
				objCone.calcVolume();
				System.out.println("\nO volume do cone vale: " + df.format(objCone.getVolume()));
			}
			break;
	 
	  case 7:
		 Paralelepipedo objParallp = new Paralelepipedo();
		 
		    System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área da Base\n2. Área Lateral\n3. Área Total\n4. Diagonais\n5. Volume\n");	
			escolhacalc = sc.nextByte();
			
			System.out.print("\nDigite o valor da largura: ");
			x = sc.nextDouble();
			objParallp.setLargura(x);
			
			System.out.print("\nDigite o valor da comprimento: ");
			x = sc.nextDouble();
			objParallp.setComprim(x);
			
			System.out.print("\nDigite o valor da altura: ");
			x = sc.nextDouble();
			objParallp.setAltura(x);
			
			objParallp.listaAtributos();
			
			switch(escolhacalc) {
			  case 1:
			    objParallp.calcAreaBase();
			    System.out.println("\nA área da base do paralelepípedo vale: " + df.format(objParallp.getAreaBase()));
			    break;
			  case 2:  
			    objParallp.calcAreaLateral();
			    System.out.println("\nA área lateral do paralelepípedo vale: " + df.format(objParallp.getAreaLateral()));
			    break;
			  case 3:  
			    objParallp.calcAreaTotal();
			    System.out.println("\nA área total do paralelepípedo vale: " + df.format(objParallp.getAreaTotal()));
			    break;
			  case 4:
				objParallp.calcDiagonais();
				System.out.println("\nA diagonal do paralelepípedo vale: " + df.format(objParallp.getDiagonal()));
				break;
			  case 5:
			    objParallp.calcVolume();	
			    System.out.println("\nO volume do paralelepípedo vale: " + df.format(objParallp.getVolume()));
			}
			break;
	 
	  case 8:
		 Piramide objPiram = new Piramide();
		 
		 System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Total\n2. Volume\n");	
		 escolhacalc = sc.nextByte();
			
			System.out.print("\nDigite a medida da aresta da base: ");
			x = sc.nextDouble();
			objPiram.setArestaBase(x);
			
			switch(escolhacalc) {
			  case 1:
				System.out.print("\nDigite o valor do apótema da pirâmide: ");
				x = sc.nextDouble();
				objPiram.setApotema(x);
				objPiram.listaAtributos();
			    objPiram.calcAreaTotal();
			    System.out.println("\nA área total da pirâmide vale: " + df.format(objPiram.getAreaTotal()));
			    break;
			  case 2:  
			   System.out.print("\nDigite o valor da altura da pirâmide: ");
			   x = sc.nextDouble();
			   objPiram.setAltura(x);
			   objPiram.listaAtributos();
			   objPiram.calcVolume();
			   System.out.println("\nO volume da pirâmide vale: " + df.format(objPiram.getVolume()));
			}
		 
	 }
	 
	}	
	
}

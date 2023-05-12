package br.edu.figurasgeometricasplanas;

public class HerancaPlana {
     
	protected double area;
	
	public double getArea() {
		return area;
	}
	
	public void Valid(double x) {
		if (x <= 0) {
			System.out.println("\nValor Inválido");
		}
	}
	
	
}

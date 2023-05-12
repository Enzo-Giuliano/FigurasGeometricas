package br.edu.figurasgeometricasplanas;

public class Circulo extends HerancaPlana{
	private double raio;
	
	public void setRaio(double raio) {
		if (raio > 0) {
		  this.raio = raio;
		}
	}

	public void CalcArea1() {
		area = Math.PI * Math.pow(raio, 2);
	}
	
	public void CalcArea2(double r) {
		raio = r;
		area = Math.PI * Math.pow(raio, 2);
		System.out.println(area);
	}
	public double CalcArea3(double r) {
		raio = r;
		area = 3.14 * Math.pow(raio, 2);
		return area;
	}
	public void listaAtributos() {
		System.out.println("\nATRIBUTO\n\nraio: " + raio);
	
	}
	
}
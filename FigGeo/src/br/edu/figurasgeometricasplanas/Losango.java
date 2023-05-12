package br.edu.figurasgeometricasplanas;

public class Losango extends HerancaPlana{

	private double diagonalMaior;
	private double diagonalMenor;
	
	public double getDiagonalMaior() {
		return diagonalMaior;
	}

	public void setDiagonalMaior(double diagonalMaior) {
		if (diagonalMaior > 0) {
		this.diagonalMaior = diagonalMaior;
		}
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		if (diagonalMaior > 0) {
		this.diagonalMenor = diagonalMenor;
		}
	}

	public void CalcArea1() {
		area = diagonalMaior * diagonalMenor/2;
	}
	
	public void CalcArea2(double D, double d) {
		diagonalMaior = D;
		diagonalMenor = d;
		area = diagonalMaior * diagonalMenor/2;
		System.out.println(area);
	}
	public double CalcArea3(double D, double d) {
		diagonalMaior = D;
		diagonalMenor = d;
		area = diagonalMaior * diagonalMenor/2;
		return area;
	}
	
	
	public void listaAtributos() {
		System.out.println("\nATRIBUTOS \n\ndiagonal maior: " + getDiagonalMaior() + "\ndiagonal menor: " + getDiagonalMenor());
	
	}
	
}

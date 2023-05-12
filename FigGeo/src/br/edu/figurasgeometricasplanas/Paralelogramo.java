package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Paralelogramo extends HerancaPlana{

	Scanner sc = new Scanner(System.in);
	
	private double base;
	private double altura;
	
	public void CalcArea1() {
		area = base * altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if (base > 0) {
		this.base = base;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura > 0) {
		this.altura = altura;
		}
	}

	public void CalcArea2(double b, double h) {
		System.out.println("\nDigite a medida da base:");
		b = sc.nextDouble();
		System.out.println("Digite a medida da altura:");
		h = sc.nextDouble();
		area = b * h;
		System.out.println("\nÁREA = " + area);
	}
	public double CalcArea3(double b, double h) {
		base = b;
		altura = h;
		area = b * h;
		return area;
	}
	public void listaAtributos() {
		System.out.println("\nATRIBUTOS \n\nbase: " + getBase() + "\naltura: " + getAltura());
	
	}
	
}
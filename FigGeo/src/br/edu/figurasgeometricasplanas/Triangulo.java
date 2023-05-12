package br.edu.figurasgeometricasplanas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Triangulo extends HerancaPlana{
   
	private double base;
	private double altura;
	
	public void setBase(double base) {
		if (base > 0) {
		   this.base = base;
		}
	}

	public void setAltura(double altura) {
		if (altura > 0) {
			   this.altura = altura;
			}
	}
	
    DecimalFormat df = new DecimalFormat("0.00");
	Scanner sc = new Scanner(System.in);
	
	public void calcArea1() {
		area = (base * altura)/2;
	}
	
	public void calcArea2(double b, double h) {
		System.out.println("\nÁREA DO TRIÂNGULO\n\nDigite a medida da base: ");
		b = sc.nextDouble();
		System.out.println("Digite a medida da altura: ");
		h = sc.nextDouble();
		area = (b * h)/2;
		System.out.println(area);
	}
	
	public double calcArea3(double h, double b) {
		System.out.println("\nÁREA DO TRIÂNGULO\n\nDigite a medida da base: ");
		b = sc.nextDouble();
		System.out.println("Digite a medida da altura: ");
		h = sc.nextDouble();
		area = (b * h)/2;
		return area;
	}
	
	public double calcArea4() {
		System.out.println("\nÁREA DO TRIÂNGULO\n\nDigite a medida da base: ");
		base = sc.nextDouble();
		System.out.println("Digite a medida da altura: ");
		altura = sc.nextDouble();
		area = (base * altura)/2;
		return area;
	}

	public void listaAtributos() {
		System.out.println("\nATRIBUTOS \n\nbase: " + base + "\naltura: " + altura);
	
	}
}
package br.com.javalib.Geomath;

import java.text.DecimalFormat;

public class Circle {
	
	String pattern = "##.##";
	DecimalFormat decimalFormat = new DecimalFormat(pattern);
	private double raio;

	public Circle() {
		
	}
	
	public Circle(double r) {
		this.raio = r;
	}
	
	public void setRaio(double r) {
		this.raio = r;
	}
	
	public double getRaio() {
		return this.raio;
	}
	
	public double calculaArea() {
		return (Math.PI * (this.raio * this.raio));
	}
	
	public double calculaDiametro() {
		return this.raio * 2;
	}
	
	public double calculaCircunferencia() {
		return 2 * raio * Math.PI;
	}
	
	public String toString() {
		return "Area: " + decimalFormat.format(calculaArea()) + "\nDiametro: " + decimalFormat.format(calculaDiametro()) + "\nCircunferencia: " + decimalFormat.format(calculaCircunferencia());
  	}
	
}

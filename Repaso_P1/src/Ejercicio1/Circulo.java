package Ejercicio1;

import static java.lang.Math.pow;


public class Circulo {
	private final static double PI = 3.14;
	private double diametro = 14.2;
	private double h = 20;
	
	public double volumen(){
		return (PI*(pow(diametro/2,2)*h)/3);
	}
	
	public static void main(String[] args) {
		
		Circulo c = new Circulo();
		System.out.println("El volumen del cono es "+c.volumen());

	}

}

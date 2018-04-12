package Ejercicio6;

import static java.lang.Math.random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aleatorios {
	
	private static double num_aleatorio(int rango) {
		return random()*rango;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca un rango para el numero aleatorio (entero) : ");
		int rango = Integer.parseInt(teclado.readLine());
		double x=num_aleatorio(rango);
		System.out.println("El numero aleatorio es : "+ x);
	}

}

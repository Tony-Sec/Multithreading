package Ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_S {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Escriba un short: ");
		char c = (char) teclado.read();
		System.out.println("Escriba un short: ");
		short s = Short.parseShort(teclado.readLine());
		System.out.println("Escriba un int: ");
		int x = Integer.parseInt(teclado.readLine());
		System.out.println("Escriba un long: ");
		long l = Long.parseLong(teclado.readLine());
		System.out.println("Escriba un float: ");
		float f = Float.parseFloat(teclado.readLine());
		System.out.println("Escriba un double: ");
		double d = Double.parseDouble(teclado.readLine());
		System.out.println("Escriba un boleano: ");
		boolean b = Boolean.parseBoolean(teclado.readLine());
		System.out.println("Escriba un byte: ");
		byte by = Byte.parseByte(teclado.readLine());
		
		System.out.println("Escriba una cadena: ");
		String S = teclado.readLine();

	}

}

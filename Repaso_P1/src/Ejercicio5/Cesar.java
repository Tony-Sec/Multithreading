package Ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cesar {
	
	public static String cifrar_cadena(String str,int n) {
		
		char cad[] = new char [str.length()];
		cad = str.toCharArray();
		
		for(int i=0;i<str.length();++i) {
			cad [i] += n % 27;
			System.out.println("-------"+i+" :"+str.charAt(i)+" y cifrado es :" + cad[i]);
		}
		return String.valueOf(cad);
	}
	public static String descifrar_cadena(String str,int n) {
		char cad[]=new char [str.length()];
		cad = str.toCharArray();
		
		for(int i = 0;i<cad.length;++i) {
			cad[i] -=n % 27;
			System.out.println("-------"+i+" :"+str.charAt(i)+" y descifrado es :" + cad[i]);
		}
		return String.valueOf(cad);
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Introduzca cadena para cifrar: ");
		String str = teclado.readLine();
		System.out.println("Introduzca llave para cifrar: ");
		int n = Integer.parseInt(teclado.readLine());
		
		System.out.println("La cadena cifrada es: "+ cifrar_cadena(str,n));
		System.out.println("La cadena descifrada es: "+ descifrar_cadena(cifrar_cadena(str,n),n));
		
	}

}

package Ejercicio3;

import java.util.Scanner;
import static java.lang.Math.random;
import static java.lang.Math.sin;

public class intDefinidaMonteCarlo {
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el número de puntos para la aprox.");
		int puntos = teclado.nextInt();
		int op,cont = 0;
		double x,y;
		do {
			System.out.println("Qué función para calcular la integral definida [0-1]?\n"
					+ "1. f(x) = sin(x)\n"
					+ "2. f(x) = x");
			op = teclado.nextInt();
		}while(op>2);
		
		switch(op) {
			case 1:
				for(int i = 0;i < puntos;++i) {
					x = random();
					y = random();
					if(y<sin(x)) {
						cont ++;
					}
				}
				break;
			case 2:
				for(int i = 0;i < puntos;++i) {
					x = random();
					y = random();
					if(y< x) {
						cont ++;
					}
				}
				break;
				
		}
		double res = (double)cont/puntos;
		System.out.println("Los puntos que han quedado por debajo son: "+cont);
		System.out.println("La aproximacion es: "+res);
	}

}

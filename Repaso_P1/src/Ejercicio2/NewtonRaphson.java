package Ejercicio2;

import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;

import java.util.Scanner;

public class NewtonRaphson {
	
    public static double fun1 (double x){
        return (cos(x)-pow(x,3));
    }
    public static double der1 (double x){
        return (-sin(x) - 3*pow(x,2) );
    }
    public static double fun2 (double x){
        return (pow(x,2)-5);
    }
    public static double der2 (double x){
        return (2*x);
    }
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Aproximación Inicial x0?: ");
		double x = teclado.nextDouble();
		System.out.println("Número de Iteraciones? : ");
		int iter = teclado.nextInt();
        System.out.println("Para que funcion quiere hallar el punto de corte :");
        System.out.println("1. f(x) = cos(x) - x^3 \n2. f(x) = x^2 - 5");
		int opcion;
		
		do {
			opcion = teclado.nextInt();
			switch(opcion) {
			case 1:
				for(int i = 0;i< iter;++i) {
					x = x - fun1(x)/der1(x);
					System.out.println("La aproximacion para x"+i+"es: "+x);
				}
				break;
			case 2:
				for(int i = 0;i< iter;++i) {
					x = x - fun2(x)/der2(x);
					System.out.println("La aproximacion para x"+i+"es: "+x);
				}
				break;
			default:
				System.out.println("Introduzca una opción valida!!!");
			}
		}while(opcion>2);
	}

}

package Syn_Cap1;


import java.io.IOException;


public class Usa_Hilo_Syn {
	private static Hilo_Syn [] hilos; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		hilos = new Hilo_Syn[500];
		
		for(int i=0;i<500;++i) {
			hilos[i] = new Hilo_Syn();
		}
		
		for(int i=0;i<500;++i) {
			hilos[i].start();
		}
		
		try {
			for(int i=0;i<500;++i) {
				hilos[i].join();
			}
        } catch (InterruptedException ex) { // Join puede lanzar una excepción que aborte la ejecución del hilo.
        	Thread.currentThread().interrupt();
        }
		
		System.out.println("El valor de n es : "+Hilo_Syn.getN());
	}

}
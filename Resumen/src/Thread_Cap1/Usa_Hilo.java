package Thread_Cap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Usa_Hilo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Cuantas vueltas quieres que den los hilos?");
		int vueltas = Integer.parseInt(teclado.readLine());
		Hilo.setnVueltas(vueltas);
		
		Hilo h1 = new Hilo(1);
		Hilo h2 = new Hilo(2);
		
		h1.start();
		h2.start();
		
		try {
			h1.join();
			h2.join();
        } catch (InterruptedException ex) { // Join puede lanzar una excepción que aborte la ejecución del hilo.
        	Thread.currentThread().interrupt();
        }
		
		System.out.println("El valor de n es : "+Hilo.getN());
	}

}

package Runnable_Cap1;

public class Hilos_MainRunnable {
	
	
	public static void main(String[] args) {
		
		Runnable proceso1 = new Hilos_Runnable();
		Thread h1 = new Thread(proceso1);				//Thread h1 = new Thread(new Hilos_Runnable());
		//------------------------------------------
		Hilos_Runnable proceso2= new Hilos_Runnable();
		Thread h2 = new Thread(proceso2);				//Thread h2 = new Thread(new Hilos_Runnable());
		
		
		h1.start();
		
		h2.start();
		
		try {
			h1.join();
			h2.join();
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("El hilo se ha detenido ...");
		}
	}
}

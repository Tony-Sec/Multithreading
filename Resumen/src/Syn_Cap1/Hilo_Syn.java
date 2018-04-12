package Syn_Cap1;


public class Hilo_Syn extends Thread {
	//Variable Común a los Hilos
	private static int n = 0;
	
	public static int getN() {
		return n;
	}

	public void run() {
		
		synchronized(this) {
				n++;
		}
	}
}

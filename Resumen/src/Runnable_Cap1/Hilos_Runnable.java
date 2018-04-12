package Runnable_Cap1;

public class Hilos_Runnable implements Runnable {
	private static int n = 0; 
	
	@Override
	public void run() {
		
		for(int i = 0;i<100;++i) {
			n++;
			System.out.println(n);
		}
		
	}
}

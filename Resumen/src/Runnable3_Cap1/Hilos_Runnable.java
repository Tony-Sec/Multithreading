package Runnable3_Cap1;


public class Hilos_Runnable{
	private static int n = 0;
	
	
	public static void main(String[] args) {
		
		Runnable r = ()-> {
			
			System.out.println("Estoy en la funcion lambda... "+Thread.currentThread().getName());
			if(Thread.currentThread().getName().equals("h1")) {
				for(int i = 0;i<500;++i) {
					n++;
					System.out.println(n);
				}
			}
			if(Thread.currentThread().getName().equals("h2")) {
				for(int i = 0;i<500;++i) {
					n--;
					System.out.println(n);
				}
			}
			
		};
		
		Thread h1 = new Thread (r,"h1");
		Thread h2 = new Thread (r,"h2");
		

		h1.start();

		h2.start();
		
		try {
			Thread.currentThread().join();
		}catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
			System.out.println("El hilo "+Thread.currentThread().getName()+" se ha detenido....");
		}
	}
}

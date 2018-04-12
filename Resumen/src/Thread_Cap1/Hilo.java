package Thread_Cap1;

public class Hilo extends Thread {
	//Variable Común a los Hilos
	private static int n = 0;
	private static int nVueltas = 0;
	//Atributos
	private int op;
	
	public Hilo(int op){
		this.op=op;
	}

	public static void setnVueltas(int nVueltas) {
		Hilo.nVueltas = nVueltas;
	}

	public static int getN() {
		return n;
	}

	public void run() {
		switch(op) {
		case 1:
			for(int i = 0;i<nVueltas;++i)
				n++;
			break;
		case 2:
			for(int i = 0;i<nVueltas;++i)
				n--;
			break;
		}
	}
}

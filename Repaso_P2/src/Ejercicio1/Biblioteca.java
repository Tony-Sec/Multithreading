package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Biblioteca {
	
	private Paciente Consulta[];
	
	Biblioteca(){
		this.Consulta = new Paciente [10];
		for(int i=0; i <10;++i) {
			this.Consulta[i]=new Paciente();
		}
	}
	public Paciente getConsulta(int indice) {
		return Consulta[indice];
	}

	public void setConsulta(Paciente p,int indice) {
		this.Consulta[indice] = p;
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		
		Biblioteca pasillo1 = new Biblioteca();
		System.out.println("Insertar paciente en la consulta : ");
		System.out.println("Dni : ");
		pasillo1.Consulta[0].setDni(teclado.readLine());
		System.out.println("Nombre : ");
		pasillo1.Consulta[0].setNombre(teclado.readLine());
		System.out.println("Telefono : ");
		pasillo1.Consulta[0].setTelefono(Integer.parseInt(teclado.readLine()));
		System.out.println("Direccion : ");
		pasillo1.Consulta[0].setDireccion(teclado.readLine());
		System.out.println("Compañia de seguros : ");
		pasillo1.Consulta[0].setComp_seguro(teclado.readLine());
		
		
		System.out.println("Paciente con Dni "+pasillo1.Consulta[0].getDni()+"----------------------------\n"
				+ "Nombre : "+pasillo1.Consulta[0].getNombre()+"\n"
				+ "Tlf : "+pasillo1.Consulta[0].getTelefono()+"\n"
				+ "Direccion : "+pasillo1.Consulta[0].getDireccion()+"\n"
				+ "Compañia de Seguros : "+pasillo1.Consulta[0].getComp_seguro());
	}

}

package Ejercicio1;

public class Paciente {
	private String nombre;
	private String dni;
	private String direccion;
	private long telefono;
	private String comp_seguro;
	
	Paciente(){
		this.nombre = "";
		this.dni="";
		this.direccion= "";
		this.telefono = 0;
		this.comp_seguro="";
	}
	Paciente(String nombre,String dni,String direccion,long telefono,String comp_seguro){
		this.setNombre(nombre);
		this.setDni(dni);
		this.setDireccion(direccion);
		this.setTelefono(telefono);
		this.setComp_seguro(comp_seguro);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public String getComp_seguro() {
		return comp_seguro;
	}
	public void setComp_seguro(String comp_seguro) {
		this.comp_seguro = comp_seguro;
	}
	public void imp_paciente() {
		System.out.println("Paciente con Dni "+this.getDni()+"----------------------------\n"
				+ "Nombre : "+this.getNombre()+"\n"
				+ "Direccion : "+this.getDireccion()+"\n"
				+ "Tlf : "+this.getTelefono()+"\n"
				+ "Compañia de Seguros : "+this.getComp_seguro());
	}
	
}

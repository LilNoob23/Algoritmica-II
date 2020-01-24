package pe.edu.unmsm.agenda;

public class Contacto {

	String nombres;
	String apellidos;
	int edad;
	double salario;
	
	public Contacto() {
		nombres="";
		apellidos="";
		edad=0;
		salario=0;
	}
	
	public Contacto(String nombres, String apellidos, int edad, double salario) {
		
		this.nombres=nombres;
		this.apellidos=apellidos;
		this.edad=edad;
		this.salario=salario;
		
	}
	
	public void setNombres(String nombres) {
		this.nombres=nombres;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public void setSalario(double salario) {
		this.salario=salario;
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public double getSalario() {
		return salario;
	}
	
}


package ControlEscolar;

public class Persona {
	
	private String name;
	private int edad;
	private String genero;
	
	
	public Persona(String nombre, String genero, int edad) {
		this.name=nombre;
		this.genero=genero;
		this.edad=edad;
		
	}
	
	public String getname() {
		return name;
	}
	
	public String getgenero() {
		return genero;
	}
	
	public int getedad() {
		return edad;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public void setgenero(String genero) {
		this.genero=genero;
	}
	
	public void  setedad(int edad) {
		this.edad=edad;
	}
	
	
		
	

}

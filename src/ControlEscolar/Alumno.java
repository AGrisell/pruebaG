package ControlEscolar;

public class Alumno  extends Persona{
	 String matricula;
	 private char horario;
	 private String gpo;
	
	
	 
	 public Alumno(String name,String genero, int edad) {
		 super(name,genero,edad); 
	 
	}
	
	public String getmat() {
		return matricula;
	}
	
	public char gethorario() {
		return horario;
	}
	
	public String getgpo() {
		return gpo;
	}
	
	public void setmat(String matricula) {
		if (matricula==null )
			System.out.println("Matricula no valida");
		else
		  this.matricula=matricula;
	}
	
	public void sethorario(char horario) {
		if (horario !='M' )
			System.out.println("Matricula no valida");
		else
		    this.horario=horario;
	}
	
	public void  setgpo(String gpo) {
		if (matricula==null )
			System.out.println("Grupo no valida");
		else
		   this.gpo=gpo;
	}
	
	

}

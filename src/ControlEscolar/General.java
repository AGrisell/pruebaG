package ControlEscolar;
import java.util.Scanner;

public class General {
public static void main(String[] args) {
	
	Persona p1= new Persona("Anay","Mujer",37);
	
	System.out.println("El nombre de la persona es:"+p1.getname());
	System.out.println("La edad  de la persona es:"+p1.getedad());
	System.out.println("El genero de la persona es:"+p1.getgenero());
	
}
}

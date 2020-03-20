package Dominio;

public class Estudiante extends Persona{
	private double beca;

	public Estudiante(String nombre, String apellidos, int edad, double beca) {
		super(nombre, apellidos, edad);
		this.beca = beca;
	}

	public double getBeca() {
		return beca;
	}

	public void setBeca(double beca) {
		this.beca = beca;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", beca=" + beca + "]";

	}
	
}

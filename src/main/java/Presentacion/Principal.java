package Presentacion;

import Dominio.Estudiante;
import Dominio.Persona;

public class Principal {

	public static void main(String[] args) {

		Persona p1 = new Persona("Mario","Marugan",27);
		System.out.println(p1.toString());
		Persona p2 = new Estudiante("Fernando","Pérez",18,3000);
		System.out.println(p2.toString());
		System.out.println(((Estudiante)p2).getBeca());

	}

}

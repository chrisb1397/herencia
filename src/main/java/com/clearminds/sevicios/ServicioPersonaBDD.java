package com.clearminds.sevicios;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona{

	public boolean insertar(Persona persona) {
		System.out.println("Insertando persona en la BDD: "+persona);
		return true;
	}

	public boolean actualizar(Persona persona) {
		System.out.println("Actualiando persona en la BDD: "+persona);
		return true;
	}

	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona en la BDD: "+persona);
		return true;
	}

}

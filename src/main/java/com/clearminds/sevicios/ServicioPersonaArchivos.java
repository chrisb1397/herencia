package com.clearminds.sevicios;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaArchivos implements ServicioPersona{

	public boolean insertar(Persona persona) {
		System.out.println("Insertando persona en archivo: "+persona);
		return false;
	}

	public boolean actualizar(Persona persona) {
		System.out.println("Actualizanco persona en archivo: "+persona);
		return false;
	}

	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona en archivo: "+persona);
		return false;
	}

}

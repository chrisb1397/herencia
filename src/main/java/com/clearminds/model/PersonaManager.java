package com.clearminds.model;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.sevicios.ServicioPersonaArchivos;
import com.clearminds.sevicios.ServicioPersonaBDD;

public class PersonaManager {
	private ServicioPersona serv;
	
	public PersonaManager() {
		serv = new ServicioPersonaArchivos();
	}
	
	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}
}

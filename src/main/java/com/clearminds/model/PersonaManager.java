package com.clearminds.model;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.sevicios.ServicioPersonaBDD;

public class PersonaManager {
	private ServicioPersona serv;
	
	public PersonaManager() {
		serv = new ServicioPersonaBDD();
	}
	
	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}
}

package com.clearminds.model;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;


public class PersonaManager {
	private ServicioPersona serv;
	
	public PersonaManager() throws InstanceException{
		// serv = new ServicioPersonaArchivos();
		Class<?> clase;
		try {
			clase = Class.forName("com.clearminds.sevicios.ServicioPersonaBDD");
			serv=(ServicioPersona)clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} 
	}
	
	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}
}

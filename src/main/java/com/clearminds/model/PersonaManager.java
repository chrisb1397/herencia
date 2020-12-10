package com.clearminds.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;


public class PersonaManager {
	private ServicioPersona serv;
	
	public PersonaManager() throws InstanceException{
		// serv = new ServicioPersonaArchivos();
		Class<?> clase;	
		String servicio = obtenerServicio();
		
		try {
			clase = Class.forName("com.clearminds.sevicios."+servicio);
			serv=(ServicioPersona)clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} 
	}
	
	public String obtenerServicio(){
		String tipoServicio = null;
		Properties p = new Properties();
		try {
			p.load(new FileReader("config.properties"));
			tipoServicio = p.getProperty("tipoServicio");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			return null;
		} catch (IOException e1) {
			e1.printStackTrace();
			return null;
		}
		return tipoServicio;
	}
	
	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}
}

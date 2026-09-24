package co.edu.universidad.biblioteca.servicio;

//Preguntar como haria los imports y si estan bien los atributos
import java.util.Map;
import java.util.HashMap;

import co.edu.universidad.biblioteca.modelo.Material;
import co.edu.universidad.biblioteca.modelo.Usuario;

public class Biblioteca{
	private String nombre;
	private Map<String, Material> materiales;
	private Map<String, Usuario> usuarios;
	
	public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
	public String getNombre() {
   		return this.nombre;
	}	

}
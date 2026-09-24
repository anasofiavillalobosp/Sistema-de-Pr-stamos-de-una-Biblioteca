package co.edu.universidad.biblioteca.modelo;

import java.util.List;

public class Usuario{
	public static final int MAX_PRESTAMOS = 3;
	private String documento;
	private String nombre;
	private List<Material> prestamos;

}
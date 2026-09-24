package co.edu.universidad.biblioteca.modelo;

public abstract class Material implements Prestable{
/**
*El final garantiza que su valor NO se puede cambiar; una vez asignado 
*(en la declaración o en el constructor), no se puede cambiar, ni con SET.
*/
	//private final String codigo;
	private String titulo;
	private int anioPublicacion;
	private boolean prestado;

}
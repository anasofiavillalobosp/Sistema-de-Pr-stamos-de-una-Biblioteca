package co.edu.universidad.biblioteca;
//Las importe para que usar javac creara los bins
import co.edu.universidad.biblioteca.excepciones.PrestamoException;
import co.edu.universidad.biblioteca.modelo.Libro;
import co.edu.universidad.biblioteca.modelo.Material;
import co.edu.universidad.biblioteca.modelo.Revista;
import co.edu.universidad.biblioteca.modelo.Usuario;
import co.edu.universidad.biblioteca.servicio.Biblioteca;

public class App{
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
		//Para probar que sirve el codigo
		System.out.println("El nombre de la biblioteca es: " + biblioteca.getNombre());
	}
}
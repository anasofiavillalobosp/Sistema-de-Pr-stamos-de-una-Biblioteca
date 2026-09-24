package co.edu.universidad.biblioteca.excepciones;

/** 
*Contrato que controla los posibles errores para evitar que colapse el programa
*Una Exception define un error que puede pasar(en este caso el prestamo de materiales)
 */
public class PrestamoException extends Exception {
	/** Método que envia un mensaje del tipo de error del material prestado. */
	public PrestamoException(String mensaje) {
		super(mensaje);
    }
}
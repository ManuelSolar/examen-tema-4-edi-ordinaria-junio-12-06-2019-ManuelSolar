package examengithub;
/**
 * 
 * @author d18sobum
 *
 */
public class Persona {

	protected String nombre;
	protected String apellidos;
	protected String nif;

	public Persona() {
		super();
	}
/**
 * 
 * @return
 */
	protected String getNombre() {
		return nombre;
	}
/**
 * 
 * @param nombre
 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return
 */
	protected String getApellidos() {
		return apellidos;
	}
/**
 * 
 * @param apellidos
 */
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
/**
 * 
 * @return
 */
	protected String getNif() {
		return nif;
	}
/**
 * 
 * @param nif
 */
	protected void setNif(String nif) {
		this.nif = nif;
	}

}
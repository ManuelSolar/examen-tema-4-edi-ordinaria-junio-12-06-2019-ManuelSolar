package examengithub;

enum Curso {
	PRIMARIA, ESO, BACHILLERATO, UNIVERSIDAD
};
/**
 * 
 * @author d18sobum
 *
 */
public class Estudiante extends Persona{
	Curso curso;
	/**
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param curso
	 */
	protected Estudiante(String nombre, String apellidos, String nif,
			Curso curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.curso = curso;
	}

	/**
	 * 
	 * @return
	 */
	protected Curso getCurso() {
		return curso;
	}

	/**
	 * 
	 * @param curso
	 */
	protected void setCurso(Curso curso) {
		this.curso = curso;
	}

	
}

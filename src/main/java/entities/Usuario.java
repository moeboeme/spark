package entities;

public class Usuario {
	private String nombre;
	private String apellido;
	private String nombreDeUsuario;
	private String fotoDePerfil;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, String apellido, String nombreDeUsuario, String fotoDePerfil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreDeUsuario = nombreDeUsuario;
		this.fotoDePerfil = fotoDePerfil;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}
	
	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public String getFotoDePerfil() {
		return fotoDePerfil;
	}

	public void setFotoDePerfil(String fotoDePerfil) {
		this.fotoDePerfil = fotoDePerfil;
	}
}
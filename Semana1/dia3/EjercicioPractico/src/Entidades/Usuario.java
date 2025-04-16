package Entidades;

public class Usuario {
	private int idUser;
	private String username;
	private String email;
	private String contrasenia;
	private long telefono;

	public Usuario() {

	}

	public Usuario(int idUser, String username, String email, String contrasenia, long telefono) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.email = email;
		this.contrasenia = contrasenia;
		this.telefono = telefono;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Usuario [username=" + username +
				", email=" + email + ", contrasenia=" + contrasenia
				+ ", telefono="
				+ telefono + "]\n";
	}



}

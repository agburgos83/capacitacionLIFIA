package appLIFIA;

public class Usuario {
	
	//	ATRIBUTOS
	private String username;
	private String password;
	private String nombre;
	private String mail;
	private int fechaNacimiento;
	
	
	//	CONSTRUCTOR PUBLICO
	public Usuario(String username, String password, String nombre, String mail, int fechaNacimiento) {
		
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.mail = mail;
		this.fechaNacimiento = fechaNacimiento;
	}

	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}


	public int getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public static void add(Usuario unUsuario) {
		
	}
	
	
		
	
}

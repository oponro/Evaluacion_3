package Evaluacion_2.platinum;

public class Usuario {
	
	private String rut;
	private String username;
	private String password;
	
	public Usuario(String rut) {
		if(rut.trim().equals("") || rut == null) {
			throw new IllegalArgumentException("Ingrese Rut");
		}
			
		this.rut = rut;
		this.username = username;
		this.password = password;
	}
	
	public String getRut() {
		return rut;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	
}

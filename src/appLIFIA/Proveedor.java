package appLIFIA;

public class Proveedor {
	
	//	ATRIBUTOS
	private String nombreP;
	private int cuil;
	private String direccion;
	private Integer coordenadaX;
	private Integer coordenadaY;
	
	
	//	CONSTRUCTOR PUBLICO
	public Proveedor(String nombreP, int cuil, String direccion, Integer coordenadaX, Integer coordenadaY) {
		
		this.nombreP = nombreP;
		this.cuil = cuil;
		this.direccion = direccion;
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}


	
	public String getNombreP() {
		return nombreP;
	}
	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}


	public int getCuil() {
		return cuil;
	}
	public void setCuil(int cuil) {
		this.cuil = cuil;
	}


	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Integer getCoordenadaX() {
		return coordenadaX;
	}
	public void setCoordenadaX(Integer coordenadaX) {
		this.coordenadaX = coordenadaX;
	}


	public Integer getCoordenadaY() {
		return coordenadaY;
	}
	public void setCoordenadaY(Integer coordenadaY) {
		this.coordenadaY = coordenadaY;
	}



	public static void add(Proveedor unProveedor) {
		
	}

	

	
	
}

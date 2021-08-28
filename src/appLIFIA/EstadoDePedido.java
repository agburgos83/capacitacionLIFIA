package appLIFIA;

public abstract class EstadoDePedido {
	
	protected String nombreEstado;

	public static void main(String[] args) {
	}
	
	public abstract void enviar();
	public abstract void entregar();
	public abstract void cancelar();
	
	public void setNombreEstado(String unNombre) {
		nombreEstado = unNombre;
	}
	
	public String getNombreEstado() {
		return nombreEstado;
	}

}

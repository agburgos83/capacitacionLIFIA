package appLIFIA;

import java.util.*;

public class Producto {

	private String nombre;
	private float peso;
	private float precio;
	private LinkedList historial;
	private Date fechaPrecioInicio;
	private Date fechaPrecioFin;
	
	public Producto () {
	}
	
	public Producto (String unNombre, float unPeso, float unPrecio, 
			LinkedList unHistorial, Date unaFechaPrecioInicio, 
			Date unaFechaPrecioFin) {
		setNombre(unNombre);
		setPeso(unPeso);
		setPrecio(unPrecio);
		setHistorial(unHistorial);
		setFechaPrecioInicio(unaFechaPrecioInicio);
		setFechaPrecioFin(unaFechaPrecioFin);		
	}
	
	// instancia un producto e inicializa el historial
	public static void main(String[] args) {
		Producto producto = new Producto();
		LinkedList historial = new LinkedList();
	}
	
    public void setNombre(String unNombre) {
    	nombre = unNombre;
    }
	
	public String getNombre() {
		return nombre;
	}
	
    public void setPeso(Float unPeso) {
    	peso = unPeso;
    }
	
	public float getPeso() {
		return peso;
	}
	
    public void setPrecio(Float unPrecio) {
    	precio = unPrecio;
    }
	
	public float getPrecio() {
		return precio;
	}
	
    public void setHistorial(LinkedList unHistorial) {
    	historial = unHistorial;
    }
	
	public void getHistorial(LinkedList historial) {
		historial.forEach(System.out::println);
	}
	
    public void setFechaPrecioInicio(Date unaFecha) {
    	fechaPrecioInicio = unaFecha;
    }

	public Date getFechaPrecioInicio() {
		return fechaPrecioInicio;
	}
	
    public void setFechaPrecioFin(Date unaFecha) {
    	fechaPrecioFin = unaFecha;
    }

	public Date getFechaPrecioFin() {
		return fechaPrecioFin;
}
	
}
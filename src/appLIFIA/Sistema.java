package appLIFIA;

import java.util.LinkedList;

@SuppressWarnings("rawtypes")
public class Sistema {
	
	public static void main(String[] args) {
	
		Sistema soleInstance = new Sistema();
		LinkedList<Usuario> Usuario; 
		LinkedList<Proveedor> Proveedor;
	}
	
		
	//	CONSTRUCTOR PUBLICO
	public Sistema() {
		LinkedList Usuario = new LinkedList();
		LinkedList Proveedor = new LinkedList();
	}
			
			
	public static Sistema getInstance() {
		Object soleInstance = null; {
			if(soleInstance == null) {
				soleInstance = new Sistema();
			}
			return (Sistema) soleInstance;
		}
	}
		
		
	public LinkedList getUsuario() {
		return getUsuario();
	}
		
	public LinkedList getProveedor() {
		return getProveedor();
	}
		
	public void addProvedor(Proveedor unProveedor) {
		Proveedor.add(unProveedor);
	}
		
	public void addUsuario(Usuario unUsuario) {
		Usuario.add(unUsuario);
	}
		
}
		

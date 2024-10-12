import javax.swing.JOptionPane;

public class Producto {

	private String nombre;
	private double precio;
	private int cantidadEnStock;
	
	public Producto(String nombre,double precio,int cantidadEnStock) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadEnStock = cantidadEnStock;
	}
	
	// getter y setter de la variable nombre que se encuentra privada
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//getter y setter de la variable precio que está privada
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		if(precio > 0) {
			this.precio = precio;
		} else {
			JOptionPane.showMessageDialog(null, "El precio debe ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	//getter y setter de la variable CantidadEnStock que está privada
	public int getCantidadEnStock() {
		return cantidadEnStock;
	}
	public void setCantidadEnStock(int cantidadEnStock) {
		if(cantidadEnStock > 0 ) {
			this.cantidadEnStock = cantidadEnStock;
		} else {
			JOptionPane.showMessageDialog(null, "La cantidad en stock debe ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public void mostrarProducto() {
		System.out.println("Nombre: "+nombre+"\nPrecio: "+precio+"\nCantidad en stock: "+cantidadEnStock);
	}
	
}

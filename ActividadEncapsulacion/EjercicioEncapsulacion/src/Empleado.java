import javax.swing.JOptionPane;

public class Empleado {
	//Atributos privados
	
	private String nombre;
	private double salario;
	
	public Empleado(String nombre,double salario) {
		this.nombre = nombre;
		this.salario = salario;
	}
	
	//getter para obtener el nombre
	public String getNombre() {
		return nombre;
	}
	
	//setter para modificar el nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// getter para obtener el salario
	public double getSalario() {
		return salario;
	}
	
	//setter para modificar el salario
	public void setSalario(double salario) {
		
		if(salario > 0) {
			this.salario = salario;
		} else {
			JOptionPane.showMessageDialog(null, "El salario debe ser positivo", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Salario: $" + salario);
	}
	
}

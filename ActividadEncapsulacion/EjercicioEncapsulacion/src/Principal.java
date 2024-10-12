import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		// siguiendo pasos y probando
		/*
		//Crear un objeto de la clase empleado
		Empleado empleado = new Empleado("Daniel Bañol",5000000);
		
		empleado.mostrarInfo(); //mostrar la informacion del empleado por medio del metodo que se encuentra en la clase Empleado
		
		// Cambiar el nombre y salario usando setters
		empleado.setNombre("Daniel Bañol");
		empleado.setSalario(8000000);
		
		empleado.mostrarInfo(); //ver los datos actualizados
		
		// Intentar establecer un salario negativo
		empleado.setSalario(-1000.0); // Mostrará mensaje de error
		
		
		
		// acceder a producto 
		
		Producto producto = new Producto();
		producto.setNombre("Daniel Bañol");
		producto.setPrecio(0);
		producto.setCantidadEnStock(10);
		producto.mostrarProducto();
		*/
		
		
		// utilizar arraylist para almacenar datos de empleados
		/*
		 * // Crear una lista de empleados usando ArrayList
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		
		
		// Agregar empleados a la lista
		listaEmpleados.add(new Empleado("Juan Pérez", 3000.0));
		listaEmpleados.add(new Empleado("Carlos Ruiz", 3500.0));
		listaEmpleados.add(new Empleado("Ana Gómez", 4000.0));
		
		
		// Mostrar información de todos los empleados en la lista
		for (Empleado emp : listaEmpleados) {
		emp.mostrarInfo();
		System.out.println("----------");
		}
		
		// Modificar el salario del segundo empleado
		listaEmpleados.get(1).setSalario(3700.0);
		
		// Mostrar la información actualizada
		System.out.println("Información actualizada del segundo empleado:");
		listaEmpleados.get(1).mostrarInfo();
		
		// Eliminar al primer empleado de la lista
		listaEmpleados.remove(0);
		
		// Mostrar la lista después de eliminar
		System.out.println("\nLista de empleados después de eliminar al primero:");
		
		for (Empleado emp : listaEmpleados) {
		emp.mostrarInfo();
		System.out.println("----------");
		*/
		
		// Actividad final
		// Crear una lista de productos usando ArrayList
			ArrayList<Producto> listaProductos = new ArrayList<>();
			
		// añadir objetos a este arraylist 
			listaProductos.add(new Producto("Celular",500000,5));
			listaProductos.add(new Producto("Sofá", 1000000, 12));
			listaProductos.add(new Producto("Comedor", 2800000, 1));
			
		// bucle para imprimir la informacion de todos los productos
			for (Producto pro : listaProductos) {
				pro.mostrarProducto();
				System.out.println("----------");
				}
			
		// modificar el precio de uno de los productos, en este caso el primero
			listaProductos.get(0).setPrecio(2500000);
			listaProductos.get(0).mostrarProducto();
			
			
		// Eliminar el primer producto de la lista
			listaProductos.remove(0);
		
		// Mostrar la lista después de eliminar
		System.out.println("\nLista de empleados después de eliminar al primero:");
		
		for (Producto pro : listaProductos) {
		pro.mostrarProducto();
		System.out.println("----------");
		}
			
		   
		
		
	}

}

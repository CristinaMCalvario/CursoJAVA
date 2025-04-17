package Entidades;

import java.util.HashMap;

public class Metodos {
	private HashMap<String, Producto> productos ;

    public Metodos() {
        productos = new HashMap<>();
    }

    public void agregarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
        System.out.println("Producto agregado: " + producto.getCodigo());
    }

    public void buscarProducto(String codigo) {
        Producto p = productos.get(codigo);
        if (p != null) {
            System.out.println("Producto encontrado:");
            p.mostrarInformacion();
        } else {
            System.out.println("Producto no encontrado con código: " + codigo);
        }
    }

    public void eliminarProducto(String codigo) {
        if (productos.remove(codigo) != null) {
            System.out.println("Producto eliminado: " + codigo);
        } else {
            System.out.println("No se encontró el producto con código: " + codigo);
        }
    }
    public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(productos);
	}

}

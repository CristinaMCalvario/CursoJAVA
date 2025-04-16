package Principal;
//clase Object es la clase raiz on base de todas las clases
//si se usa en un hashMap o en una lista(ejemplo HashMap<Object,Object> estamos diciendo que 
//la clave como el valor pueden ser de cualquier tipo de dato o valor
public interface IMetodos {
	void guardar(Object key, Object values);
	
	void editar(Object key, Object values);
	void eliminar(Object key);
	Object buscar(Object key);
	void mostrar();
	
}

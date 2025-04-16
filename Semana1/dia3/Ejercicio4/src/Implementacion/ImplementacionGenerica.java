package Implementacion;

import java.util.HashMap;

import Principal.IMetodos;

public class ImplementacionGenerica implements IMetodos{
	
	//
	protected HashMap<Object,Object> hash = new HashMap<Object,Object>();

	@Override
	public void guardar(Object key, Object values) {
		// TODO Auto-generated method stub
		hash.put(key, values);
	}

	@Override
	public void editar(Object key, Object values) {
		// TODO Auto-generated method stub
		hash.replace(key, values);
	}

	@Override
	public void eliminar(Object key) {
		// TODO Auto-generated method stub
		hash.remove(key);
	}

	@Override
	public Object buscar(Object key) {
		// TODO Auto-generated method stub
		if(hash.containsKey(key)) {
			return hash.get(key);
		}else {
			return null;
		}
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
	}

	
	
}

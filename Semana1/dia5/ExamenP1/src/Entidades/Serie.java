package Entidades;

import Principal.IEntregable;

public class Serie implements IEntregable {
	private String titulo;
	private int numTem;
	private boolean entregado;
	private String genero;
	private String creador;
	
	
	//contructor por defecto Inicializado
	public Serie() {
		this.titulo = "Juego de tronos";
		this.numTem = 3;
		this.entregado = false;
		this.genero = "Drama";
		this.creador = "David Benioff";
	}
	//constructor con titulo y creador. 
	//El resto por defecto
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numTem = 3;
		this.entregado = false;
		this.genero = "Drama";
		
	}
	//constructor coon todos los atributos, excepto de entregado
	public Serie(String titulo, int numTem, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTem = numTem;
		this.genero = genero;
		this.creador = creador;
		this.entregado = false;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumTem() {
		return numTem;
	}
	public void setNumTem(int numTem) {
		this.numTem = numTem;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	@Override
	public String toString() {
		return "Serie [titulo= " + titulo + 
				", numero de Temporada= " + numTem + 
				", entregado= " + entregado +
				", genero= " + genero
				+ ", creador= " + creador + "]\n";
	}
	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		this.entregado = true;
		
	}
	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		this.entregado = false;
	}
	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return entregado;
	}
	@Override
	public int compareTo(Object a) {
		// TODO Auto-generated method stub
		if (a instanceof Serie) {
            Serie no = (Serie) a;
            return Integer.compare(this.numTem,
            		no.getNumTem());
        }
        return 0;
	}
	
	
	
	
	

}

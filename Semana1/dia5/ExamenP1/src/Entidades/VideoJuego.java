package Entidades;

import Principal.IEntregable;

public class VideoJuego implements IEntregable{
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compania;
	
	public VideoJuego() {
		this.titulo = "The Elder Scrolls V: Skyrim";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "Disparos";
		this.compania = "Bethesda Game Studios";
	}
	
	public VideoJuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "accion-aventura";
		this.compania = "";
	}

	public VideoJuego(String titulo, int horasEstimadas, String genero, String compania) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
		this.entregado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "VideoJuego [titulo=" + titulo + 
				", horasEstimadas=" + horasEstimadas + 
				", entregado=" + entregado
				+ ", genero=" + genero + 
				", compania=" + compania + "]\n";
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
		
		if (a instanceof VideoJuego) {
            VideoJuego no = (VideoJuego) a;
            return Integer.compare(this.horasEstimadas, 
            		no.getHorasEstimadas());
        }
		
		return 0;
	}
	
	
	
	
	
	

}

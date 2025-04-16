package com.mx.celular;

public class Celular {

	
		private String marca;
		private String modelo;
		private int ram;
		private String almac;
		private double precio;
		private String color;
		
		public Celular () {
			
		}
		
		public Celular(String marca, String modelo, int ram, String almac, double precio, String color) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.ram = ram;
			this.almac = almac;
			this.precio = precio;
			this.color = color;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getRam() {
			return ram;
		}

		public void setRam(int ram) {
			this.ram = ram;
		}

		public String getAlmac() {
			return almac;
		}

		public void setAlmac(String almac) {
			this.almac = almac;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "Celular [marca=" + marca + ", modelo=" + modelo + ", ram=" + ram + ", almac=" + almac + ", precio="
					+ precio + ", color=" + color + "]\n";
		}

		
	
		
		
		
		
	

}

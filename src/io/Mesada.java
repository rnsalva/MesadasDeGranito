package io;

public class Mesada implements Comparable<Mesada>{

	private double largo;
	private double ancho;
	
	public Mesada(double largo, double ancho) {
		this.largo = largo;
		this.ancho = ancho;
	}
	
	public Mesada(Mesada otra) {
		this.largo = otra.largo;
		this.ancho = otra.ancho;
	}

	public boolean puedeApilarse(Mesada otra){
		if(this.largo >= otra.largo && this.ancho >= otra.ancho)
			return true;
		return false;
	}

	@Override
	public int compareTo(Mesada otro) {
		return (int)(this.largo - otro.largo);
	}

}

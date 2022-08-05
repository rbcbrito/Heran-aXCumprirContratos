package model.entities;

import model.entities.enums.Color;

public class Circulo extends FormaAbstrata {

	private Double raio;

	public Circulo(Color color, Double raio) {
		super(color);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double area() {
		return Math.PI * raio * raio;
	}

}

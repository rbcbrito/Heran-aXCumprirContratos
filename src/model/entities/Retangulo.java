package model.entities;

import model.entities.enums.Color;

public class Retangulo extends FormaAbstrata {

	private Double altura;
	private Double base;

	public Retangulo(Color color, Double altura, Double base) {
		super(color);
		this.altura = altura;
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	@Override
	public Double area() {
		return altura * base;
	}

}

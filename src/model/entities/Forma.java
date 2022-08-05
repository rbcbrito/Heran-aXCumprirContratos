package model.entities;

import model.entities.enums.Color;

public abstract class Forma {

	private Color color;

	public Forma(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract Double area();

}

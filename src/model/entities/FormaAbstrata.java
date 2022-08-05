package model.entities;

import model.entities.enums.Color;

public abstract class FormaAbstrata implements Forma {

	private Color color;

	public FormaAbstrata(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}

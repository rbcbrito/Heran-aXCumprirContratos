package application;

import model.entities.Circulo;
import model.entities.FormaAbstrata;
import model.entities.Retangulo;
import model.entities.enums.Color;

public class Programa {

	public static void main(String[] args) {

		FormaAbstrata s1 = new Circulo(Color.BLACK, 2.0);
		FormaAbstrata s2 = new Retangulo(Color.WHITE, 3.0, 4.0);

		System.out.println("Cor do circulo: " + s1.getColor());
		System.out.printf("Area do circulo: " + String.format("%.3f%n", s1.area()));
		System.out.println("Cor do retangulo: " + s2.getColor());
		System.out.printf("Area do retangulo: " + String.format("%.3f", s2.area()));

	}

}

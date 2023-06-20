package model.entities;

import model.enums.Colors;

public class Circle extends AbstractShape {

	private double raio;

	public Circle() {
		super();
	}

	public Circle(Colors color, double raio) {
		super(color);
		this.raio = raio;
	}

	@Override
	public double area() {

		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public String toString() {

		return " Area: " + String.format("%.2f", area());
	}

}

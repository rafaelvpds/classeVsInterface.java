package model.entities;

import model.enums.Colors;

public class Retangle extends AbstractShape {
	private double width;
	private double lenght;

	public Retangle() {
		super();
	}

	public Retangle(Colors color, double width, double lenght) {
		super(color);
		this.width = width;
		this.lenght = lenght;
	}

	@Override
	public double area() {

		return width * lenght;
	}

	@Override
	public String toString() {

		return " Area: " + String.format("%.2f", area());

	}

}

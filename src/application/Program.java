package application;

import java.util.Locale;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Retangle;
import model.entities.Shape;
import model.enums.Colors;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		AbstractShape s1 = new Circle(Colors.BLACK, 2.0);
		AbstractShape s2 = new Retangle(Colors.RED, 4, 5);

		System.out.println("Circulo: " + s1.getColor() + s1);
		System.out.println("Retangulo: " + s2.getColor() + s2);

	}

}

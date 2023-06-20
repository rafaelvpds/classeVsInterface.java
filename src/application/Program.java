package application;

import java.util.Locale;

import model.entities.Circle;
import model.entities.Retangle;
import model.entities.Shape;
import model.enums.Colors;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Shape s1 = new Circle(Colors.valueOf("BLACK"), 2.0);
		Shape s2 = new Retangle(Colors.valueOf("RED"), 200, 500);

		System.out.println("Circulo: " + s1);
		System.out.println("Retangulo: " + s2);

	}

}

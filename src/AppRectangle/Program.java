package AppRectangle;

import java.util.Locale;
import java.util.Scanner;
import EntitiesRectangle.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height");
		System.out.print("height: ");
		rectangle.height = sc.nextDouble();
		System.out.print("width: ");
		rectangle.width = sc.nextDouble();

		System.out.printf("AREA= %.2f%n", rectangle.area());
		System.out.printf("PERIMETER= %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL= %.2f", rectangle.diagonal());

	}

}

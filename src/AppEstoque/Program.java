package AppEstoque;

import java.util.Locale;
import java.util.Scanner;

import EntitiesEstoque.Estoque;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Estoque estoque = new Estoque();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		estoque.name = sc.nextLine();
		System.out.print("Price: ");
		estoque.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		estoque.quantity = sc.nextInt(); 

		System.out.println();
		System.out.println("Product data: "+ estoque);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		estoque.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + estoque);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		estoque.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + estoque);
		
		sc.close();
	}

}

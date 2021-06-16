package EntitiesCombustivel;

import java.util.Scanner;

public class Combustivel {

	public int opcao;
	public int alcool, gasolina, diesel;

	public void Pesquisa() {

		Scanner sc = new Scanner(System.in);
		while (opcao != 4) {

			System.out.println("Digite o combustível desejado:\n 1-Álcool\n 2-Gasolina\n 3-Diesel\n 4-Fim");

			if (opcao == 1) {
				alcool++;
			}
			if (opcao == 2) {
				gasolina++;
			}
			if (opcao == 3) {
				diesel++;
			}
			opcao = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}
}
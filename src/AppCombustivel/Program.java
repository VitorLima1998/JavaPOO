package AppCombustivel;

import java.util.Scanner;

import EntitiesCombustivel.Combustivel;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Combustivel comb = new Combustivel();

		System.out.println("Digite o combustível desejado:\n 1-Álcool\n 2-Gasolina\n 3-Diesel");
		comb.opcao = sc.nextInt();
		comb.Pesquisa();
	}
}

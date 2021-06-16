package EntitiesSenha;

import java.util.Scanner;

public class Senha {

	public void Login(int password) {
		
		Scanner sc = new Scanner(System.in);
		while (password != 2002) {
			System.out.print("Senha inválida!");
			System.out.println("Digite uma senha: ");
			password = sc.nextInt();
		}

		System.out.println("Acesso permitido.");
		sc.close();

	}

}
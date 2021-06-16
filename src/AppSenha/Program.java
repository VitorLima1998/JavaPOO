package AppSenha;

import java.util.Locale;
import java.util.Scanner;
import EntitiesSenha.Senha;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Senha senha = new Senha();
		
		System.out.print("Digite uma senha: ");
		int pass = sc.nextInt();

		senha.Login(pass);

	}
}

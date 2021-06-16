package AppSalary;

import java.util.Locale;
import java.util.Scanner;
import EntitiesSalary.Salary;
import jdk.jfr.Percentage;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Salary salary = new Salary();

		System.out.print("Digite o nome do funcionário: ");
		salary.name = sc.nextLine();
		System.out.print("Digite o salário bruto do Funcionário: ");
		salary.grossSalary = sc.nextDouble();
		System.out.print("Digite a taxa: ");
		salary.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + salary);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		salary.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.printf("Update data: " + salary );
		sc.close();
	}
}

package AppStudent;

import java.util.Locale;
import java.util.Scanner;
import EntitiesStudent.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Digite o nome do aluno: ");
		student.name = sc.nextLine();
		System.out.print("Digite a primeira nota: ");
		student.n1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		student.n2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		student.n3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE= " + student.FinalGrade());
	}

}
